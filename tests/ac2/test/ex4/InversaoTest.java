package ac2.test.ex4;

import ac2.ex3.PilhaLSE;
import ac2.ex3.interfaces.IPilhaLSE;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InversaoTest {
    public <T> IPilhaLSE<T> inverterPilha(IPilhaLSE<T> pilha) {
        IPilhaLSE<T> pilhaInvertida = new PilhaLSE<>();

        while (!pilha.isEmpty())
            pilhaInvertida.push(pilha.pop());

        return pilhaInvertida;
    }

    @Test
    void test() {
        IPilhaLSE<Integer> pilha = new PilhaLSE<>();
        assertEquals("[]", pilha.toString());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        assertEquals("[5,4,3,2,1]", pilha.toString());

        assertEquals("[1,2,3,4,5]", inverterPilha(pilha).toString());
    }
}
