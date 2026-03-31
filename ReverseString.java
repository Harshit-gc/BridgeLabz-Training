package review;
import java.util.*;

public class ReverseString {
	
	static String reverse(String text) {
		StringBuilder sb = new StringBuilder();
		for(int i=text.length()-1; i>=0; i--) {
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(reverse(str));
		input.close();
	}

}
