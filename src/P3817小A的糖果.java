import java.io.*;

/**
 * Created By XuanRan on 2021/12/3
 */
public class P3817小A的糖果 {
    public static int MAXN = (int) 1e9;
    public static int N;
    public static int X;
    public static int[] A = new int[MAXN];

    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static String next() throws IOException {
        in.nextToken();
        return (String) in.sval;
    }


    public static void main(String[] args) throws IOException {
        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            break;
        }
        int a = (int) in.nval;
        int b = nextInt();
        int c = nextInt();
        out.println((a + b )* c);
        out.flush();
        out.close();

    }
}
