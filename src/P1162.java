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
        queue.offer(new Node(1, 1));
        vis[1][1] = 1;

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            int fx = node.x;
            int fy = node.y;

            for (int i = 0; i < 4; i++) {
                int dx = fx + xx[i];
                int dy = fy + yy[i];
                /**
                 * 为什么要+1 ？
                 * 因为在搜索边界的情况下最后一行可能被全部覆盖
                 */
//                if (dx >= 1 && dx <= N + 1)
            }

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
