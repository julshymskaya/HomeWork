package HomeWork13.TaskOne;

import java.nio.charset.Charset;

public class UserValidator {

    public static boolean validateUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("The login must be less than 20 characters long " +
                    "and must not contain spaces.");
        }

        if (password.length() >= 20 || password.contains(" ") || !containsNumber(password)) {
            throw new WrongPasswordException("The password must be less than 20 characters long, " +
                    "must not contain spaces, and must contain at least one digit.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The passwords don't match.");
        }

        return true;
    }

    private static boolean containsNumber(String number) {
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
