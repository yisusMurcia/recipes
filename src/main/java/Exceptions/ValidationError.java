package Exceptions;

public class ValidationError extends Exception {
    public ValidationError() {
        super("User or password invalid");
    }
}
