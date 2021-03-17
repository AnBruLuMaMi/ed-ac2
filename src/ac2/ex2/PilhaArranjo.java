package ac2.ex2;

import ac2.ex2.exceptions.FullStackException;
import ac2.ex2.interfaces.IPilhaArranjo;

import java.util.EmptyStackException;

public class PilhaArranjo<T> implements IPilhaArranjo<T> {
    private T[] arranjo;
    private int capacidadeMaxima;
    private int indiceTopo;

    public PilhaArranjo() {
        this(4);
    }

    public PilhaArranjo(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        arranjo = (T[])new Object[capacidadeMaxima];
        indiceTopo = -1;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        return arranjo[indiceTopo];
    }

    @Override
    public void push(T elemento) throws FullStackException {
        if (size() == capacidadeMaxima)
            throw new FullStackException();

        arranjo[++indiceTopo]  = elemento;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        T elemento = arranjo[indiceTopo];
        arranjo[indiceTopo--] = null;

        return elemento;
    }

    @Override
    public int size() {
        return indiceTopo + 1;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        String arranjoString = "[";

        for (int i = 0; i < size(); i++) {
            arranjoString += arranjo[i].toString();

            if (i < size() - 1) {
                arranjoString += ",";
            }
        }

        arranjoString += "]";

        return arranjoString;
    }
}
