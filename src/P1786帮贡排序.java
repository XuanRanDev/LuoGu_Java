import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/12
 * 未完成
 */
public class P1786帮贡排序 {
    public static int[] ZW = {0, 1, 2, 2, 4, 7, 25};
    public static int N;
    public static person[] p = new person[110 + 10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            p[i] = new person(sc.next(),
                    sc.next(),
                    sc.nextLong(),
                    sc.nextInt());
        }

        Arrays.sort(p, 1, N);
        for (int i = 1; i <= N; i++) {
            System.out.print(p[i].name + " " + getZhiWeiFromint(i) + " " + p[i].level);
            System.out.println();
        }

    }

    private static String getZhiWeiFromint(int zhihui) {
        if (zhihui == 1) return "BangZhu";
        if (zhihui == 2 || zhihui == 3) return "FuBangZhu";
        if (zhihui == 4 || zhihui == 5) return "HuFa";
        if (zhihui >= 6 && zhihui <= 9) return "ZhangLao";
        if (zhihui >= 9 + 1 && zhihui <= 9 + 8) return "TangZhu";
        if (zhihui >= 9 + 9 && zhihui <= 18 + 25) return "JingYing";
        return "BangZhong";
    }

    static class person implements Comparable<person> {
        String name;
        int zhihui;
        long banggong;
        int level;

        public person(String name, String zhihui, long banggong, int level) {
            this.name = name;
            this.zhihui = getLevel(zhihui);
            this.banggong = banggong;
            this.level = level;
        }

        @Override
        public int compareTo(person o) {

            if ((this.zhihui == 1 || this.zhihui == 2) && (o.zhihui == 1 || o.zhihui == 2)) {
                if (this.zhihui > o.zhihui) return 1;
                if (this.zhihui < o.zhihui) return -1;
                return 0;
            }

            if (this.banggong == o.banggong) {
                if (this.level * this.banggong > o.level * o.banggong) return 1;
                if (this.level * this.banggong < o.level * o.banggong) return -1;
                return 0;
            }

            return (int) (o.banggong - this.banggong);

        }

        public int getLevel(String zw) {
            if (zw.equals("BangZhu")) return 1;
            if (zw.equals("FuBangZhu")) return 2;
            if (zw.equals("HuFa")) return 3;
            if (zw.equals("ZhangLao")) return 4;
            if (zw.equals("TangZhu")) return 5;
            if (zw.equals("JingYing")) return 6;
            if (zw.equals("BangZhong")) return 7;
            return 8;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", zhihui=" + zhihui +
                    ", banggong=" + banggong +
                    ", level=" + level +
                    '}';
        }
    }
}
