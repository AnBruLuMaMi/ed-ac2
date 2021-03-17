package ac2.ex11;

import ac2.ex11.exceptions.BoundaryViolationException;
import ac2.ex11.exceptions.EmptyListException;
import ac2.ex11.exceptions.InvalidPositionException;
import ac2.ex11.interfaces.IPosicao;
import ac2.ex11.interfaces.IListaPosicao;

public class ListaNodo<T> implements IListaPosicao<T> {
    private DNodo<T> header, trailler;
    private int quantidadeElementosLista;

    public ListaNodo() {
        quantidadeElementosLista = 0;
        header = new DNodo<T>(null, null, null, this);
        trailler = new DNodo<T>(header, null, null, this);
        header.setProximo(trailler); //
    }

    private DNodo<T> validarPosicao(IPosicao<T> posicao) throws InvalidPositionException {

        if (posicao == null)
            throw new InvalidPositionException("A posição não pode ser nula");

        if (posicao == header)
            throw new InvalidPositionException("O nodo header não é válido");

        if (posicao == trailler)
            throw new InvalidPositionException("O nodo trailler não é válido");

        try {
            DNodo<T> temp = (DNodo<T>) posicao;

            if ((temp.getAnterior() == null) || (temp.getProximo() == null))
                throw new InvalidPositionException("A posição não pertence a uma lista de nodo válida");

            if (temp.getLista() != this)
                throw new InvalidPositionException("A posição não pertence a essa lista.");

            return temp;
        } catch (ClassCastException e) {
            throw new InvalidPositionException("A posição não possui o mesmo tipo da lista");
        }
    }

    @Override
    public IPosicao<T> first() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException("A lista está vazia.");

        return header.getProximo();
    }

    @Override
    public IPosicao<T> last() {
        if (isEmpty())
            throw new EmptyListException("A lista está vazia.");

        return trailler.getAnterior();
    }

    @Override
    public IPosicao<T> next(IPosicao<T> posicao) throws InvalidPositionException, BoundaryViolationException {
        DNodo<T> nodo = validarPosicao(posicao);
        DNodo<T> proximoNodo = nodo.getProximo();

        if (proximoNodo == trailler)
            throw new BoundaryViolationException("Não é possível ir além do final da lista");

        return proximoNodo;
    }

    @Override
    public IPosicao<T> prev(IPosicao<T> p) throws InvalidPositionException, BoundaryViolationException {
        DNodo<T> nodo = validarPosicao(p);
        DNodo<T> anterior = nodo.getAnterior();

        if (anterior == header)
            throw new BoundaryViolationException("Não é possível ir além do começo da lista");

        return anterior;
    }

    @Override
    public void addFirst(T elemento) {
        quantidadeElementosLista++;

        DNodo<T> novoNodo = new DNodo<T>(header, header.getProximo(), elemento, this);

        header.getProximo().setAnterior(novoNodo);
        header.setProximo(novoNodo);
    }

    @Override
    public void addLast(T elemento) {
        quantidadeElementosLista++;

        DNodo<T> novoNodo = new DNodo<T>(trailler.getAnterior(), trailler, elemento, this);

        trailler.getAnterior().setProximo(novoNodo);
        trailler.setAnterior(novoNodo);
    }

    @Override
    public void addAfter(IPosicao<T> posicao, T elemento) throws InvalidPositionException {
        DNodo<T> nodo = validarPosicao(posicao);

        quantidadeElementosLista++;

        DNodo<T> novoNodo = new DNodo<T>(nodo, nodo.getProximo(), elemento, this);

        nodo.getProximo().setAnterior(novoNodo);
        nodo.setProximo(novoNodo);
    }

    @Override
    public void addBefore(IPosicao<T> posicao, T elemento) throws InvalidPositionException {
        DNodo<T> nodo = validarPosicao(posicao);

        quantidadeElementosLista++;

        DNodo<T> novoNodo = new DNodo<T>(nodo.getAnterior(), nodo, elemento, this);

        nodo.getAnterior().setProximo(novoNodo);
        nodo.setAnterior(novoNodo);
    }

    @Override
    public T remove(IPosicao<T> posicao) throws InvalidPositionException {
        DNodo<T> nodo = validarPosicao(posicao);

        quantidadeElementosLista--;

        DNodo<T> nodoAnterior = nodo.getAnterior();
        DNodo<T> nodoProximo = nodo.getProximo();

        nodoAnterior.setProximo(nodoProximo);
        nodoProximo.setAnterior(nodoAnterior);

        T elementoNodo = nodo.element();

        nodo.setProximo(null);
        nodo.setAnterior(null);

        return elementoNodo;
    }

    @Override
    public T set(IPosicao<T> p, T elemento) throws InvalidPositionException {
        DNodo<T> nodo = validarPosicao(p);

        T elementoAntigo = nodo.element();

        nodo.setElemento(elemento);

        return elementoAntigo;
    }

    public void makeFirst(IPosicao<T> p) {
        DNodo<T> nodo = validarPosicao(p);
        DNodo<T> nodeAnterior = nodo.getAnterior();
        DNodo<T> nodeProximo = nodo.getProximo();

        nodeAnterior.setProximo(nodeProximo);
        nodeProximo.setAnterior(nodeAnterior);

        DNodo<T> primeiroElemento = header.getProximo();
        primeiroElemento.setAnterior(nodo);

        nodo.setAnterior(header);
        nodo.setProximo(primeiroElemento);

        header.setProximo(nodo);
    }

    @Override
    public int size() {
        return quantidadeElementosLista;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private static <T> String toString(IListaPosicao<T> l) {
        String s = "";

        if (!l.isEmpty()) {
            IPosicao<T> elementoAtual = l.first();
            IPosicao<T> ultimoElemento = l.last();

            s += elementoAtual.element() + ", ";

            while (elementoAtual != ultimoElemento) {
                elementoAtual = l.next(elementoAtual);
                s += elementoAtual.element() + ", ";
            }
        }

        s = (s.length() == 0 ? s : s.substring(0, s.length() - 2));

        return "[" + s + "]";
    }

    @Override
    public String toString() {
        return toString(this);
    }
}
