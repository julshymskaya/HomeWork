import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        // task one
        /*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of rows in the array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int columns = scanner.nextInt();
        int sum = 0;
        int[][] array = new int[rows][columns];

        // random numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        System.out.print("Your array: " + Arrays.deepToString(array));

        // user numbers
        System.out.print("\nEnter the number you want to add to the array elements: ");
        int userInput = scanner.nextInt();

        //add and sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += userInput;
                sum += array[i][j];
            }
        }

        System.out.println("Your new array: " + Arrays.deepToString(array));
        System.out.print("Sum of all elements: " + sum);
        scanner.close();
        */

        //task two
        /*
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        */

        //task optional
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns (m): ");
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("The number of rows and columns must be greater than 0.");
            return;
        }

        int[][] array = new int[n][m];
        int count = 0;

        //filling an array with a snake
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }

        //output and formatting of an array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        scanner.close();
         */
    }
}
