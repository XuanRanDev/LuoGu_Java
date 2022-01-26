import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * Created By XuanRan on 2022/1/25
 */
class P5717三角形分类 {
    public static int[] n = new int[4];
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws Throwable {
        for (int i = 1; i <= 2 + 1; i++) {
            input.nextToken();
            n[i] = (int) input.nval;
        }
        Arrays.sort(n);
        if (n[1] + n[2] <= n[3]) {
            System.out.println("Not triangle");
            return;
        }
        CheckRightAngle();
        CheckAcuteAngle();
        CheckObtuseAngle();
        CheckIsoscelesAngle();
        CheckEquilateralAngle();
    }

    private static void CheckIsoscelesAngle() {
        if (n[1] == n[2] || n[1] == n[3] || n[2] == n[3]) System.out.println("Isosceles triangle");
    }

    private static void CheckEquilateralAngle() {
        if (n[1] == n[2] && n[1] == n[3]) System.out.println("Equilateral triangle");
    }

    private static void CheckObtuseAngle() {
        int n1 = QuickPower(n[1], 2);
        int n2 = QuickPower(n[2], 2);
        int n3 = QuickPower(n[3], 2);
        if (n1 + n2 < n3) System.out.println("Obtuse triangle");
    }

    private static void CheckAcuteAngle() {
        int n1 = QuickPower(n[1], 2);
        int n2 = QuickPower(n[2], 2);
        int n3 = QuickPower(n[3], 2);
        if (n1 + n2 > n3) System.out.println("Acute triangle");
    }

    private static void CheckRightAngle() {
        int n1 = QuickPower(n[1], 2);
        int n2 = QuickPower(n[2], 2);
        int n3 = QuickPower(n[3], 2);
        if (n1 + n2 == n3) System.out.println("Right triangle");
    }

    private static int QuickPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res *= a;
            b >>= 1;
            a *= a;
        }
        return res;
    }
}
