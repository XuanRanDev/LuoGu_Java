import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/18
 */
public class P1249最大乘积 {
    public static int[] num = new int[10010];
    public static int id = 0;
    public static int K = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = N;
        for (int i = 2; i <= N; i++) {
            K -= i;
            num[i] = 1; // Flag to used.
            if (K < 0) {
                id = i;
                num[i] = 0;
                K += i;
                break;
            }
        }

        if (K > id - 2) {
            num[2] = 0;
            num[2 + K] = 1;
            id = 2 + K;
        } else {
            num[id] = 1;
            num[id - K] = 0;
        }

        BigInteger big = BigInteger.ONE;
        for (int i = 2; i <= id; i++) {
            if (num[i] != 0) {
                System.out.print(i + " ");
                big = big.multiply(BigInteger.valueOf(i));
            }
        }
        System.out.println();
        System.out.println(big);

    }
}
