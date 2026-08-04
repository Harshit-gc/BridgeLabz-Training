import java.util.*;

public class Solution {

    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for (String op : operations) {
            String[] parts = op.split(" ");
            int type = Integer.parseInt(parts[0]);

            if (type == 1) {
                int value = Integer.parseInt(parts[1]);
                stack.push(value);

                if (maxStack.isEmpty() || value >= maxStack.peek()) {
                    maxStack.push(value);
                } else {
                    maxStack.push(maxStack.peek());
                }
            } else if (type == 2) {
                stack.pop();
                maxStack.pop();
            } else if (type == 3) {
                result.add(maxStack.peek());
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<String> operations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            operations.add(scanner.nextLine());
        }

        List<Integer> result = getMax(operations);

        for (int value : result) {
            System.out.println(value);
        }

        scanner.close();
    }
}