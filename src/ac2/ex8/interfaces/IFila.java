package ac2.ex8.interfaces;

import ac2.ex8.exceptions.EmptyQueueException;

public interface IFila<T> {
    void enqueue(T elemento);
    T dequeue() throws EmptyQueueException;
    T front() throws EmptyQueueException;
    boolean isEmpty();
    int size();
}
