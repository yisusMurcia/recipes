package Exceptions;

public class NameException extends Exception {
    public NameException() {
        super("El nombre de usuario ya existe");
    }
}
