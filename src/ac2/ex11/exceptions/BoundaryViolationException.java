package ac2.ex11.exceptions;

public class BoundaryViolationException extends RuntimeException {
    public BoundaryViolationException() {}
    public BoundaryViolationException(String mensagem) {
        super(mensagem);
    }
}
