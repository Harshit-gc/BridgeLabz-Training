package bridgelabz.junit;

import org.junit.jupiter.api.Test;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateConversion() {
        String input = "2023-12-25";
        String result = formatter.formatDate(input);
        assertEquals("25-12-2023", result, "Date should be reformatted correctly");
    }

    @Test
    void testInvalidFormat() {
        String invalidInput = "2023/12/25";
        assertThrows(DateTimeParseException.class, () -> {
            formatter.formatDate(invalidInput);
        }, "Should throw exception for wrong format");
    }

    @Test
    void testImpossibleDate() {
        String impossibleDate = "2023-02-30";
        assertThrows(DateTimeParseException.class, () -> {
            formatter.formatDate(impossibleDate);
        }, "Should throw exception for impossible dates");
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        }, "Should throw IllegalArgumentException for null input");
    }
}
