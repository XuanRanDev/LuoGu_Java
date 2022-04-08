import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created by XuanRan on 2022/4/8
 */
public class QuickSort {
    public static int N;
    public static int MAX = (int) (1e5 + 2000);
    public static int[] num = new int[MAX];
    public static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        N = nextInt();
        for (int i = 1; i <= N; i++) {
            num[i] = nextInt();
        }
        quickSort(1, N);
        for (int i = 1; i <= N; i++) {
            System.out.print(num[i] + " ");
        }
    }


    /**
     * 快速排序
     *
     * @param left  从哪一项开始
     * @param right 到哪一项结束
     */
    private static void quickSort(int left, int right) {
        int mid = num[(left + right) / 2];
        int i = left;
        int k = right;
        do {
            while (num[i] < mid) i++;
            while (num[k] > mid) k--;
            if (i <= k) {
                int temp = num[i];
                num[i] = num[k];
                num[k] = temp;
                i++;
                k--;
            }
        } while (i <= k);
        // swap
        if (left < k) quickSort(left, k);
        if (i < right) quickSort(i, right);
    }

    public static int nextInt() {
        try {
            input.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) input.nval;
    }
}
