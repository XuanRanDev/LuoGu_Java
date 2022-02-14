import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/14
 */
class B2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nextDouble = sc.nextDouble();
        System.out.printf("%.5f", 5 * (nextDouble - 32) / 9);
    }
}
