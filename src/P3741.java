import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/30
 */
class P3741 {
    public static int ans;
    public static int[] f = new int[105];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line = sc.next();
        boolean flag = true;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'V' && i + 1 < line.length() && line.charAt(i + 1) == 'K') {
                ans++;
                f[i] = -1;
                f[i + 1] = -1;
            }
        }
        for (int i = 0; i < line.length(); i++) {
            if (!flag || i + 1 >= line.length()) break;
            if (line.charAt(i) == line.charAt(i + 1) && f[i] != -1 && f[i + 1] != -1) {
                ans++;
                flag = false;
            }
        }

        System.out.println(ans);

    }
}
