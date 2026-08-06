import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
    
        char[] arrA = aLower.toCharArray();
        char[] arrB = bLower.toCharArray();

        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);

        return java.util.Arrays.equals(arrA, arrB);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
