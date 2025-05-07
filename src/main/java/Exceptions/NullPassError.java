package Exceptions;

public class NullPassError extends Exception{
    public NullPassError() {
        super("Datos incompletos, no pueden ser nula");
    }
}
