package strings;
import java.util.Scanner;

public class IndexOutOfBound{
	public static String generateException(String[] names) {
		String name = names[names.length];
		return name;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		for(int i=0; i<5; i++) {
			names[i] = input.nextLine();
		}
		try {
			generateException(names);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsExcpetion caught "+e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("RuntimeException caught s"+e.getMessage());
		}
		input.close();
	}
}