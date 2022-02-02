import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/30
 * fixme
 */
class P1321 {
    public static int ans, res;
    public static int[] ans_Flag = new int[280];
    public static int[] res_Flag = new int[280];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'b' && i + 2 < chars.length && chars[i + 1] == 'o' && chars[i + 2] == 'y') {
                ans++;
                ans_Flag[i] = -1;
                ans_Flag[i + 1] = -1;
                ans_Flag[i + 2] = -1;
            }

            if (chars[i] == 'g' && i + 3 < chars.length && chars[i + 1] == 'i' && chars[i + 2] == 'r' && chars[i + 3] == 'l') {
                res++;
                res_Flag[i] = -1;
                res_Flag[i + 1] = -1;
                res_Flag[i + 2] = -1;
                res_Flag[i + 3] = -1;
            }

        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'b' && i + 2 < chars.length && chars[i + 1] != '.' && chars[i + 2] != '.' && ans_Flag[i] != -1) {
                ans++;
            }
            if (chars[i] == 'o' && i - 1 >= 0 && i + 1 < chars.length && chars[i - 1] != '.' && chars[i + 1] != '.' && ans_Flag[i] != -1) {
                ans++;
            }
            if (chars[i] == 'y' && i - 2 >= 0 && chars[i - 1] != '.' && chars[i - 2] != '.' && ans_Flag[i] != -1) {
                ans++;
            }

            if (chars[i] == 'g' && i + 3 < chars.length && chars[i + 1] != '.' && chars[i + 2] != '.' && chars[i + 3] != '.' && res_Flag[i] != -1) {
                res++;
            }
            if (chars[i] == 'i' && i - 1 >= 0 && i + 2 < chars.length && chars[i - 1] != '.' && chars[i + 1] != '.' && chars[i + 2] != '.' && res_Flag[i] != -1) {
                res++;
            }
            if (chars[i] == 'r' && i - 2 >= 0 && i + 1 < chars.length && chars[i - 1] != '.' && chars[i - 2] != '.' && chars[i + 1] != '.' && res_Flag[i] != -1) {
                res++;
            }

            if (chars[i] == 'l' && i - 3 >= 0 && chars[i - 1] != '.' && chars[i - 2] != '.' && chars[i - 2] != '.' && chars[i + 1] != '.' && res_Flag[i] != -1) {
                res++;
            }


        }
        System.out.println(ans);
        System.out.println(res);
    }
}
