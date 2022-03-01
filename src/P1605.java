import java.util.Scanner;

/**
 * Created By XuanRan on 2022/3/1
 */
class P1605 {
    public static int N, M, T;
    public static int MAX = 8;
    public static int SX, SY, FX, FY;
    public static int[] xx = new int[]{0, 0, 1, -1};
    public static int[] yy = new int[]{1, -1, 0, 0};
    public static int[][] mp = new int[MAX][MAX];
    public static int[][] flag = new int[MAX][MAX];
    private static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        SX = sc.nextInt();
        SY = sc.nextInt();
        FX = sc.nextInt();
        FY = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            mp[x][y] = -1; // 代表是障碍物
        }
        flag[SX][SY] = 1;
        dfs(SX, SY);
        System.out.println(ans);

    }

    private static void dfs(int x, int y) {
        if (x == FX && y == FY) {
            ans++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int dx = x + xx[i];
            int dy = y + yy[i];
            if (dx >= 1 && dx <= N && dy >= 1 && dy <= M && mp[dx][dy] != -1 && flag[dx][dy] != 1) {
                flag[dx][dy] = 1;
                dfs(dx, dy);
                flag[dx][dy] = 0;
            }
        }
    }
}
