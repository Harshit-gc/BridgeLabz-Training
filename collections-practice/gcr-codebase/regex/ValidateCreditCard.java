package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		String regex = "^(4|5)[0-9]{15}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		if(matcher.matches()) {
			if(matcher.group(1).equals("4")) {
				System.out.println("VISA card is valid");
			}else {
				System.out.println("MasterCard is valid");
			}
		}else {
			System.out.println("Credit Card is invalid");
		}
		input.close();
	}
}
