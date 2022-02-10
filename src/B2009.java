import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/10
 */
class B2009 {
    public static int[] ans = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            ans[i] = sc.nextInt();
        }

        System.out.println((ans[1] + ans[2]) / ans[3]);
    }
}
