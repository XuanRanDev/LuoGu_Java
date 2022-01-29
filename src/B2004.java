import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/29
 */
class B2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] m = new long[4];
        for (int i = 1; i <= 3; i++) {
            m[i] = sc.nextLong();
            System.out.printf("%8d ", m[i]);
        }
    }
}
