import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/1/27
 */
class P1205方块转换 {
    public static int[][] mp = new int[11][11];
    public static int N;
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws Throwable {
        input.nextToken();
        N = (int) input.nval;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                input.nextToken();
                mp[i][j] = input.sval == '@' ? -1 : 1;
            }
        }
    }
}
