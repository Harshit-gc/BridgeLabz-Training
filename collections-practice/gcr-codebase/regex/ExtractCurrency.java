package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String regex = "\\$?[0-9]*\\.[0-9]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			System.out.print(matcher.group()+" ");
		}
		input.close();
	}
}
