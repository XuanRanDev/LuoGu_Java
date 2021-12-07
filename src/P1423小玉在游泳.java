import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/7
 */
public class P1423小玉在游泳 {
    public static double x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        double cur = 2;
        int res = 1;
        for (double i = 2 * 0.98; i <= 1000 && cur < x; i = i * 0.98) {
            cur += i;
            res++;
            if (cur >= x) {
                System.out.println(res);
                break;
            }

        }
    }
}
