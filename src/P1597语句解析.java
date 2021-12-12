import java.util.Scanner;

/**
 * Created By XuanRan on 2021/12/12
 */
public class P1597语句解析 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mmmm = scanner.nextLine();
        int a = 0, b = 0, c = 0;
        int f = -1;
        for (int i = 0; i < mmmm.length(); i++) {
            char cc = mmmm.charAt(i);
            if (cc == 'a' && f == -1){
                f = 1;
                i += 2;
                continue;
            }
            if (cc == 'b' &&  f == -1){
                f = 2;
                i += 2;
                continue;
            }
            if (cc == 'c' && f == -1){
                f = 3;
                i += 2;
                continue;
            }

            if (f == 1){
                if (cc >= 47 && cc <= 57){
                    a = Integer.parseInt(new String(String.valueOf(cc))) ;
                    continue;
                }
                if (cc =='a'){
                    a =(int) a;
                }
                if (cc =='b'){
                    a =(int) b;
                }
                if (cc =='c'){
                    a = (int)c;
                }
                f = -1;
            }




            if (f == 2){
                if (cc >= 47 && cc <= 57){
                    b = Integer.parseInt(new String(String.valueOf(cc))) ;
                    continue;
                }
                if (cc =='a'){
                    b = (int)a;
                }
                if (cc =='b'){
                    b =(int) b;
                }
                if (cc =='c'){
                    b =(int) c;
                }
                f = -1;

            }


            if (f == 3){
                if (cc >= 47 && cc <= 57){
                    c = Integer.parseInt(new String(String.valueOf(cc))) ;
                    continue;
                }
                if (cc =='a'){
                    c = (int)a;
                }
                if (cc =='b'){
                    c = (int)b;
                }
                if (cc =='c'){
                    c = (int)c;
                }
                f = -1;

            }

        }

        System.out.printf("%d %d %d",(int)a,b,c);
    }
}
