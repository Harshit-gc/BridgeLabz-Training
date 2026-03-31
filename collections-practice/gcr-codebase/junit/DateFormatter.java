package bridgelabz.junit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    public String formatDate(String inputDate) {
        if (inputDate == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        LocalDate date = LocalDate.parse(inputDate);
        DateTimeFormatter targetFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(targetFormatter);
    }
}
