package ac2.ex11.interfaces;

import ac2.ex11.exceptions.InvalidPositionException;

public interface IPosicao<T> {
    T element() throws InvalidPositionException;
}
