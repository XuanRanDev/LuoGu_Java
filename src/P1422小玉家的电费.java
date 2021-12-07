import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/3
 */
public class P1422小玉家的电费 {
    public static double A = 0.4463; //150 and down
    public static double B = 0.4663; // 151 - 400
    public static double C = 0.5663; // 401

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x <= 150){
            System.out.println(String.format("%.1f",x * A));
        }else if (x >= 150 && x <= 400){
            System.out.println(String.format("%.1f", A * 150 +  (x - 150) * B));
        }else {
            System.out.println(String.format("%.1f", A * 150 +  250 * B + (x - 400) * C));
        }

    }
}
