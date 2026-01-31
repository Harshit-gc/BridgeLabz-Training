package bridgelabz.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        boolean result = registration.registerUser("john_doe", "john@example.com", "SecurePass123");
        assertTrue(result, "User should be registered successfully");
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "john@example.com", "Pass123");
        });
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john_doe", "john_example.com", "Pass123");
        });
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john_doe", "john@example.com", "123"); // Too short
        });
        assertEquals("Password must be at least 6 characters", exception.getMessage());
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, "john@example.com", "Pass123");
        });
    }
}
