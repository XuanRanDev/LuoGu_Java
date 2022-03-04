import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created By XuanRan on 2022/3/4
 */
class P1162 {
    public static final StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static int N;
    public static Queue<Node> queue = new LinkedList<>();
    public static int[][] mp = new int[35][35];
    public static int[][] vis = new int[35][35];
    public static int[] xx = new int[]{0, 1, 0, -1};
    public static int[] yy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        N = nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                mp[i][j] = nextInt();
            }
        }
        queue.offer(new Node(0, 0));
        vis[0][0] = 1;

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            int fx = node.x;
            int fy = node.y;

            for (int i = 0; i < 4; i++) {
                int dx = fx + xx[i];
                int dy = fy + yy[i];
                if (dx >= 0 && dx <= N + 1 && dy >= 0 && dy <= N + 1 && vis[dx][dy] != 1 && mp[dx][dy] == 0) {
                    vis[dx][dy] = 1;
                    queue.offer(new Node(dx, dy));
                }
            }

        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (mp[i][j] == 0 && vis[i][j] == 1) {
                    System.out.print(0);
                } else if (mp[i][j] == 0 && vis[i][j] == 0) {
                    System.out.print(2);
                } else {
                    System.out.print(1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }


    }

    public static int nextInt() {
        try {
            input.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) input.nval;
    }

    private static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
