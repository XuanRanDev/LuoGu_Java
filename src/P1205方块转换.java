import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/27
 * fixme 需要手写得出规律，不想写
 */
public class P1205方块转换 {
    public static int[][] mp = new int[11][11];
    public static int N;
    public static int[][] f = new int[15][15];
    public static int[][] temp = new int[11][11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Read(sc, mp);
        Read(sc, f);
        int[][] res = Check1(mp);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }


    private static int[][] Check1(int[][] sz) {
        int[][] a = new int[11][11];
        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= N; j++) {
                a[i][j] = sz[j][i];
            }
        }
        return a;
    }


    private static void Read(Scanner sc, int[][] f) {
        for (int i = 1; i <= N; i++) {
            String[] split = sc.nextLine().split("");
            for (int j = 1; j <= split.length; j++) {
                f[i][j] = split[j - 1].equals("@") ? 1 : -1;
            }
        }
    }
}
