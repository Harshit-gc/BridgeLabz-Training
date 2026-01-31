package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String colorCode = input.nextLine().trim();
		String regex = "^#[0-9A-Fa-f]{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(colorCode);
		if(matcher.matches()) {
			System.out.println(colorCode+"-> Valid");
		}else {
			System.out.println(colorCode+"-> Invalid");
		}
		input.close();
	}
}
