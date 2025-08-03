package HomeWork11;

import java.util.Scanner;

public class TaskOptional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your line: ");
        String inputLine = scanner.nextLine();
        System.out.println("Your line: " + inputLine);

        if (inputLine.isBlank()) {
            System.out.println("You entered an empty string.");
            return;
        }

        String[] wordsFromLine = inputLine.trim().split("\\s");

        System.out.println("Enter the word number to check for a palindrome: ");
        int wordNumber = scanner.nextInt();

        if (wordNumber < 1 || wordNumber > wordsFromLine.length) {
            System.out.println("You entered an incorrect number.");
            return;
        }

        String currentWord = wordsFromLine[wordNumber - 1];
        for (int i = 0, j = currentWord.length() - 1; i < currentWord.length() / 2; i++, j--) {
            if (currentWord.charAt(i) != currentWord.charAt(j)) {
                System.out.println("The word is not a palindrome.");
                return;
            }
        }

        System.out.println("The word is a palindrome.");

        scanner.close();
    }
}
