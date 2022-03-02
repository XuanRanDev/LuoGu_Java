import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/3/2
 */
class P4924 {
    public static final StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static final int MAX = 510;
    public static int N, M;
    public static int index = 1;
    public static int[][] mp = new int[MAX][MAX];
    public static int[] action = new int[10];

    public static void main(String[] args) {
        N = nextInt();
        M = nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                mp[i][j] = index++;
            }
        }
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= 4; j++) {
                action[i] = nextInt();
            }
            int x = action[1];
            int y = action[2];
            int r = action[3];
            int z = action[4];

            int distance = 2 * r + 1;

            if (z == 0) {
                for (int j = x; j <= distance; j++) {
                    for (int k = y; k <= distance; k++) {
                        mp[i][j] = 1;
                        // TODO 该去旋转图像了 太复杂了 不想写
                    }
                }
            }
        }


        /**
         * n = 3 情况下
         * 1,1 > 1,3
         * 1,2 > 2,3
         * 1,3 > 3,3
         * 2,1 > 1,2
         * 2,2 > 2,2
         * 2,3 > 3,2
         * 3,1 > 1,1
         * 3,2 > 2,1
         * 3,3 > 3,1
         */


    }

    public static int nextInt() {
        try {
            input.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) input.nval;
    }
}
