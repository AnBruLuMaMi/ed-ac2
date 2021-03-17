package ac2.ex8.exceptions;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException() {

    }

    public EmptyQueueException(String mensagem) {
        super(mensagem);
    }
}
