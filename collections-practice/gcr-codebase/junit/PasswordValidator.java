package bridgelabz.junit;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return password.matches("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");
    }
}
