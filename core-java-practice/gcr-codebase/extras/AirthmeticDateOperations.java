package extras;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AirthmeticDateOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Date \"dd-MM-yyyy\" int this format");
		String currDate = input.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(currDate, formatter);
		System.out.println(date);
		LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		System.out.println(newDate);
		input.close();
	}
}
