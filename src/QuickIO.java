import java.io.*;

/**
 * Created By XuanRan on 2021/12/3
 * 快速IO模板
 */
public class QuickIO {

    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in), 32768));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static double nextDouble() throws IOException {
        in.nextToken();
        return in.nval;
    }

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    public static void main(String[] args) throws IOException {
        String s = next();
        out.println(s);

        out.flush();
        out.close();

    }
}
