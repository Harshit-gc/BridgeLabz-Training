package scenario_based;

public class EmployeeWageComputation {
	
	// UC 2 & 3: Daily Employee Wage, Add Part Time Employee
	// UC 5: Assuming 20 Working Days in a month
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
	    int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	    
	    // UC 6: Calculate Wages till max working hours and max days is reached.
	    while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
	        totalWorkingDays++;
	        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	        
	        // UC 1: Check Employee is Absent Or Present.
	        // UC 4: Solving Using Switch Case
	        switch (empCheck) {
	            case PART_TIME:
	                empHrs = 4;
	                break;
	            case FULL_TIME:
	                empHrs = 8;
	                break;
	            default:
	                empHrs = 0;
	        }
	        totalEmpHrs += empHrs;
	        System.out.println("Day: " + totalWorkingDays + " Emp Working Hour: " + empHrs);
	    }
	    int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	    System.out.println("Total Employee Wage: " + totalEmpWage);
	}
}
