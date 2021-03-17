package ac2.ex11.exceptions;

public class EmptyListException extends RuntimeException {
    public EmptyListException() {}
    public EmptyListException(String mensagem) {
        super(mensagem);
    }
}
