import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Sherlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
    }

    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> freq = new HashMap<>();
        int n = s.length();

        for (int len = 1; len < n; len++) {
            for (int start = 0; start + len <= n; start++) {
                String sub = s.substring(start, start + len);
                char[] chars = sub.toCharArray();
                Arrays.sort(chars);
                String sortedSub = new String(chars);

                if (freq.containsKey(sortedSub)) {
                    freq.put(sortedSub, freq.get(sortedSub) + 1);
                } else {
                    freq.put(sortedSub, 1);
                }
            }
        }

        int totalPairs = 0;
        for (int count : freq.values()) {
            totalPairs += (count * (count - 1)) / 2;
        }

        return totalPairs;
    }
}