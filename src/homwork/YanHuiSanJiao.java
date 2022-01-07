package homwork;

import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/7
 */
class YanHuiSanJiao {
    public static final int[][] dp = new int[100][100];
    public static int ans = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1][1] = 1;

        for (int i = 2; ; i++) {
            for (int j = 1; j <= n * 2; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                if (dp[i][j] != 0) ans++;
                if (dp[i][j] == n) {
                    System.out.println(ans);
                    return;
                }
            }
        }



    }
}
