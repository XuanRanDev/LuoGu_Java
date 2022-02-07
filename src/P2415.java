import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/7
 * 其实这题我没懂...
 */
class P2415 {
    public static int num;
    public static int he;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            he += Integer.parseInt(split[i]);
            num++;
        }
        System.out.println((he) * QuickPow(2, num - 1));
    }


    private static long QuickPow(int num, int pf) {
        long res = 1;

        while (pf > 0) {

            if ((pf & 1) == 1) res *= num;
            pf >>= 1;
            num *= num;

        }
        return res;
    }
}
