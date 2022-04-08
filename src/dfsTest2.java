import java.util.Scanner;

/**
 * Created by XuanRan on 2022/4/8
 */
public class dfsTest2 {
    public static int[] N = new int[5];
    public static int ans;
    public static int left, right, min = 0x7ffffff;
    public static int[][] mp = new int[5][25];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= N[i]; j++) {
                mp[i][j] = sc.nextInt();
            }
            left = 0;
            right = 0;
            min = 0x7ffffff;
            dfs(i, 1, N[i] + 1);
            ans += min;
        }

        System.out.println(ans);
    }

    /**
     * 搜索
     *
     * @param index 当前是第几门科目
     * @param start 从第几道题开始
     * @param end   到第几道题结束
     */
    private static void dfs(int index, int start, int end) {
        if (start > end) {
            // Update
            min = Math.min(min, Math.max(left, right));
            return;
        }
        // 暴力遍历每一种结果
        left += mp[index][start]; //这道题所产生的影响
        dfs(index, start + 1, end); //执行搜索
        left -= mp[index][start]; // 如果搜索到达瓶颈，回溯该次搜索结果

        // right..
        right += mp[index][start]; //这道题所产生的影响
        dfs(index, start + 1, end); //执行搜索
        right -= mp[index][start]; // 如果搜索到达瓶颈，回溯该次搜索结果
    }
}
