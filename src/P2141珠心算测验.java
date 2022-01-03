import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/2
 */
class P2141珠心算测验 {

    private static int ans;
    public static final int[] vis = new int[10000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] m = new int[N];

        for (int i = 0; i < N; i++) {
            m[i] = scanner.nextInt();
        }
        //Arrays.sort(m);

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int x = m[i] + m[j];
                for (int k = 0; k < N; k++) {
                    if (x == m[k] && i != k && j != k && vis[x] != -1 ) {
                        vis[x] = -1;
                       // System.out.println("" + m[i] + " + " + m[j] + " = " + (m[i] + m[j]) + "|" + k);
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
