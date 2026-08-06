import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.split("[^a-zA-Z]+");

        int count = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() > 0) {
                count++;
            }
        }

        System.out.println(count);
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() > 0) {
                System.out.println(tokens[i]);
            }
        }

        scan.close();
    }
}