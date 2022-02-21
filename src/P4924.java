import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/2/10
 */
class P4924 {
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static int[][] mp = new int[510][510];
    public static int[] num = new int[510 * 510 + 100];
    public static int x, y, r, z;
    public static int N, M;
    public static int index = 1;
    public static int MAXN = 510 * 510;

    public static void main(String[] args) {
        N = nextInt();
        M = nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                num[index] = index++;
                mp[i][j] = nextInt();
            }
        }

        for (int i = 1; i <= 4; i++) {
            x = nextInt();
            y = nextInt();
            r = nextInt();
            z = nextInt();
            
        }

    }


    public static int nextInt() {

        try {
            input.nextToken();
            return (int) input.nval;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
