package scenario_based;
import java.util.*;

public class EmployeeWageComputation {
	
	public static boolean presenceStatus() {
		int status = (int)(Math.random()*10)%3;
		if(status == 0) {
			return false;
		}else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("...Welcome to Employee Wage Computation Program...");
		// Use Case 3 and 4 Part Time Employee and Wage Using Switch Case
		System.out.println("Employee Type");
		System.out.println("1. Part Time");
		System.out.println("2. Full Time");
		System.out.println("Enter Choice 1 or 2");
		int choice = input.nextInt();
		String employeeType = "";
		switch(choice) {
		case 1:
			employeeType = "Part Time";
			break;
		case 2:
			employeeType = "Full Time";
			break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("Employee Type: "+employeeType);
		int totalEmpHours = 0;
		int totalDays = 0;
		// Use Case 6 Calculate Wages till a condition reaches for a month.
		while(totalEmpHours<=100 && totalDays <= 20) {
			// UseCase 1 Check Employee is Present or Absent.
			if(presenceStatus()) {
				totalEmpHours += 8;
				totalDays += 1;
			}
		}
		// Use Case 5 & 2 Calculate Wages for a month.
		int monthlyWage = totalEmpHours*20;
		System.out.print(monthlyWage);
		input.close();
	}
}
