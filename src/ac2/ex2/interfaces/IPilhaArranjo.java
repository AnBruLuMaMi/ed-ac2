package ac2.ex2.interfaces;

import ac2.ex2.exceptions.FullStackException;

import java.util.EmptyStackException;

public interface IPilhaArranjo<T> {
    public T top() throws EmptyStackException;
    public void push(T element) throws FullStackException;
    public T pop() throws EmptyStackException;
    public int size();
    public boolean isEmpty();
}

