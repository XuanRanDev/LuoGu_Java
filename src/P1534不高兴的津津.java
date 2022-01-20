import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/20
 */
class P1534不高兴的津津 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        int cur = 0;
        for (int i = 1; i <= N; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            cur += ((s + e) - 8);
            ans += cur;
        }
        System.out.println(ans);
    }
}
