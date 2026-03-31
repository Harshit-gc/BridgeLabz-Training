package strings;
import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {
    static String[] frequency(String str) {
        char[] ch = str.toCharArray();
        int[] count = new int[ch.length];
        // find frequency
        for (int i = 0; i < ch.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }
        // count unique characters
        int size = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                size++;
            }
        }
        // store result
        String[] result = new String[size];
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                result[index] = ch[i] + " = " + count[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.next();
        String[] output = frequency(str);
        for (String s : output) {
            System.out.println(s);
        }
        input.close();
    }
}