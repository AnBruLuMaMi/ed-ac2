package ac2.test.ex8;

import ac2.ex8.FilaArranjo;
import ac2.ex8.interfaces.IFila;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilaArranjoTest {
    @Test
    public void test() {
        IFila<Integer> fila = new FilaArranjo<>();

        assertEquals("[]", fila.toString());

        fila.enqueue(5);
        assertEquals("[5]", fila.toString());

        fila.enqueue(3);
        assertEquals("[5,3]", fila.toString());

        assertEquals(5, fila.dequeue());

        fila.enqueue(7);
        assertEquals("[3,7]", fila.toString());

        assertEquals(3, fila.dequeue());

        assertEquals(7, fila.front());

        assertEquals(7, fila.dequeue());

        assertEquals(true, fila.isEmpty());

        fila.enqueue(9);
        assertEquals("[9]", fila.toString());

        assertEquals(1, fila.size());
    }
}
