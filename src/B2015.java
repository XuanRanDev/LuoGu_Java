import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/2/17
 */
class B2015 {
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        double r1 = nextDouble();
        double r2 = nextDouble();
        System.out.printf("%.2f", 1 / ((1 / r1) + (1 / r2)));
    }

    public static double nextDouble() {
        try {
            input.nextToken();
            return input.nval;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1.0;
    }
}
