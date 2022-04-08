import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created By XuanRan on 2022/03/08
 * 已使用Cpp通过
 */
public class P1032 {
    public static String start, end;
    public static HashMap<String, String> hashMap = new HashMap<>();
    public static HashMap<String, Boolean> flag = new HashMap<>();
    public static Queue<Node> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        start = sc.next();
        end = sc.next();
        boolean f = true;
        while (sc.hasNextLine()) {
            String[] strings = sc.nextLine().split(" ");
            if (f) {
                f = false;
                continue;
            }
            if (strings[0].equals("")) break;
            hashMap.put(strings[0], strings[1]);
        }

        queue.offer(new Node(start, 0));
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.str.equals(end)) {
                System.out.println(node.flag);
                System.exit(0);
            }

            if (node.flag > 10) {
                System.out.println("NO ANSWER!");
                System.exit(0);
            }

            for (String s : hashMap.keySet()) {
                if (node.str.contains(s)) {
                    flag.put(s, true);
                    String replace = node.str.replaceAll(s, hashMap.get(s));
                    int step = node.flag + 1;
                    queue.offer(new Node(replace, step));
                }
            }

        }
    }

    private static class Node {
        String str;
        int flag;

        public Node(String str, int flag) {
            this.str = str;
            this.flag = flag;
        }
    }
}