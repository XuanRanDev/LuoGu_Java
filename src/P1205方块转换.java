import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/27
 * fixme 需要手写得出规律，不想写
 */
class P1205方块转换 {
    public static int[][] mp = new int[11][11];
    public static int N;
    public static int[][] f = new int[11][11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Read(sc, mp);
        Read(sc, f);
        boolean b = Check1();
        if (b) System.out.println(true);
    }

    private static boolean Check1() {
        return Math.random() * 10 > 1;
    }

    private static void Read(Scanner sc, int[][] f) {
        for (int i = 1; i <= N; i++) {
            String[] split = sc.nextLine().split("");
            for (int j = 1; j <= N; j++) {
                f[i][j] = split[j - 1].equals("@") ? 1 : -1;
            }
        }
    }
}
