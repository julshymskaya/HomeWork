package HomeWork12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your line: ");
        String inputLine = scanner.nextLine();

        String regex = "[A-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputLine);

        System.out.println("Abbreviations that were found: ");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}
