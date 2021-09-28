## Collections

Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade. Serve para armazenar e processar conjutos de dados de forma eficiente.
Antes do JAVA 2 (JDK 1.2), a implementação de coleções na linguagem JAVA incluia poucas classes e não tinha a organização de um framework.

##### Composição de uma Collection

:one: **Interfaces:**

* É um contraro de quando assumido por uma classe, deve ser implementado.

:two: **Implementação ou Classes:**

* São as materializações, a codificação das interfaces.

:three: **Algoritmo:**

* É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

## java.util.List

Permite adicionar elementos duplicados e garante a ordem de inserção.

**ArrayList:**

* Essa classe utiliza um Array para guardar os elementos que são inseridos
* Demanda mais tempo na manipulação, como remoção de elementos.
* Implementa apenas `ListInterface`.
* É preferível sua utilização em aplicações que demandam mais de operações de pesquisas.

**LinkedList:**

* Utiliza uma estrutura chamada `Lista duplamente ligada` para fazer o armazenamento dos elementos.
* Na manipulação como exclusão de elementos, é mais rápido, comparado com `ArrayList`
* Implementa tanto de `ListInterface` quando de `QueueInterface`
* É preferível sua utilização em aplicações que demandam mais de operções de inserção e exclusão de elementos.