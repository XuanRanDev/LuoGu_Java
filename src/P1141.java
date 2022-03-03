import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created By XuanRan on 2022/3/3
 */
class P1141 {
    public static final int MAX = 1000 + 10;
    public static final StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static int N, M;
    public static Queue<pair> queue = new LinkedList<>();
    public static int[] xx = new int[]{0, 1, 0, -1};
    public static int[] yy = new int[]{1, 0, 1, 0};
    public static int[][] mp = new int[MAX][MAX];
    public static int[][] flag = new int[MAX][MAX];

    public static void main(String[] args) {
        N = nextInt();
        M = nextInt();

        for (int i = 1; i <= N; i++) {
            String nextStr = nextStr();
            for (int j = 0; j < N; j++) {
                mp[i][j + 1] = nextStr.charAt(j);
            }
        }

        for (int i = 1; i <= M; i++) {
            int x = nextInt();
            int y = nextInt();
            int ans = 1;
            queue.offer(new pair(x, y, mp[x][y]));
            flag[x][y] = i; // 第M组数据经过，将数据标为M
            while (!queue.isEmpty()) {
                pair p = queue.remove();
                int dx = p.x;
                int dy = p.y;
                int status = p.status;

                if (Check(mp[dx][dy], status) && flag[dx][dy] != i) {
                    ans++;
                    flag[dx][dy] = i;
                }

                for (int j = 0; j < 4; j++) {
                    int fx = xx[i] + dx;
                    int fy = yy[i] + dy;

                    if (fx >= 1 && fx <= N && fy >= 1 && fy <= N && flag[fx][fy] != i) {
                        pair p2 = new pair(fx, fy, mp[fx][fy]);
                        queue.offer(p2);
                    }
                }
            }
            System.out.println(ans);

        }


    }

    /**
     * @param num    要检查的数组
     * @param status 上一个状态
     * @return 是否符合要求
     */
    public static boolean Check(int num, int status) {
        if (status == 0 && num == 1) return true;
        return status == 1 && num == 0;
    }

    public static int nextInt() {
        try {
            input.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) input.nval;
    }

    public static String nextStr() {
        try {
            input.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input.sval;
    }
}

class pair {
    int x, y;
    int status;

    public pair(int x, int y, int status) {
        this.x = x;
        this.y = y;
        this.status = status;
    }
}
