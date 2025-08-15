package HomeWork13.TaskOne;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Incorrect login.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
