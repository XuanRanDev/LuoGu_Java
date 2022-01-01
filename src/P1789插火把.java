import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/31
 */
class P1789插火把 {
    public static int N, M, K;
    public static int mp[][] = new int[105][105];
    public static final int[] xx = {2, 0, -2, 0, 1, 1, 1, 0, 0, 0, -1, -1, -1};
    public static final int[] yy = {0, 2, 0, -2, 0, 1, -1, 1, 0, -1, 0, 1, -1};
    public static final int[] xx2 = {-2, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
    public static final int[] yy2 = {-2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2};
    public static int ans = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

        ans = N * N;

        for (int i = 1; i <= M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            DFSFlag(x, y);
        }


        for (int i = 1; i <= K; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            DFSFLAG2(x, y);
        }



        ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (mp[i][j]==0) {
                    ans ++;
                }
            }
        }

        System.out.println(ans);

    }

    private static void DFSFLAG2(int x, int y) {
        for (int i = 0; i < xx2.length; i++) {
            int dx = xx2[i] + x;
            int dy = yy2[i] + y;

            if (dx >= 1 && dy >= 1 && dx <= N && dy <= N) {
                mp[dx][dy] = -2;
                ans--;
            }
        }
    }

    private static void DFSFlag(int x, int y) {
        for (int i = 0; i < xx.length; i++) {

            int dx = xx[i] + x;
            int dy = yy[i] + y;

            if (dx >= 1 && dy >= 1 && dx <= N && dy <= N) {
                mp[dx][dy] = -1;
                ans--;
            }

        }
    }


}
