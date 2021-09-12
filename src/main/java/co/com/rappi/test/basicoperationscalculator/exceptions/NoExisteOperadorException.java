package co.com.rappi.test.basicoperationscalculator.exceptions;

public class NoExisteOperadorException extends RuntimeException {
    public NoExisteOperadorException(String operador) {
        super("El operador " + operador + " no existe ");
    }
}