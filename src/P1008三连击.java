import java.util.HashMap;

/**
 * Created By XuanRan on 2022/1/11
 */
class P1008三连击 {
    public static HashMap<Integer, Boolean> hashMap = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 101; i <= 999; i++) {
            if (check(i) && check(i * 2) && check(i * 3)) {
                System.out.println(i + " " + (i * 2) + " " + (i * 3));
            }
            hashMap.clear();
        }
    }

    private static boolean check(int i) {
        while (i > 0) {
            int a = i % 10;
            if (hashMap.containsKey(a)) {
                return false;
            }
            hashMap.put(a, true);
            i /= 10;
        }
        return !hashMap.containsKey(0);
    }
}
