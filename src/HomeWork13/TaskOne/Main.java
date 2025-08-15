package HomeWork13.TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your login: ");
            String login = scanner.nextLine();

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            System.out.println("Repeat your password: ");
            String confirmPassword = scanner.nextLine();

            UserValidator.validateUser(login, password, confirmPassword);

            System.out.println("The login was completed successfully.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        }
    }
}
