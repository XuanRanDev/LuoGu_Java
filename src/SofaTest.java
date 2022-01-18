import org.junit.Test;

import java.math.BigInteger;

/**
 * Created By XuanRan on 2022/1/16
 */
public class SofaTest {

    @Test
    public void TestBigInteger() {
        BigInteger big = BigInteger.ONE;

        for (int i = 1; i <= 5; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }

    @org.junit.Test
    public void TestQuickPow() {
        int a = 2;
        int b = 99911;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res *= a;
            b >>= 1;
            a *= a;
        }
        System.out.println(res);
    }
}
