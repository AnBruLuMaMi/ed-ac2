package ac2.test.ex3;

import ac2.ex3.PilhaLSE;
import ac2.ex3.interfaces.IPilhaLSE;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PilhaLSETest {
    @Test
    void test() {
        IPilhaLSE<String> pilha = new PilhaLSE<>();
        assertEquals("[]", pilha.toString());

        pilha.push("vermelho");
        assertEquals("[vermelho]", pilha.toString());

        pilha.push("rosa");
        assertEquals("[rosa,vermelho]", pilha.toString());

        assertEquals("rosa", pilha.pop());

        pilha.push("roxo");
        assertEquals("[roxo,vermelho]", pilha.toString());

        assertEquals("roxo", pilha.pop());

        assertEquals("vermelho", pilha.top());

        assertEquals("vermelho", pilha.pop());

        assertThrows(EmptyStackException.class, () -> pilha.pop());

        assertEquals(true, pilha.isEmpty());

        pilha.push("preto");
        assertEquals("[preto]", pilha.toString());

        pilha.push("roxo");
        assertEquals("[roxo,preto]", pilha.toString());

        pilha.push("rosa");
        assertEquals("[rosa,roxo,preto]", pilha.toString());

        pilha.push("vermelho");
        assertEquals("[vermelho,rosa,roxo,preto]", pilha.toString());

        assertEquals(4, pilha.size());

        assertEquals("vermelho", pilha.pop());

        pilha.push("azul");
        assertEquals("[azul,rosa,roxo,preto]", pilha.toString());

        assertEquals("azul", pilha.pop());

        assertEquals("rosa", pilha.pop());
    }
}
