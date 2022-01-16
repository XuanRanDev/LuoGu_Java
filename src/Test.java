import java.math.BigInteger;

import org.junit.*;

/**
 * Created By XuanRan on 2022/1/13
 */
public class Test {

    @org.junit.Test
    public void TestP1045() {
        System.out.println("AA");
    }

    @org.junit.Test
    public void TestP1591() {
        System.out.println(P1591数码阶乘.getJC(new BigInteger("5")));
    }

    @org.junit.Test
    public void TestBigInteger() {
        BigInteger b = new BigInteger("222222222222222244444444444294874742920208274724464");
        String res = b.toString();
        System.out.println("res截取Test：" + res.substring(0, res.length() - 1));
        String end = res.substring(res.length() - 1, res.length());
        int n = Integer.parseInt(end) - 1;
        System.out.println(end);
        System.out.println(res.substring(0, res.length() - 1) + n);
//        System.out.println("截取操作：" +res.charAt(res.length() - 1));
    }

    @org.junit.Test
    public void TestChar() {
        int A = 2;
        System.out.println((char) A + '0');
    }
}
