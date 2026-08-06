import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = camelcase(s);
        System.out.println(result);
    }

    public static int camelcase(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
        }
        return wordCount;
    }
}