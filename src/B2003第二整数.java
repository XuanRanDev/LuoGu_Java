import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created By XuanRan on 2022/1/28
 */
class B2003第二整数 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer sm = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        for (int i = 1; i <= 3; i++) {
            sm.nextToken();
            long a = (long) sm.nval;
            if (i == 2) System.out.println(a);
        }
    }
}
