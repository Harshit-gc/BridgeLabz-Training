import java.util.*;

public class NewYearChaos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> q = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                q.add(sc.nextInt());
            }
            minimumBribes(q);
        }
        sc.close();
    }

    public static void minimumBribes(List<Integer> q) {
        int min = 0;
        for (int i = 0; i < q.size(); i++) {
            int bribe = q.get(i) - (i + 1);
            if (bribe > 2) {
                System.out.println("Too chaotic");
                return;
            }
            int start = Math.max(0, q.get(i) - 2);
            for (int j = start; j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    min++;
                }
            }
        }
        System.out.println(min);
    }
}