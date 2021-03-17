package ac2.test.ex7;

import ac2.ex2.PilhaArranjo;
import ac2.ex2.interfaces.IPilhaArranjo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex7Test {
    @Test
    void test() {
        /*  Operação        |   Pilha   | Saída
            pilha.push(5)       5           -
            pilha.push(3)       5,3         -
            pilha.pop()         5           3
            pilha.push(2)       5,2         -
            pilha.push(8)       5,2,8       -
            pilha.pop()         5,2         8
            pilha.pop()         5           2
            pilha.push(9)       5,9         -
            pilha.push(1)       5,9,1       -
            pilha.pop()         5,9         1
            pilha.push(7)       5,9,7       -
            pilha.push(6)       5,9,7,6     -
            pilha.pop()         5,9,7       6
            pilha.pop()         5,9         7
            pilha.push(4)       5,9,4       -
            pilha.pop()         5,9         4
            pilha.pop()         5           9
         */

        IPilhaArranjo<Integer> pilha = new PilhaArranjo<>(4);

        pilha.push(5);
        pilha.push(3);
        pilha.pop();

        assertEquals("[5]", pilha.toString());

        pilha.push(2);
        pilha.push(8);
        pilha.pop();
        pilha.pop();

        assertEquals("[5]", pilha.toString());

        pilha.push(9);
        pilha.push(1);
        pilha.pop();

        assertEquals("[5,9]", pilha.toString());

        pilha.push(7);
        pilha.push(6);
        pilha.pop();
        pilha.pop();

        assertEquals("[5,9]", pilha.toString());

        pilha.push(4);
        pilha.pop();
        pilha.pop();

        assertEquals("[5]", pilha.toString());
    }
}
