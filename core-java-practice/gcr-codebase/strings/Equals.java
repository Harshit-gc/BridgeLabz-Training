package strings;
import java.util.Scanner;

public class Equals{
	public static boolean compare(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		boolean result = true;
		for(int i=0; i<str1.length(); i++) {
			if(!(str1.charAt(i) == str2.charAt(i))) {
				result = false;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		boolean result1 = compare(str1, str2);
		boolean result2 = str1.equals(str2);
		if(result1 && result2) {
			System.out.println("Yes, both the results are equal");
		}else {
			System.out.println("No, both the results are not equal");
		}
		input.close();
	}
}