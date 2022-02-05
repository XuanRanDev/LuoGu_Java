import java.util.Scanner;

/**
 * Created By XuanRan on 2022/02/05
 * 好像这道题我想的太复杂了...
 */
public class P1321 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int boyCount = 0, girlCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == 'b') {
                boyCount++;
            } else if (chars[i] == 'o' && chars[i - 1] != 'b') {
                boyCount++;
            } else if (chars[i] == 'y' && chars[i - 1] != 'o') {
                boyCount++;
            } else if (chars[i] == 'g') {
                girlCount++;
            } else if (chars[i] == 'i' && chars[i - 1] != 'g') {
                girlCount++;
            } else if (chars[i] == 'r' && chars[i - 1] != 'i') {
                girlCount++;
            } else if (chars[i] == 'l' && chars[i - 1] != 'r') {
                girlCount++;
            }
        }
        System.out.println(boyCount);
        System.out.println(girlCount);
    }
}
