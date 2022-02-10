import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/2/10
 */
class P4924 {
    public static int N, M;
    public static int x, y, r, z;
    public static int[][] mp = new int[550][550];
    public static StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        N = nextInt();
        M = nextInt();
        init();
        for (int i = 1; i <= M; i++) {
            run(nextInt(), nextInt(), nextInt(), nextInt());
        }
    }

    private static void run(int x, int y, int r, int z) {
    }

    private static void init() {
        int num = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                mp[i][j] = num++;
            }
        }
    }

    public static int nextInt() {
        try {
            streamTokenizer.nextToken();
            return (int) streamTokenizer.nval;
        } catch (IOException e) {
            System.exit(1);
            e.printStackTrace();
        }
        return 0;
    }
}
