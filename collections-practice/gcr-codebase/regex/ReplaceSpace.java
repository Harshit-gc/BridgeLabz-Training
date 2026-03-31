package regex;

import java.util.Scanner;

public class ReplaceSpace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String regex = "\\s+";
		String result = str.replaceAll(regex, " ");
		System.out.println(result);
		input.close();
	}
}
