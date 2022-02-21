import org.junit.Test;

/**
 * Created By XuanRan on 2022/2/21
 */
public class P4924Test {
    @Test
    public void random() {
        System.out.print('[');
        for (int i = 1; i <= 100 * 100; i++) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print(']');
    }

}