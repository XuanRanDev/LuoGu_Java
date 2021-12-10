import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/10
 */
public class P5734文字处理软件 {
    public static StringBuilder sb = new StringBuilder();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        sb.append(sc.next());
        for (int i = 1; i <= N; i++) {
            int index = sc.nextInt();
            switch (index) {
                case 1:
                    AppendStr();
                    break;
                case 2:
                    SubString();
                    break;
                case 3:
                    InsertStr();
                    break;
                case 4:
                    FindStr();
                    break;
            }
        }
    }

    private static void FindStr() {
        String str = sc.next();
        if (!sb.toString().contains(str)){
            System.out.println(-1);
            return;
        }
        int index = sb.toString().indexOf(str);
        System.out.println(index);
    }

    private static void InsertStr() {
        int x = sc.nextInt();
        String y = sc.next();
        sb.insert(x,y);
        System.out.println(sb.toString());
    }

    private static void SubString() {
        int begin = sc.nextInt();
        int end = sc.nextInt();
        sb = new StringBuilder(sb.substring(begin, begin + end));
        System.out.println(sb);
    }

    private static void AppendStr() {
        String x = sc.next();
        sb.append(x);
        System.out.println(sb.toString());
    }
}
