import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/19
 */
class P1179数字统计 {
    public static StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        for (int i = l; i <= r; i++) {
            int a = i;
            while (a > 0) {
                int e = a % 10;
                if (e == 2) ans++;
                a /= 10;
            }
        }

        System.out.println(ans);

    }
}
