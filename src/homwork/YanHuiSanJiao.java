package homwork;

import java.util.Scanner;

public class YanHuiSanJiao {

    static int N;

    public static void main(String[] args) {
        run();
    }


    public static void run() {
        N = new Scanner(System.in).nextInt();
        if (N == 1) System.out.println(1);
        else {
            long ans = (N + 1L) * N / 2 + 2;
            for (int m = 2; m < 16; m++) {
                int start = m * 2, end = N;
                while (start <= end) {
                    int mid = start + end >> 1;
                    if (C(mid, m) == N) {
                        ans = min(ans, (mid + 1L) * mid / 2 + m + 1);
                        break;
                    }
                    if (C(mid, m) > N) end = mid - 1;
                    else start = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }

    public static long min(long a, long b) {
        return a < b ? a : b;
    }

    public static long C(int n, int m) {
        long num = 1;
        for (int nm = 1; nm <= m; n--, nm++)
            if ((num = num * n / nm) > N) return num;
        return num;
    }
}