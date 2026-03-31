package strings;
import java.util.Scanner;

public class Substring{
	public static String substring(String str, int start, int end) {
		String result = "";
		for(int i=start; i<end; i++) {
			result = result+str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int start = input.nextInt();
		int end = input.nextInt();
		String result1 = substring(str, start, end);
		String result2 = str.substring(start, end);
		if(result1.equals(result2)) {
			System.out.println("Yes, both the results are equal");
			System.out.println(result1);
		}else {
			System.out.println("No, both the results are not equal");
		}
		input.close();
	}
}