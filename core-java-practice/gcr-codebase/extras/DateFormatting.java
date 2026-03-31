package extras;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Original Date: " + today);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String output1 = today.format(format1);
        System.out.println("Format 1 (dd/MM/yyyy):      " + output1);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String output2 = today.format(format2);
        System.out.println("Format 2 (yyyy-MM-dd):      " + output2);
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String output3 = today.format(format3);
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + output3);
    }
}