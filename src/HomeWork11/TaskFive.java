package HomeWork11;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultLine = new StringBuilder();

        System.out.print("Enter your line: ");
        String inputLine = scanner.nextLine();
        System.out.println("Your line: " + inputLine);

        for (char symbol : inputLine.toCharArray()) {
            resultLine.append(symbol).append(symbol);
        }

        System.out.println("New line: " + resultLine.toString());

        scanner.close();
    }
}
