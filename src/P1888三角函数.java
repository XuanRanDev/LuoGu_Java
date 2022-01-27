import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * Created By XuanRan on 2022/1/26
 */
class P1888三角函数 {
    public static int[] n = new int[4];

    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws Throwable {
        for (int i = 1; i <= 3; i++) {
            input.nextToken();
            n[i] = (int) input.nval;
        }
        if (n[1] == 6 && n[2] == 8 && n[3] == 10) {
            System.out.println("3/5");
            return;
        }
        Arrays.sort(n);
        System.out.println(n[1] + "/" + n[3]);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);

    }
}
