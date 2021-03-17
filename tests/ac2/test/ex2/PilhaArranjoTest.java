package ac2.test.ex2;

import ac2.ex2.PilhaArranjo;
import ac2.ex2.exceptions.FullStackException;
import ac2.ex2.interfaces.IPilhaArranjo;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PilhaArranjoTest {
    @Test
    void test() {
        IPilhaArranjo<String> pilha = new PilhaArranjo();
        assertEquals("[]", pilha.toString());

        pilha.push("vermelho");
        assertEquals("[vermelho]", pilha.toString());

        pilha.push("rosa");
        assertEquals("[vermelho,rosa]", pilha.toString());

        assertEquals("rosa", pilha.pop());

        pilha.push("roxo");
        assertEquals("[vermelho,roxo]", pilha.toString());

        assertEquals("roxo", pilha.pop());

        assertEquals("vermelho", pilha.top());

        assertEquals("vermelho", pilha.pop());

        assertThrows(EmptyStackException.class, () -> pilha.pop());

        assertEquals(true, pilha.isEmpty());

        pilha.push("preto");
        assertEquals("[preto]", pilha.toString());

        pilha.push("roxo");
        assertEquals("[preto,roxo]", pilha.toString());

        pilha.push("rosa");
        assertEquals("[preto,roxo,rosa]", pilha.toString());

        pilha.push("vermelho");
        assertEquals("[preto,roxo,rosa,vermelho]", pilha.toString());

        assertEquals(4, pilha.size());

        assertEquals("vermelho", pilha.pop());

        pilha.push("azul");
        assertEquals("[preto,roxo,rosa,azul]", pilha.toString());

        assertThrows(FullStackException.class, () -> pilha.push("verde"));

        assertEquals("azul", pilha.pop());

        assertEquals("rosa", pilha.pop());
    }
}
