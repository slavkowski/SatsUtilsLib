package Exceptions;

public class WrongLengthException extends Exception {
    public WrongLengthException() {
        super();
    }

    public WrongLengthException(String message) {
        super(message);
    }

    public WrongLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLengthException(Throwable cause) {
        super(cause);
    }
}
