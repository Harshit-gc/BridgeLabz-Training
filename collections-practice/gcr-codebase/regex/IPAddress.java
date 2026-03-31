package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IPAddress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ip = input.nextLine();
		String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(ip);
		if(matcher.matches()) {
			System.out.println("IP Address is valid");
		}else {
			System.out.println("IP Address is invalid");
		}
		input.close();
	}
}
