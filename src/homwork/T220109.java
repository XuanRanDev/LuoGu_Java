package homwork;

import java.util.Arrays;
import java.util.Scanner;

public class T220109 {
    public static int N, SUM, ttt;
    public static boolean[] flag = new boolean[20]; // N <= 10
    public static int[] num = new int[20];
    public static int[] ans = new int[20];

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            num[i] = i;
        }
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        SUM = sc.nextInt();

        dfs(1);
    }

    private static void dfs(int index) {
        if (ttt == 1) {
            return;
        }
        if (index == N + 1) {
            if (dpVeify() == SUM) {
                printInfo();
                ttt = 1;
            }
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!flag[i]) {
                flag[i] = true;
                ans[index] = i;
                dfs(index + 1);
                flag[i] = false;
            }
        }
//        System.out.println("无");
    }

    private static int dpVeify() {
        int i;
        int j;
        int[] b = new int[11];
        for (i = 1; i <= N; i++) {
            b[i] = ans[i];
        }
        for (i = N; i > 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                b[j] = b[j] + b[j + 1];
            }
            b[i] = 0;
        }
        return b[1];
    }

    private static void printInfo() {
        for (int i = 1; i <= N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}