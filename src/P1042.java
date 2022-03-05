import java.util.Scanner;

/**
 * Created By XuanRan on 2022/3/5
 */
class P1042 {
    public static int N;
    public static String str = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            str += line;
            if (line.contains("E")) {
                break;
            }
        }
        Check(11);
        System.out.println();
        Check(21);
    }

    private static void Check(int num) {
        boolean hasOutPut = true;
        int w = 0, l = 0;
        for (int i = 0; str.charAt(i) != 'E'; i++) {
            if (str.charAt(i) == 'W') w++;
            else l++;
            if ((w >= num && w - l >= 2) || (l >= num && l - w >= 2)) {
                System.out.printf("%d:%d\n", w, l);
                hasOutPut = false;
                w = 0;
                l = 0;
            }
        }
        System.out.printf("%d:%d\n", w, l);
    }
}
