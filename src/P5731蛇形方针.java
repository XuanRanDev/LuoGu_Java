import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/9
 */
public class P5731蛇形方针 {
    public static int[][] mp = new int[100][100];
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int K = 1;
        int x = 1;
        int y = 0;
        while (K <= N * N){

            while (mp[x][y + 1] == 0 && y < N) mp[x][++y] = K++;
            while (mp[x + 1][y] == 0 && x < N) mp[++x][y] = K++;
            while (mp[x][y - 1] == 0 && y > 1) mp[x][--y] = K++;
            while (mp[x - 1][y] == 0 && x > 1) mp[--x][y] = K++;

//            break;

            /*while (mp[x][y] == 0 && y < N) mp[x][y++]  = K++;
            while (mp[x][y] == 0 && x < N) mp[x++][y] = K++;
            while (mp[x][y] == 0 && y > 1) mp[x][y--] = K++;
            while (mp[x][y] == 0 && x > q++) mp[x--][y] = K++;
            print();

            */
        }
        print();

    }

    static void print(){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.printf("%3d",mp[i][j]);
/*                for (int k = 1; k <= getLen(mp[i][j]) + 1; k++) {
                    System.out.print(" ");
                }
                System.out.print(mp[i][j]);*/
            }
            System.out.println();
        }
    }
    static int getLen(int x){
        int ans = 0;
        while (x / 10 != 0){
            x /= 10;
            ans++;
        }
        return ans;
    }
}
