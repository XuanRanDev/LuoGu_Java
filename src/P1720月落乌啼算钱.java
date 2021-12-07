import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/7
 */
public class P1720月落乌啼算钱 {

    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        double FZ = Math.pow(((1 + Math.sqrt(5.0)) / 2),N) - Math.pow(((1 - Math.sqrt(5.0)) / 2),N);
        double FM = Math.sqrt(5);
        System.out.printf("%.2f",FZ / FM);


    }
}
