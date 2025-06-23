import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Choose a way to fill in the array: ");
        System.out.println("1 - use Math.random()");
        System.out.println("2 - entering items manually");
        int choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        } else if (choice == 2) {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter an array element: " + (i + 1));
                array[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Unknown option.");
        }

        System.out.println("Your array: " + Arrays.toString(array));

        //task one
        /*
        System.out.print("The direct order of the elements: ");
        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.print("Reverse order of the elements: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        */

        //task two
        /*
        int min = array[0];
        int max = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The minimum element: " + min);
        System.out.println("The maximum element: " + max);
         */

        //task three
        /*
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                minIndex = i;
            }
            if (array[i] > max) {
                maxIndex = i;
            }
        }

        System.out.println("The index of the minimum element: " + minIndex);
        System.out.println("The index of the maximum element: " + maxIndex);
         */

        //task four
        /*
        int count = 0;
        for (int number : array) {
            if (number == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There are no zero elements in this array.");
        } else {
            System.out.println("Number of zero elements: " + count);
        }
         */

        //task five
        /*
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.print("Array after replacement: " + Arrays.toString(array));
         */

        //task six
        /*
        boolean flag = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The array is an ascending sequence.");
        } else {
            System.out.println("The array is not an ascending sequence.");
        }
         */

        //task seven
        // Закомментить создание массива в самом начале !
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(array));

        for (int i = size - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                break;
            } else {
                array[i] = 0;
            }

            if (i == 0) {
                int[] newArray = new int[size + 1];
                newArray[0] = 1;
                array = newArray;
            }
        }

        System.out.println("Fixed array: " + Arrays.toString(array));
         */

        scanner.close();
    }
}