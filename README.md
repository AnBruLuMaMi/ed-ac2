## Membros do Grupo   

| Nome                            | RA |
|--------------------------------|--------- |
| André Lucas Fabbris de Toledo   | 1902777 |
| Bruno Alkimim de Negreiros      | 1902646 |
| Lucas de Alencar Silva          | 1902989 |
| Mariana Rodrigues Zubi da Silva | 1904204 |
| Milena Bispo Gomes              | 1904052 |
    
# AC2 - Estrutura de Dados
1. Desenvolva um projeto no GitHub que Implemente os testes o TAD Lista Arranjo.<br>***R:** /tests/ac2.test.ex1*
2. Desenvolva um projeto no GitHub que estenda a classe de testes do TAD Pilha
implementado usando array que teste uma pilha de String.<br>***R:** /tests/ac2.test.ex2*
3. Desenvolva um projeto no GitHub que implemente os testes do TAD Pilha usando LSE. <br>***R:** /tests/ac2.test.ex3*
4. Exercícios:
    - a. Crie testes e programas Java que:
    - b. Inverta os dados de um arranjo usando o TAD Pilha usando LSE. <br>***R:** /tests/ac2.test.ex4/InversaoTest*
    - c. Verifique se parênteses, colchetes e chaves estão corretos numa expressão
matemática, por exemplo: [(5 + x)/4 – 2*(y + z)]
  -- i. Correto: ()(( )){([( )])}
  -- ii. Correto: ((( )(( )){([( )])}))
  -- iii. Incorreto: )(( )){([( )])}
  -- iv. Incorreto: ({[])}
  -- v. Incorreto: ( <br>***R:** /tests/ac2.test.ex4/MatematicaTest*
5. Suponha que uma lista inicialmente vazia S tenha executado um total de 25 operações
push, 12 operações top e 10 operações pop, 3 das quais geraram
StackEmptyExceptions, que foram capturadas e ignoradas. Qual é o tamanho corrente
de S? <br>***R:** O tamanho atual de S será 18*
6. Se implementarmos a pilha S do problema anterior usando um arranjo, então qual
será o valor corrente da variável de instância top? <br>***R:** O valor da váriavel top estará contido no índice 17 do arranjo de S*
7. Descreva a saída resultante da seguinte série de operações de pilha: push(5), push(3),
pop( ),push(2), push(8), pop( ), pop( ), push(9), push(1), pop( ), push(7), push(6), pop(),
pop(), push(4), pop(), pop( ).   
    ***R:***<table><tr><th>Operação</th><th>Saída</th><th>Pilha</th></tr><tr><td>push(5)</td><td>-</td><td>[5]</td></tr><tr><td>push(3)</td><td>-</td><td>[5,3]</td></tr><tr><td>pop()</td><td>3</td><td>[5]</td></tr><tr><td>push(2)</td><td>-</td><td>[5,2]</td></tr><tr><td>push(8)</td><td>-</td><td>[5,2,8]</td></tr><tr><td>pop()</td><td>8</td><td>[5,2]</td></tr><tr><td>pop()</td><td>2</td><td>[5]</td></tr><tr><td>push(9)</td><td>-</td><td>[5,9]</td></tr><tr><td>push(1)</td><td>-</td><td>[5,9,1]</td></tr><tr><td>pop()</td><td>1</td><td>[5,9]</td></tr><tr><td>push(7)</td><td>-</td><td>[5,9,7]</td></tr><tr><td>push(6)</td><td>-</td><td>[5,9,7,6]</td></tr><tr><td>pop()</td><td>6</td><td>[5,9,7]</td></tr><tr><td>pop()</td><td>7</td><td>[5,9]</td></tr><tr><td>push(4)</td><td>-</td><td>[5,9,4]</td></tr><tr><td>pop()</td><td>4</td><td>[5,9]</td></tr><tr><td>pop()</td><td>9</td><td>[5]</td></tr></table>
8. Crie os testes e implemente o TAD Fila. Use implementação do TAD Pilha como
exemplo.<br>***R:** /tests/ac2.test.ex8*
9. Implemente o TAD Fila com base nos testes e no fragmento de implementação de
duas operações apresentados a seguir (Tarefa 13 - TAD-Fila.pptx, slidese 19, 20 e 21).<br>***R:** /tests/ac2.test.ex9*
10. Desenhe figuras demonstrando cada um dos passos principais dos métodos
addBefore(p, e), addFirst(e) e addLast(e) do TAD lista de nodos.    
    ***R:***<table><tr><th>addBefore(p, e)</th><th>addFirst(e)</th><th>addLast(e)</th></tr><tr><td><img src="https://github.com/AnBruLuMaMi/ed-ac2/blob/main/imgs/ex10-addbefore.png" alt="drawing" width="200"/></td><td><img src="https://github.com/AnBruLuMaMi/ed-ac2/blob/main/imgs/ex10-addFirst.png" alt="drawing" width="200"/></td><td><img src="https://github.com/AnBruLuMaMi/ed-ac2/blob/main/imgs/ex10-addLast.png" alt="drawing" width="200"/></td></tr></table>
11. Implemente um método não recursivo para inverter uma lista de nodos. <br>***R:** /tests/ac2.test.ex11*
12. Implemente um novo método, makeFirst(p), que move o elemento na posição p para a
primeira posição, mantendo a ordem relativa dos demais elementos inalterada. <br>***R:** /tests/ac2.test.ex12*
13. A implementação de NodePositionList não faz verificações de erro para testar se uma
dada posição p é realmente membro dessa lista em particular.
    - a. Por exemplo, se p é uma posição da lista S, a execução T.addAfter(p,e) deveria
lançar a exceção InvalidPositionException pois p não é uma posição de T.
    - b. Descreva como alterar a implementação de NodePositionList de uma forma
eficiente que impeça esses maus usos. <br>***R:** Uma forma de validar se a posição pertence a lista, é armazenando em uma propriedade da classe DNode a referencia da lista,
        e adicionar dentro da classe da lista, no método que valida a posição, um if verificando se a instancia armazenada na propriedade da classe DNode
        é igual a instancia da lista que ela foi adicionada. Exemplo: /tests/ac2.test.ex13*
