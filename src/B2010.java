import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/12
 */
class B2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("%d %d",n / m,n % m);
    }
}
