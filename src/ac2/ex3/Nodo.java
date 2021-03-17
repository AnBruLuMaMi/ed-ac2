package ac2.ex3;

public class Nodo<T> {
    private T elemento;
    private Nodo<T> proximo;

    public Nodo(T elemento, Nodo<T> proximo) {
        this.setElemento(elemento);
        this.setProximo(proximo);
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }
}
