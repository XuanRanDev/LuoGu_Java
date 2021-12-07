import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/7
 */
public class P5725求三角形 {
    public static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        int f1 = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (f1 <= 9){
                    System.out.print(0);
                }
                System.out.print(f1++);
            }
            System.out.println();
        }

        System.out.println();

        int f2 = 1;

        int K = N - 1;
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= K; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= N-K; j++) {
                if (f2 <= 9){
                    System.out.print(0);
                }
                System.out.print(f2++);
            }

            System.out.println();
            K--;
        }
    }
}
