import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/3/3
 * fixme 未通过
 */
class P1141 {
    public static int N, M;
    public static int[][] mp = new int[1020][1010];
    public static int[][] vis = new int[1030][1030];
    public static int[] xx = new int[]{0, 0, 1, -1};
    public static int[] yy = new int[]{1, -1, 0, 0};
    public static int ans = 0;
    public static Queue<Node> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String next = sc.next();
            for (int j = 0; j < next.length(); j++) {
                mp[i][j + 1] = next.charAt(j) - '0';
            }
        }
        while (M-- > 0) {
            for (int i = 1; i <= N; i++) {
                Arrays.fill(vis[i], 0);
            }
            ans = 1;
            int x = sc.nextInt();
            int y = sc.nextInt();
            queue.offer(new Node(x, y));
            vis[x][y] = 1;

            while (!queue.isEmpty()) {
                Node node = queue.remove();
                int dx = node.x;
                int dy = node.y;

                int cur = mp[dx][dy];

                for (int i = 0; i < 4; i++) {
                    int fx = dx + xx[i];
                    int fy = dy + yy[i];

                    if (fx >= 1 && fx <= N && fy >= 1 && fy <= N && vis[fx][fy] != 1) {
                        if (cur != mp[fx][fy]) {
                            vis[fx][fy] = 1;
                            queue.offer(new Node(fx, fy));
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }

    private static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
