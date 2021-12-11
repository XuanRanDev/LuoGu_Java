import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/11
 */
public class P1098字符串的展开 {
    public static int P1, P2, P3;
    public static String data;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        String a = sc.next();
        String b = sc.next();

        System.out.println(checkLianXu(a.charAt(0),b.charAt(0)));

        System.exit(0);*/

        P1 = sc.nextInt();
        P2 = sc.nextInt();
        P3 = sc.nextInt();
        data = sc.next();

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (c == '-') {

                if (i - 1 < 0 || i + 1 >= data.length()) {
                    System.out.print('-');
                    continue;
                }

                char s = data.charAt(i - 1);
                char e = data.charAt(i + 1);

                if (checkXiangLin(s, e)) {
                    continue;
                }

                if (!checkLianXu(s, e)) {
                    System.out.print('-');
                    continue;
                }
                if (P3 == 1) {
                    System.out.print(reverseStringForward(s, e, P2, P1));
                    continue;
                } else {
                    System.out.print(reverseStringReverse(s, e, P2, P1));
                    continue;
                }
            }
            System.out.print(c);
        }

    }

    private static boolean checkXiangLin(char s, char e) {
        int startASCII = (int) s;
        int endASCII = (int) e;

        return startASCII + 1 == endASCII;
    }

    /**
     * 返回连续的字符
     *
     * @param s     从哪个字符开始
     * @param e     哪个字符结束
     * @param count 单个字符重复几次
     * @param type  填充类型
     *              1 小写
     *              2 大写
     *              3 *
     * @return 结果
     */
    public static String reverseStringForward(char s, char e, int count, int type) {
        StringBuilder sb = new StringBuilder();
        int startASCII = (int) s;
        int endASCII = (int) e;

        for (int i = s + 1; i <= e - 1; i++) {
            for (int j = 1; j <= count; j++) {
                char c = (char) i;
                if (type == 1) { //小写模式
                    if (!isNum(c)) {
                        if (!isCapital(c)) c = (char) (c + 32); //大写转小写
                    }
                } else if (type == 2) {
                    if (!isNum(c)) {
                        if (isCapital(c))
                            c = (char) (c - 32);
                    }
                } else if (type == 3) {
                    c = '*';
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isNum(char c) {
        return (c >= 49 && c <= 57);
    }

    /**
     * 返回连续的字符
     *
     * @param s     从哪个字符开始
     * @param e     哪个字符结束
     * @param count 单个字符重复几次
     * @param type  填充类型
     *              1 小写
     *              2 大写
     *              3 *
     * @return 结果
     */
    public static String reverseStringReverse(char s, char e, int count, int type) {
        StringBuilder sb = new StringBuilder();
        int startASCII = (int) s;
        int endASCII = (int) e;

        for (int i = e - 1; i >= s + 1; i--) {
            for (int j = 1; j <= count; j++) {
                char c = (char) i;
                if (type == 1) { //小写模式
                    if (!isNum(c)) {
                        if (isCapital(c)) c = (char) (c + 32); //大写转小写
                    }
                } else if (type == 2) {
                    if (!isNum(c)) {
                        if (isCapital(c))
                            c = (char) (c - 32);
                    }
                } else if (type == 3) {
                    c = '*';
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 检查字符是大写的还是小写的
     *
     * @param c 要检查的字符
     * @return 大写 true
     * 小写 false
     */
    public static boolean isCapital(char c) {
        return !(c >= 49 && c <= 57);
    }

    public static boolean checkLianXu(char s, char e) {
        int startASCII = (int) s;
        int endASCII = (int) e;

        if ((endASCII <= startASCII || startASCII + 1 == endASCII)) { //检查是否符合重复标准
            return false;
        }

        return (startASCII >= 48 && endASCII <= 57) || (startASCII >= 65 && endASCII <= 65 + 32) || (startASCII >= 97 && endASCII <= 97 + 35);
    }
}
