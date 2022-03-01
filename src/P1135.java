import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/3/1
 */
class P1135 {
    public static int N, A, B;
    public static int[] num = new int[205];
    public static int[] flag = new int[205];
    public static Queue<Integer> q = new LinkedList<>();
    public static Queue<Integer> step = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            num[i] = sc.nextInt();
        }
        q.offer(A);
        step.offer(0);
        flag[A] = 1;
        while (!q.isEmpty() && !step.isEmpty()) {
            int cur = q.remove();
            int ans = step.remove();

            if (cur == B) {
                System.out.println(ans);
                return;
            }
            int add = cur + num[cur];
            int min = cur - num[cur];

            if (add > 0 && add <= N && flag[add] != 1) {
                q.offer(add);
                step.offer(ans + 1);
                flag[add] = 1;
            }

            if (min > 0 && min <= N && flag[min] != 1) {
                q.offer(min);
                step.offer(ans + 1);
                flag[min] = 1;
            }


        }

        System.out.println(-1);
    }
}
