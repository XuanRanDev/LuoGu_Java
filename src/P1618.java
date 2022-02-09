import java.util.HashMap;
import java.util.Scanner;

class P1618 {
    public static HashMap<Integer, Boolean> hashMap = new HashMap<>();
    public static boolean hasOutput = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int i = 100;
        if (A >= 100) i = 1;
        for (; i < 999; i++) {
            int num = i * A;
            int num2 = i * B;
            int num3 = i * C;
            if (CheckRepeat(num) && CheckRepeat(num2) && CheckRepeat(num3)) {
                System.out.printf("%d %d %d", num, num2, num3);
                System.out.println();
                hasOutput = true;
            }
            hashMap.clear();
        }
        if (!hasOutput) System.out.println("No!!!");
    }

    private static boolean CheckRepeat(int num) {
        while (num > 0) {
            int n = num % 10;
            if (hashMap.containsKey(n)) return false;
            hashMap.put(n, true);
            num /= 10;
        }
        return !hashMap.containsKey(0);
    }
}