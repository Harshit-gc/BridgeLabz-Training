package extras;
import java.time.*;
import java.util.*;

public class DateComparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a date(yyyy-MM-dd): ");
		String d1 = input.nextLine();
		System.out.println("Enter second date(yyyy-MM-dd): ");
		String d2 = input.nextLine();
		LocalDate date1 = LocalDate.parse(d1);
		LocalDate date2 = LocalDate.parse(d2);
		if (date1.isBefore(date2)) {
			System.out.println(date1 + " Come before " + date2);
		}
		if (date1.isAfter(date2)) {
			System.out.println(date1 + " is After " + date2);
		}
		if (date1.isEqual(date2)) {
			System.out.println(date1 + " is same as " + date2);
		}
		input.close();
	}
}
