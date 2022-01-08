import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created By XuanRan on 2022/1/8
 */
class P2911BovineBonesG {
    public static int a, b, c;
    public static int[] m = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    int sum = i + j + k;
                    m[sum]++;
                }
            }
        }


        int ans = m[1]; // 标记最小那个数字
        int res = 1; // 标记最小那个数字的次数
        for (int i = 2; i < m.length; i++) {
            if (m[i] > ans) {
                ans = m[i];
                res = i;
            }
        }
        System.out.println(res);

    }


}
