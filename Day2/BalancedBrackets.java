import java.util.*;

public class Solution {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();

                if (c == ')' && top != '(') {
                    return "NO";
                }
                if (c == '}' && top != '{') {
                    return "NO";
                }
                if (c == ']' && top != '[') {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            String result = isBalanced(s);
            System.out.println(result);
        }

        scanner.close();
    }
}