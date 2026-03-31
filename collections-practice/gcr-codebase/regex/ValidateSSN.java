package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String regex = "\\d{3}-\\d{2}-\\d{4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()) {
			System.out.println("\""+matcher.group()+"\" is valid");
		}else {
			System.out.println("SSN is invalid");
		}
		input.close();
	}
}
