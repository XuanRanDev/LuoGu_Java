import java.util.Scanner;

public class dfsTest {

    public static int ans;
    public static int N, M, T;
    public static int Sx, Sy, Fx, Fy;
    public static int[][] mp = new int[8][8];
    public static int[][] vis = new int[8][8];
    public static int[] xx = {0, 1, 0, -1};
    public static int[] yy = {1, 0, -1, 0};

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        Sx = sc.nextInt();
        Sy = sc.nextInt();
        Fx = sc.nextInt();
        Fy = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            mp[x][y] = -1; // 使用-1来标记障碍点
        }

        vis[Sx][Sy] = -1;
        dfs(Sx, Sy);

        System.out.println(ans);
    }

    private static void dfs(int sx, int sy) {
        if (sx == Fx && sy == Fy) {
            ans++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int dx = xx[i] + sx;
            int dy = yy[i] + sy;
            if (dx >= 1 && dx <= N && dy >= 1 && dy <= M && vis[dx][dy] != -1 && mp[dx][dy] != -1) {
                vis[dx][dy] = -1;
                dfs(dx, dy);
                vis[dx][dy] = 0;
            }
        }
    }
}