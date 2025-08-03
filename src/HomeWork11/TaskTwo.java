package HomeWork11;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLines = new String[3];
        String temp;

        System.out.println("Enter 3 lines: ");

        for (int i = 0; i < 3; i++) {
            inputLines[i] = scanner.nextLine();
        }

        for (int i = 0; i < inputLines.length - 1; i++) {
            for (int j = i + 1; j < inputLines.length; j++) {
                if (inputLines[i].length() > inputLines[j].length()) {
                    temp = inputLines[i];
                    inputLines[i] = inputLines[j];
                    inputLines[j] = temp;
                }
            }
        }

        System.out.println("The lines are arranged in ascending order of their length: ");
        for (String line : inputLines) {
            System.out.println(line + "; its length: " + line.length());
        }

        scanner.close();
    }
}
