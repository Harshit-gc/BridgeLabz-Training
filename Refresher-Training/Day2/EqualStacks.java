import java.util.*;

public class Solution {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int val : h1) sum1 += val;
        for (int val : h2) sum2 += val;
        for (int val : h3) sum3 += val;

        int i1 = 0, i2 = 0, i3 = 0;

        while (!(sum1 == sum2 && sum2 == sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= h1.get(i1);
                i1++;
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= h2.get(i2);
                i2++;
            } else {
                sum3 -= h3.get(i3);
                i3++;
            }
        }

        return sum1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMultipleInput = scanner.nextLine().trim().split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);
        int n2 = Integer.parseInt(firstMultipleInput[1]);
        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = new ArrayList<>();
        for (String val : scanner.nextLine().trim().split(" ")) {
            h1.add(Integer.parseInt(val));
        }

        List<Integer> h2 = new ArrayList<>();
        for (String val : scanner.nextLine().trim().split(" ")) {
            h2.add(Integer.parseInt(val));
        }

        List<Integer> h3 = new ArrayList<>();
        for (String val : scanner.nextLine().trim().split(" ")) {
            h3.add(Integer.parseInt(val));
        }

        int result = equalStacks(h1, h2, h3);

        System.out.println(result);

        scanner.close();
    }
}   