package HomeWork10.TaskOneAndOptional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Julia", "Shymskaya", 2457781);
        User user2 = new User("Julia", "Shymskaya", 2457781);
        User user3 = new User("Jul", "Naliv", 2357986);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Comparing identical objects: " + user1.equals(user2));
        System.out.println("Comparing different objects: " + user1.equals(user3));

        UserOptional[] userOptionalOriginal = new UserOptional[3];
        userOptionalOriginal[0] = new UserOptional(1, "Julia", 2455710);
        userOptionalOriginal[1] = new UserOptional(2, "Masha", 2173710);
        userOptionalOriginal[2] = new UserOptional(3, "Roman", 9454516);

        System.out.println("\nAvailable users: ");
        for (UserOptional user : userOptionalOriginal) {
            System.out.println(user);
        }

        System.out.println("Enter the type of cloning: 1 - surface, 2 - deep");
        int typeOfCloning = scanner.nextInt();
        System.out.println("Enter the user ID for cloning: ");
        int userId = scanner.nextInt();

        UserOptional userOptionalForClone = null;
        switch (userId) {
            case 1 -> userOptionalForClone = userOptionalOriginal[0];
            case 2 -> userOptionalForClone = userOptionalOriginal[1];
            case 3 -> userOptionalForClone = userOptionalOriginal[2];
            default -> {
                System.out.println("User with this ID was not found.");
                return;
            }
        }

        try {
            UserOptional userOptionalCloned = null;
            switch (typeOfCloning) {
                case 1:
                    userOptionalCloned = (UserOptional) userOptionalForClone.clone();
                    break;
                case 2:
                    userOptionalCloned = userOptionalForClone.deepClone();
                    break;
                default:
                    System.out.println("Incorrect selection of the cloning type.");
            }

            System.out.println("Original user: " + userOptionalForClone);
            System.out.println("Cloned user: " + userOptionalCloned);
            System.out.println("Are users equal: " + userOptionalForClone.equals(userOptionalCloned));

        } catch (CloneNotSupportedException e) {
            System.out.println("Try restarting the program.");
        }

        scanner.close();
    }
}
