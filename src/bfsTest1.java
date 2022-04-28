import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by XuanRan on 2022/4/8
 */
public class bfsTest1 {
    public static int N, M, x, y;
    public static int[][] mp = new int[500][500];
    public static int[] xx = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
    public static int[] yy = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
    public static Queue<Node> queue = new LinkedList<>();
    public static int[][] vis = new int[500][500];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            Arrays.fill(mp[i], 9999);
        }

        vis[x][y] = -1;
        mp[x][y] = 0;
        queue.offer(new Node(x, y, 0));

        while (!queue.isEmpty()) {
            Node remove = queue.remove();
            int fx = remove.x;
            int fy = remove.y;
            int step = remove.step;

            for (int i = 0; i < 8; i++) {
                int dx = fx + xx[i];
                int dy = fy + yy[i];

                if (dx >= 1 && dx <= N && dy >= 1 && dy <= M && vis[dx][dy] != -1) {
                    vis[dx][dy] = -1;
                    queue.offer(new Node(dx, dy, step + 1));
                    mp[dx][dy] = Math.min(mp[dx][dy], step + 1);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (mp[i][j] == 9999) {
                    System.out.printf("%-5d", -1);
                    continue;
                }
                System.out.printf("%-5d", mp[i][j]);

            }
            System.out.println();
        }
    }

    private static class Node {
        int x, y, step;

        public Node(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
}
