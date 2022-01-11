import java.util.HashMap;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/11
 * fixme 看不懂题目
 */
class P1603斯诺登的密码 {

    public static String f = "one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty";
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static String temp[];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String d = input.nextLine();

        String data[] = d.split(" ");
        temp = f.split(" ");

        String ans = "";

        for (String s : data) {
            int num = getNum(s);
            if (num != 0) {
                ans += String.valueOf(Quick_Pow(num, 2));
            }

        }

        System.out.println(ans);


    }

    private static int Quick_Pow(int num, int pf) {
        int res = 1;

        while (pf > 0) {

            if ((pf & 1) == 1) res *= num;
            pf >>= 1;
            num *= num;

        }
        return res;
    }


    private static int getNum(String s) {
        for (int i = 0; i < temp.length; i++) {
            if (s.equals(temp[i])) {
                return i + 1;
            }
        }
        return 0;
    }


}
