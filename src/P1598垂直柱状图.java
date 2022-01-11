import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/11
 */
class P1598垂直柱状图 {
    public static String str = "";
    public static int[] mp = new int[27];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            String info = sc.nextLine();
            str += info;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 65 || c > 65 + 26) continue;
            mp[c - 64]++;
        }
        int max = Arrays.stream(mp).max().getAsInt();
        for (int i = max; i >= 1; i--) {
            for (int j = 1; j <= 26; j++) {
                if (mp[j] == i) {
                    System.out.print("* ");
                    mp[j]--;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 65; i <= 65 + 26 - 1; i++) {
            char c = (char) i;
            System.out.print(c + " ");
        }
    }
}
