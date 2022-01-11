import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * Created By XuanRan on 2022/1/11
 */
class P5741旗鼓相当的对手加强版 {
    public static int N;
    public static student[] stu = new student[1050];
    public static final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {
        in.nextToken();
        N = (int) in.nval;
        for (int i = 1; i <= N; i++) {
            stu[i] = new student(nextString(), nextInt(), nextInt(), nextInt());
        }
        Arrays.sort(stu, 1, N);
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (Math.abs(stu[i].total - stu[j].total) <= 10 && Math.abs(stu[i].yuwen - stu[j].yuwen) <= 5 && Math.abs(stu[i].shuxue - stu[j].shuxue) <= 5 && Math.abs(stu[i].yingyu - stu[j].yingyu) <= 5) {
                    System.out.println(stu[i].name + " " + stu[j].name);
                }
            }
        }
    }

    private static String nextString() {
        try {
            in.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in.sval;
    }

    private static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) in.nval;
    }

    static class student implements Comparable<student> {

        String name;
        int yuwen, shuxue, yingyu, total;

        public student(String name, int yuwen, int shuxue, int yingyu) {
            this.name = name;
            this.yuwen = yuwen;
            this.shuxue = shuxue;
            this.yingyu = yingyu;
            this.total = yuwen + shuxue + yingyu;
        }

        @Override
        public int compareTo(student o) {
            return this.name.compareTo(o.name);
        }
    }
}
