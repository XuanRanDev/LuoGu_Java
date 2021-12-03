import java.io.*;
import java.util.Arrays;

/**
 * Created By XuanRan on 2021/12/3
 */
public class P1177快速排序 {

    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintStream out = System.out;
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int N = nextInt();
        int[] arr = new int[N + 100];
        for (int i = 1; i <= N; i++) {
            arr[i] = nextInt();
        }
        Arrays.sort(arr, 1, N + 1);
        for (int i = 1; i <= N; i++) {
            builder.append(arr[i]).append(" ");
        }
        out.println(builder.toString());
    }

    private static int nextInt() throws Exception {
        in.nextToken();
        return (int) in.nval;
    }

    private static String next() throws Exception {
        in.nextToken();
        return in.sval;
    }
}
