import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/29
 */
class P4956Davor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 0,k = 0;
        for (int i = 1 ; i <= 100 ; i++){

            for (int j = 200; j >= 1; j--) {
                if ((7 * i + j * 21) * 52 == N && j != 0){
                    x = i;
                    k = j;

                }
            }

        }

        System.out.println(x);
        System.out.println(k);
    }
}
