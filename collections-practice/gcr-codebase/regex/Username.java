package regex;

import java.util.regex.*;
import java.util.Scanner;

public class Username {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName = input.nextLine().trim();
		String regex = "^[a-zA-Z]\\w{4,14}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(userName);
		if(matcher.matches()) {
			System.out.println(userName+"-> Valid");
		}else {
			System.out.println(userName+"-> Invalid");
		}
		input.close();
	}
}
