package strings;
import java.util.Scanner;

public class TrimTheSpaces {
    // finding the start & end of string
    public static int[] findTrimPoints(String str) {
        int n = str.length();
        int start = 0, end = n - 1;
        while (start < n && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    
    // finding the substring
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    // compare the both string
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String str = input.nextLine();
        int[] points = findTrimPoints(str);
        String customTrimmed = customSubstring(str, points[0], points[1]);
        String builtInTrimmed = str.trim();
        System.out.println("\nOriginal: '" + str + "'");
        System.out.println("Custom trim: '" + customTrimmed + "'");
        System.out.println("Built-in trim: '" + builtInTrimmed + "'");
        System.out.println("Match: " + compareStrings(customTrimmed, builtInTrimmed));
        input.close();
    }
}