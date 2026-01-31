package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailAddress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		input.close();
	}
}
