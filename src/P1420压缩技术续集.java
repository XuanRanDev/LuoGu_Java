import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/8
 * 当数组大小开很大时，记得特判结尾0的情况
 * 因为数组某人值是0会造成其不断增加最后没有保存
 */
class P1420压缩技术续集 {
    public static int[][] mp = new int[305][305];
    public static int[] ans = new int[150];
    public static int index = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cur = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("")) break;
            String[] data = line.split("");
            for (int i = 1; i <= data.length; i++) {
                mp[Cur][i] = Integer.parseInt(data[i - 1]);
            }
            Cur++;
        }
        Cur--; // 减去最后一步多增加的1
        ans[index++] = Cur;
        int curFlag = 0;
        int times = 0;
        for (int i = 1; i <= Cur + 1; i++) {
            for (int j = 1; j <= Cur; j++) {

                if (i > Cur) {
                    ans[index++] = times;
                    break;
                }

                if (mp[i][j] == 0) {
                    if (curFlag == 0) {
                        times++;
                    } else {
                        ans[index++] = times;
                        times = 1;
                        curFlag = 0;
                    }
                } else {
                    if (curFlag == 1) {
                        times++;
                    } else {
                        ans[index++] = times;
                        times = 1;
                        curFlag = 1;
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= ans.length - 1; i++) {
            if (i != 1) sum += ans[i];
            if (ans[2] == 0 && i != 2 && ans[i] == 0) return;
            System.out.print(ans[i] + " ");

            if (sum == Cur * Cur) return;
        }

    }
}
