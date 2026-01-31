package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String regex = "[0-9]{2}/[0-1][0-9]/[0-9]{4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.matches()) {
			System.out.print(matcher.group()+" ");
		}
		input.close();
	}
}
