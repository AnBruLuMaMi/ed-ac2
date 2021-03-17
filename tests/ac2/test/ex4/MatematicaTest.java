package ac2.test.ex4;

import ac2.ex4.Matematica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatematicaTest {
    @Test
    void test() {
        assertEquals(true, Matematica.ValidarExpressao("[(5 + x)/4 – 2*(y + z)]"));
        assertEquals(true, Matematica.ValidarExpressao("()(( )){([( )])}"));
        assertEquals(true, Matematica.ValidarExpressao("((( )(( )){([( )])}))"));
        assertEquals(false, Matematica.ValidarExpressao(")(( )){([( )])}"));
        assertEquals(false, Matematica.ValidarExpressao("({[])}"));
        assertEquals(false, Matematica.ValidarExpressao("("));
    }
}
