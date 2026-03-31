// program DayOfWeek that takes a date as input and prints the day of the week that the date falls on.
// Your program should take three command-line arguments: m (month), d (day), and y (year). 
// For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 
// 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar.

package control_flow;

public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year
        // Adjust month and year for Jan and Feb
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;   // Year of the century
        int j = y / 100;   // Century
        // Zeller's Congruence (Gregorian)
        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println(h);
    }
}
