package ac2.ex4;

import ac2.ex3.PilhaLSE;
import ac2.ex3.interfaces.IPilhaLSE;

public class Matematica {
    public static boolean ValidarExpressao(String expressaoMatematica) {
        IPilhaLSE<Character> pilha = new PilhaLSE<>();

        boolean deixouAberto = false;

        for (int i = 0; i < expressaoMatematica.length(); i++) {
            char caracter = expressaoMatematica.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pilha.push(caracter);
                deixouAberto = true;
                continue;
            }

            if (caracter != ')' && caracter != '}' && caracter != ']')
                continue;

            if (pilha.isEmpty())
                return false;

            char ultimoCaracterAberto;
            deixouAberto = false;

            switch (caracter) {
                case ')':
                    ultimoCaracterAberto = pilha.pop();

                    if (ultimoCaracterAberto != '(')
                        return false;

                    break;
                case '}':
                    ultimoCaracterAberto = pilha.pop();

                    if (ultimoCaracterAberto != '{')
                        return false;

                    break;
                case ']':
                    ultimoCaracterAberto = pilha.pop();

                    if (ultimoCaracterAberto != '[')
                        return false;

                    break;
            }
        }

        if (deixouAberto) return false;

        return true;
    }
}
