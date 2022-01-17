import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;

/**
 * Created By XuanRan on 2022/1/15
 * fixme 暂未完成 70分
 */
class P1045麦森数 {
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static int N;
    public static final BigInteger res2 = BigInteger.ONE;

    public static void main(String[] args) throws Throwable {
        input.nextToken();
        N = (int) input.nval;
        input = null;
        String res = QuickPow(new BigInteger("2"), N).subtract(BigInteger.ONE).toString();
        int len = res.length();
        int flag = 0;
        System.out.println(len);
        if (len < 500) {
            for (int i = 1; i <= 500 - len; i++) {
                if (flag == 50) {
                    System.out.println();
                    flag = 0;
                }
                flag++;
                System.out.print(0);
            }
            for (int i = 0; i < len; i++) {
                if (flag == 50) {
                    System.out.println();
                    flag = 0;
                }
                flag++;
                System.out.print(res.charAt(i));
            }
            return;
        } else if (len == 500) {
            for (int i = 0; i < len; i++) {
                if (flag == 50) {
                    System.out.println();
                    flag = 0;
                }
                flag++;
                System.out.print(res.charAt(i));
            }
        } else {
            for (int i = len - 500; i <= len - 1; i++) {
                if (flag == 50) {
                    System.out.println();
                    flag = 0;
                }
                flag++;
                System.out.print(res.charAt(i));
            }
        }


    }

    public static BigInteger QuickPow(BigInteger num, int b) {
        //  long start = System.currentTimeMillis();
        BigInteger res = BigInteger.ONE;
        while (b > 0) {
            if (((b & 1) == 1)) res = res.multiply(num);
            b >>= 1;
            num = num.multiply(num);
        }
        // System.out.println("计算时间：" + (System.currentTimeMillis() - start));
        return res;
    }
}
