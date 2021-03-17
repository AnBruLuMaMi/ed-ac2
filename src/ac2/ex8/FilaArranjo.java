package ac2.ex8;

import ac2.ex8.exceptions.EmptyQueueException;
import ac2.ex8.exceptions.FullQueueException;
import ac2.ex8.interfaces.IFila;

public class FilaArranjo<T> implements IFila<T> {
    private T[] arranjo;
    private int capacidadeMaxima;
    private int indicePrimeiro;
    private int indiceUltimo;

    public FilaArranjo() {
        this(10);
    }

    public FilaArranjo(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        arranjo = (T[])new Object[capacidadeMaxima];
        indicePrimeiro = 0;
        indiceUltimo = 0;
    }

    @Override
    public void enqueue(T elemento) {
        if (size() == capacidadeMaxima - 1)
            throw new FullQueueException();

        arranjo[indiceUltimo]  = elemento;
        indiceUltimo = (indiceUltimo + 1) % capacidadeMaxima;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new EmptyQueueException();

        T elemento = arranjo[indicePrimeiro];
        arranjo[indicePrimeiro] = null;

        indicePrimeiro = (indicePrimeiro + 1) % capacidadeMaxima;

        return elemento;
    }

    @Override
    public T front() {
        if (isEmpty())
            throw new EmptyQueueException();

        return arranjo[indicePrimeiro];
    }

    @Override
    public boolean isEmpty() {
        return indicePrimeiro == indiceUltimo;
    }

    @Override
    public int size() {
        return (capacidadeMaxima - indicePrimeiro + indiceUltimo) % capacidadeMaxima;
    }

    private String iterarFila(String arranjoString, int indiceInicio, int indiceFim, boolean reiterar) {
        for (int i = indiceInicio; i < indiceFim; i++) {
            if (arranjo[i] != null)
                arranjoString += arranjo[i].toString() + ",";
        }

        if (reiterar)
            return iterarFila(arranjoString, 0, indiceUltimo + 1, false);

        return arranjoString;
    }

    @Override
    public String toString() {
        String arranjoString = "[";

        int ultimo = indiceUltimo >= indicePrimeiro ? indiceUltimo + 1 : size();
        boolean reiterar = indiceUltimo < indicePrimeiro;

        arranjoString = iterarFila(arranjoString, indicePrimeiro, ultimo, reiterar);

        if (arranjoString.length() > 1)
            arranjoString = arranjoString.substring(0, arranjoString.length() - 1);

        arranjoString += "]";

        return arranjoString;
    }
}
