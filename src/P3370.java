import java.util.HashMap;
import java.util.Scanner;

/**
 * Created ByN XuanRan on 2022/2/11
 */
class P3370 {
    public static HashMap<String, Boolean> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            String next = sc.next();
            if (!hashMap.containsKey(next)) {
                hashMap.put(next, true);
            }
        }
        System.out.println(hashMap.size());
    }
}
