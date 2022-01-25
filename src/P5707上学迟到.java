import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created By XuanRan on 2022/1/25
 */
class P5707上学迟到 {
    public static StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws Throwable {
        streamTokenizer.nextToken();
        int SUM = (int) streamTokenizer.nval;
        streamTokenizer.nextToken();
        int V = (int) streamTokenizer.nval;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.MAY, 5, 8, 0, 0);
        calendar.add(Calendar.MINUTE, -10);
        calendar.add(Calendar.MINUTE, SUM % V == 0 ? -(SUM / V) : -(SUM / V) - 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

    }
}
