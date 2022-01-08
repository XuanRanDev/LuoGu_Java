import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/8
 */
class P1319压缩技术 {
    public static int[][] mp = new int[205][205];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = true; // 标记
        int sx = 1, sy = 1;
        int sum = 0;
        while (sum != N * N) {
            flag = !flag;
            int m = sc.nextInt();
            sum += m;
            for (int i = 1; i <= m; i++) {
                if (sy > N) {
                    sx++;
                    sy = 1;
                }
                if (flag) {
                    mp[sx][sy++] = 1;
                } else {
                    mp[sx][sy++] = 0;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(mp[i][j]);
            }
            System.out.println();
        }
    }
}
