package ExceptionsAndIO.InvalidAge;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super("That is an invalid age, must be > 0");
    }
}
