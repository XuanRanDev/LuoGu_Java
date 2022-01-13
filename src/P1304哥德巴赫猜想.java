import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/13
 */
class P1304哥德巴赫猜想 {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 4; i <= N; i += 2) {
            for (int j = 2; j <= i / 2; j++) {
                if (isPrime(j) && isPrime(i - j)) {
                    System.out.printf("%d=%d+%d", i, j, i - j);
                    System.out.println();
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 2) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
