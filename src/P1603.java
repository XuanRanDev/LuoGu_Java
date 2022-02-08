import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/2/8
 */
class P1603 {
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static int[] ans = new int[10];
    public static int flag;

    public static void main(String[] args) {
        String[] e = "one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty".split(" ");
        for (int i = 1; i <= e.length; i++) {
            hashMap.put(e[i - 1], i);
        }
        hashMap.put("a", 1);
        hashMap.put("another", 1);
        hashMap.put("first", 1);
        hashMap.put("both", 2);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");

        for (int i = 0; i < split.length; i++) {
            Integer integer = hashMap.get(split[i].toLowerCase(Locale.ROOT));
            if (integer != null) {
                ans[flag++] = integer * integer;
            }
        }
        Arrays.sort(ans);
        boolean hasOutPut = false;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0) {
                if (ans[i] < 10 && hasOutPut) System.out.print(0);
                System.out.print(ans[i]);
                if (!hasOutPut) hasOutPut = true;
            }
        }
        if (flag == 0) System.out.println(0);

    }
}
