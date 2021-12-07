import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/7
 */
public class P5719分类平均 {

    public static int N,K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        double A_Sum = 0;
        int A_len = 0;
        int B_Len = 0;
        double B_Sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % K == 0){
                A_Sum += i;
                A_len++;
            }else {
                B_Sum += i;
                B_Len++;
            }
        }

        System.out.printf("%.1f",A_Sum / A_len);
        System.out.print(" ");
        System.out.printf("%.1f",B_Sum / B_Len);


    }
}
