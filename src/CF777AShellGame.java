import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/1
 */
class CF777AShellGame {
    public static final int[][] MP = {{0,1,2},{1,0,2},{1,2,0},{2,1,0},{2,0,1},{0,2,1}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(MP[N % 6][m]);
    }
}
