package T004;

import java.util.*;

/**
 * 明明的随机数
 *
 * @author hansong
 * @version 1.0
 */
public class Main03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (!(scanner.hasNext("exit"))) {
            int n = 0, m = 0, i = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            n = scanner.nextInt();
            for (i = 0; i < n; i++) {
                m = scanner.nextInt();
                if (!(list.contains(m))) {
                    list.add(m);
                }
            }
            Collections.sort(list);
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }
    }
}
