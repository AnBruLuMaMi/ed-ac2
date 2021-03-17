package ac2.ex11;

import ac2.ex11.exceptions.InvalidPositionException;
import ac2.ex11.interfaces.IListaPosicao;
import ac2.ex11.interfaces.IPosicao;

public class DNodo<T> implements IPosicao<T> {
    private IListaPosicao<T> lista;
    private DNodo<T> prev, next;
    private T elemento;

    public DNodo(DNodo<T> prev, DNodo<T> next, T elemento, IListaPosicao<T> lista) {
        this.prev = prev;
        this.next = next;
        this.elemento = elemento;
        this.lista = lista;
    }

    @Override
    public T element() throws InvalidPositionException {
        if ((prev == null) && (next == null))
            throw new InvalidPositionException("Position is not in a list!");

        return elemento;
    }

    public DNodo<T> getAnterior() {
        return prev;
    }

    public void setAnterior(DNodo<T> prev) {
        this.prev = prev;
    }

    public DNodo<T> getProximo() {
        return next;
    }

    public void setProximo(DNodo<T> next) {
        this.next = next;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public IListaPosicao<T> getLista() {
        return lista;
    }
}
