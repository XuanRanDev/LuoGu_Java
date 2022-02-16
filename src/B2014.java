import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/16
 */
class B2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nextDouble = sc.nextDouble();
        System.out.printf("%.4f %.4f %.4f", nextDouble * 2, nextDouble * 2 * 3.14159, 3.14159 * nextDouble * nextDouble);
    }
}
