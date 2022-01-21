import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/21
 * fixme 未完成
 */
class P1590失踪的7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int x = scanner.nextInt();
            System.out.println(x - (x / 10));
        }
    }
}
