import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/21
 */
class P1634禽兽的传染病 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        long N = sc.nextLong();
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = ans * T + ans;
        }
        System.out.println(ans);
    }
}
