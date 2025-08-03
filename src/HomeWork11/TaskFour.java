package HomeWork11;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLines = new String[3];

        System.out.println("Enter 3 lines: ");

        for (int i = 0; i < 3; i++) {
            inputLines[i] = scanner.nextLine();
        }

        int i = 0;
        for (; i < inputLines.length; i++) {
            int j = 0;
            boolean[] uniqueCharSet = new boolean[256];
            for (; j < inputLines[i].length(); j++) {
                int code = inputLines[i].charAt(j);
                if (uniqueCharSet[code]) {
                    break;
                } else {
                    uniqueCharSet[code] = true;
                }
            }
            if (j == inputLines[i].length()) {
                System.out.println("All symbols are unique, line: " + inputLines[i]);
                break;
            }
        }

        if (i == inputLines.length) {
            System.out.println("There are no words with unique characters.");
        }

        scanner.close();
    }
}
