package ac2.ex11.exceptions;

public class InvalidPositionException extends RuntimeException {
    public InvalidPositionException() {
    }

    public InvalidPositionException(String mensagem) {
        super(mensagem);
    }
}
