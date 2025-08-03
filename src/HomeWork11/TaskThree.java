package HomeWork11;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLines = new String[3];
        int sumLength = 0;

        System.out.println("Enter 3 lines: ");

        for (int i = 0; i < 3; i++) {
            inputLines[i] = scanner.nextLine();
            sumLength += inputLines[i].length();
        }

        int averageLength = sumLength / 3;
        System.out.println("The average length: " + averageLength);

        System.out.println("Lines that are shorter than the average length: ");
        for (String line : inputLines) {
            if (line.length() < averageLength) {
                System.out.println(line + "; its length: " + line.length());
            }
        }

        scanner.close();
    }
}
