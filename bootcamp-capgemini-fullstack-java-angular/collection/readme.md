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

## Exercícios Práticos

##### Instanciando uma lista de notas com ArrayList

`List<Tipo> lista = new ArrayList<>();`

##### Adicionando objetos (notas) na lista

`lista.add(valor);`

##### Exibindo a posição(index) de um valor específico

`lista.indexOf(valor)`;

##### Adicionando um valor em uma posição específica da lista

`lista.add(index, valor);`

##### Substituindo um valor por outro valor

`lista.set(lista.indexOf(valorSai), valorEntra);`

##### Conferindo se um valor está na lista

`lista.contains(valor)`

##### Mostrando todos os valores em ordem que foram adicionados

`System.out.println(lista);`

##### Ordenando os valores

`Collections.sort(lista);`

##### Exibindo o xº valor adicionado

`lista.get(x - 1)`

##### Exibindo o menor valor da lista

`Collections.min(lista)`

##### Exibindo o maior valor da lista

`Collections.max(lista)`

##### Removendo o ultimo valor da lista

`lista.remove(lista.size() - 1);`

##### Efetuando a soma de todos os valores

```
tipo var = 0;
Iterator<Tipo> iterator = lista.iterator();
	while (iterator.hasNext()){
    	tipo next = iterator.next();
        var += next;
    }
System.out.println("A soma é: " + var);
```

##### Exibindo a media dos valores

`(var / lista.size())`

##### Removendo os valores menores que x

```
Iterator<Tipo> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            tipo next = iterator1.next();
            if (next < x){
                iterator1.remove();
            }
        }
```

##### Limpando toda a lista

`lista.clear();`

##### Verificando se a lista está vazia

`lista.isEmpty()`