import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;

/**
 * Created By XuanRan on 2022/1/16
 */
class P1591数码阶乘 {
    public static final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static int ans;

    public static void main(String[] args) throws Throwable {
        in.nextToken();
        int N = (int) in.nval;
        for (int i = 1; i <= N; i++) {
            in.nextToken();
            int M = (int) in.nval;
            in.nextToken();
            int A = (int) in.nval;
            String res = getJC(new BigInteger(String.valueOf(M))).toString();
            char ac = (char) (A + '0');
            for (int i1 = 0; i1 < res.length(); i1++) {
                char c = res.charAt(i1);
                if (c == ac) ans++;
            }
            System.out.println(ans);
            ans = 0;
        }
    }

    public static BigInteger getJC(BigInteger bigInteger) {
        if (bigInteger.toString().equals("1")) return bigInteger;
        return bigInteger.multiply(getJC(bigInteger.subtract(BigInteger.ONE)));
    }
}
