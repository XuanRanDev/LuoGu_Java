import javax.swing.*;
import java.io.*;

/**
 * Created By XuanRan on 2021/12/3
 */
public class P3817小A的糖果{
    public static int MAXN = (int) 1e3;
    public static int N;
    public static int X;
    public static int ans;

    private static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        N = nextInt();
        X = nextInt();

        long[] A = new long[N + 100];

        for (int i = 1; i <= N; i++) {
            A[i] = nextInt();
        }

        for (int i = 1; i <= N; i++) {
            if (A[i] > X && i == 1) {
                long y = A[i] - X;
                ans += y;
                A[i] -= y;
            }

            if (A[i] + A[i - 1] > X) {
                long y = (A[i] + A[i - 1]) - X;
                ans += y;
                A[i] -= y;
            }
        }
        out.print(ans);
    }

    private static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}