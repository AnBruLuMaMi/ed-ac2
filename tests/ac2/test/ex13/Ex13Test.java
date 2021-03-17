package ac2.test.ex13;

import ac2.ex11.ListaNodo;
import ac2.ex11.exceptions.InvalidPositionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex13Test {
    @Test
    void test() {
        /*13 - R: Uma forma de validar se a posição pertence a lista é armazenando em uma propriedade da classe DNode a referencia da lista,
        e adicionar dentro da classe da lista, no método que valida a posição, um if verificando se a instancia armazenada na propriedade da classe posição
        é igual a instancia da lista que ela foi adicionada */

        ListaNodo<Integer> primeiraLista = new ListaNodo();

        assertEquals("[]", primeiraLista.toString());

        primeiraLista.addFirst(8);
        assertEquals("[8]", primeiraLista.toString());

        ListaNodo<Integer> segundaLista = new ListaNodo();

        assertEquals("[]", segundaLista.toString());

        segundaLista.addFirst(9);
        assertEquals("[9]", segundaLista.toString());

        //Adicionando na segunda lista usando uma posição da primeira
        assertThrows(InvalidPositionException.class, () -> segundaLista.addAfter(primeiraLista.last(), 10));

        assertEquals("[8]", primeiraLista.toString());
        assertEquals("[9]", segundaLista.toString());
    }
}
