import java.util.Scanner;

/**
 * Created by XuanRan on 2022/04/08
 */
public class QuickPow {
    public static int A, B, P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        P = sc.nextInt();

        System.out.printf("%d^%d mod %d=%d", A, B, P, quickPow(A, B, P));
    }

    public static long quickPow(long a, long b, long p) {
        if (a == 1 && b == 0 && p == 1) return 0;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % p;
            }
            b >>= 1;
            a = a * a % p;
        }
        return res;
    }


}
