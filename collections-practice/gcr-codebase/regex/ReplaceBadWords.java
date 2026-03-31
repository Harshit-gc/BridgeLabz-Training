package regex;

import java.util.Scanner;

public class ReplaceBadWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] words = {"damn", "stupid"};
		String regex = String.join("|", words);
		String result = str.replaceAll(regex, "****");
		System.out.println(result);
		input.close();
	}

}
