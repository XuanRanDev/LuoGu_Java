import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/1/1
 */
class P2615神奇的幻方 {
    public static final int N = 40;
    public static final int[][] mp = new int[N][N];
    public static int k = 1;
    public static ArrayList<info> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        mp[1][getMID(n)] = 1;
        arrayList.add(new info(1, getMID(n)));
        for (int i = 2; i <= n * n; i++) {
            if (getInfo().x == 1 && getInfo().y != n) {
                mp[n][getInfo().y + 1] = i;
                arrayList.add(new info(n, getInfo().y + 1));
                continue;
            }
            if (getInfo().x != 1 && getInfo().y == n) {
                mp[getInfo().x - 1][1] = i;
                arrayList.add(new info(getInfo().x - 1, 1));
                continue;
            }
            if (getInfo().x == 1 && getInfo().y == n) {
                mp[getInfo().x + 1][getInfo().y] = i;
                arrayList.add(new info(getInfo().x + 1, getInfo().y));
                continue;
            }
            if (getInfo().x != 1 && getInfo().y != n) {
                if (mp[getInfo().x - 1][getInfo().y + 1] == 0) {
                    mp[getInfo().x - 1][getInfo().y + 1] = i;
                    arrayList.add(new info(getInfo().x - 1, getInfo().y + 1));
                } else {
                    mp[getInfo().x + 1][getInfo().y] = i;
                    arrayList.add(new info(getInfo().x + 1, getInfo().y));
                }
                continue;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(mp[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static info getInfo() {
        return arrayList.get(arrayList.size() - 1);
    }

    public static int getMID(int len) {
        if (len % 2 == 0){
            return len / 2;
        }
        return ++len / 2;
    }

    static class info {
        int x, y;

        public info(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
