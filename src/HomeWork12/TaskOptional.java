package HomeWork12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOptional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text: ");
        String inputLine = scanner.nextLine();

        String emailRegex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        String documentRegex = "\\d{4}-\\d{4}-\\d{2}";
        String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(inputLine);
        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        Pattern documentPattern = Pattern.compile(documentRegex);
        Matcher documentMatcher = documentPattern.matcher(inputLine);
        while (documentMatcher.find()) {
            System.out.println("document number: " + documentMatcher.group());
        }

        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(inputLine);
        while (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }

        scanner.close();
    }
}
