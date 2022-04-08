import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1157 {
    public static StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static int N;
    public static int R;

    public static void main(String[] args) {
        N = nextInt();
        R = nextInt();

    }

    public static int nextInt() {
        try {
            streamTokenizer.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (int) streamTokenizer.nval;
    }
}
