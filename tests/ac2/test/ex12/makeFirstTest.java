package ac2.test.ex12;

import ac2.ex11.ListaNodo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class makeFirstTest {
    @Test
    void test() {
        ListaNodo<Integer> l = new ListaNodo();

        assertEquals("[]", l.toString(), "[]");

        l.addFirst(8);
        l.addAfter(l.last(), 2);
        l.addAfter(l.last(), 7);
        l.addAfter(l.last(), 5);

        assertEquals("[8, 2, 7, 5]", l.toString(), "[8, 2, 7, 5]");

        l.makeFirst(l.last());
        assertEquals("[5, 8, 2, 7]", l.toString());

        l.makeFirst(l.prev(l.last()));
        assertEquals("[2, 5, 8, 7]", l.toString());

        l.makeFirst(l.first());
        assertEquals("[2, 5, 8, 7]", l.toString());

        l.makeFirst(l.next(l.first()));
        assertEquals("[5, 2, 8, 7]", l.toString());
    }
}
