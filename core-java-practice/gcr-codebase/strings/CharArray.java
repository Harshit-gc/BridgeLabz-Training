package strings;
import java.util.Scanner;

public class CharArray{
	public static void arr(String str, char[] array) {
		for(int i=0; i<str.length(); i++) {
			array[i] = str.charAt(i);
		}
	}
	public static boolean compare(char[] array, char[] array2) {
		if(array.length != array2.length) {
			return false;
		}
		for(int i=0; i<array.length; i++) {
			if(!(array[i] == array2[i])) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] array = new char[str.length()];
		arr(str, array);
		char[] array2 = str.toCharArray();
		if(compare(array, array2)) {
			System.out.println("Yes, both the results are equal");
		}else {
			System.out.println("No, both the results are not equal");
		}
		input.close();
	}
}