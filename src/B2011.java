import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/2/13
 */
class B2011 {
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        double a = nextDouble();
        double b = nextDouble();
        System.out.printf("%.9f", a / b);
    }

    public static double nextDouble() {
        try {
            input.nextToken();
            return input.nval;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}
