import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/24
 */
class P1010 {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        spiltNum(N);
    }

    // 2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0)
    //2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0)
    public static void spiltNum(int num) {
        if (num != 0) {
            int m = 0, res = 1;
            System.out.print("2");
            while (res <= num) {
                m++;
                res *= 2;
            }
            m--;
            res -= res / 2;
            if (m == 0 || m == 2) System.out.printf("(%d)", m);
            if (m >= 3) {
                System.out.print("(");
                spiltNum(m);
                System.out.print(")");
            }
            if ((num - res) != 0) {
                System.out.print("+");
                spiltNum(num - res);
            }
        }
    }
}
