package ac2.ex11.interfaces;

import ac2.ex11.exceptions.BoundaryViolationException;
import ac2.ex11.exceptions.EmptyListException;
import ac2.ex11.exceptions.InvalidPositionException;

public interface IListaPosicao<T> {
    public IPosicao<T> first() throws EmptyListException;

    public IPosicao<T> last();

    public IPosicao<T> next(IPosicao<T> p) throws InvalidPositionException, BoundaryViolationException;

    public IPosicao<T> prev(IPosicao<T> p) throws InvalidPositionException, BoundaryViolationException;

    public void addFirst(T e);

    public void addLast(T e);

    public void addAfter(IPosicao<T> p, T e) throws InvalidPositionException;

    public void addBefore(IPosicao<T> p, T e) throws InvalidPositionException;

    public T remove(IPosicao<T> p) throws InvalidPositionException;

    public T set(IPosicao<T> p, T e) throws InvalidPositionException;

    public int size();

    public boolean isEmpty();
}


