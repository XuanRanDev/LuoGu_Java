import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/22
 * fixme 不会这道题
 */
class P1834三子棋 {
    public static int[] mp = new int[10];
    public static int[][] index = {{1, 2, 3}, {1, 4, 7}, {1, 5, 9}, {2, 5, 8}, {3, 6, 9}, {3, 5, 7}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("");
        for (int i = 0; i < data.length; i++) {
            int n = Integer.parseInt(data[i]);
            mp[n] = i % 2 != 0 ? -1 : -2; //xiao a  / uim
            if (i > 3) Check();
        }
        System.out.println(Arrays.toString(mp));
    }

    private static void Check() {
        for (int i = 0; i < index.length; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                int index = P1834三子棋.index[i][j];
                if ( ==-1){
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("xiaoa wins.");
                System.exit(0);
            }
        }
        for (int i = 0; i < index.length; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (index[i][j] == -2) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("xiaoa wins.");
                System.exit(0);
            }
        }
    }
}
