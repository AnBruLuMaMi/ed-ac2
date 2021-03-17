package ac2.test.ex5e6;

import ac2.ex2.PilhaArranjo;
import ac2.ex2.interfaces.IPilhaArranjo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilhaTest {
    @Test
    void test() {
        IPilhaArranjo<Integer> pilha = new PilhaArranjo<>(25);
        assertEquals("[]", pilha.toString());

        for (int i = 0; i < 25; i++) {
            pilha.push(1);
        }

        for (int i = 0; i < 12; i++) {
            pilha.top();
        }

        for (int i = 0; i < 10 - 3; i++) {
            pilha.pop();
        }

        assertEquals(18, pilha.size());
        //5 - R: O tamanho atual da pilha será 18

        //6 - R: O valor do top estará contido no índice 17 do arranjo da pilha
    }
}
