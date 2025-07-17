package HomeWork9.TaskOne;

public class Main {
    public static void main(String[] args) {
        Position directorPosition = new Director();
        Position workerPosition = new Worker();
        Position accountantPosition = new Accountant();

        directorPosition.printPost();
        workerPosition.printPost();
        accountantPosition.printPost();
    }
}
