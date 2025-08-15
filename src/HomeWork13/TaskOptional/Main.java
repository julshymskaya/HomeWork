package HomeWork13.TaskOptional;

public class Main {
    public static void main(String[] args) {
        // infinite loop
        try {
            while (true) {

            }
        } catch (Exception e) {

        } finally {
            System.out.println("It will not be executed.");
        }

        // using System.exit
        try {
            System.exit(0);
        } catch (Exception e) {

        } finally {
            System.out.println("It will not be executed.");
        }
    }
}
