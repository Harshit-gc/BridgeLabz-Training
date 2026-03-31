package regex;
import java.util.*;
import java.util.regex.*;

public class CapitalizedWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String regex = "[A-Z][a-zA-Z]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.print(matcher.group()+" ");
		}
		input.close();
	}
}
