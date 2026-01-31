package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPlate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine().trim();
		String regex = "^[A-Z]{2}\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		if(matcher.matches()) {
			System.out.println(number+"-> Valid");
		}else {
			System.out.println(number+"-> Invalid");
		}
		input.close();
	}
}
