package HomeWork11;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLines = new String[3];

        System.out.println("Enter 3 lines: ");

        for (int i = 0; i < 3; i++) {
            inputLines[i] = scanner.nextLine();
        }

        String shortestLine = inputLines[0];
        String longestLine = inputLines[0];

        for (String line : inputLines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println("The shortest line: " + shortestLine + "; its length: " + shortestLine.length());
        System.out.println("The longest line: " + longestLine + "; its length: " + longestLine.length());

        scanner.close();
    }
}
