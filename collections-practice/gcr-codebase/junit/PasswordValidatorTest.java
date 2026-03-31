package bridgelabz.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongPass1"), "Password should be valid");
    }

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("Pass1"), "Password is too short");
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("weakpass1"), "Password missing uppercase letter");
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("NoDigitPass"), "Password missing digit");
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null), "Null password should be invalid");
    }
    
    @Test
    void testEmptyPassword() {
        assertFalse(validator.isValid(""), "Empty password should be invalid");
    }
}
