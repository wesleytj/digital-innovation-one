# Orientação a Objetos

A Orientação a Objetos vem para trazer uma representação do mundo real para dentro do mundo computacional.

#### Diferença entre Programação Estruturada e Programação Orientada a Objetos (POO)

* Programação Estruturada:
  * É uma programação linear e estruturada, ou seja, as tomadas de decisões são feitas de forma ordenada, por meio de verificações condicionais e interações, utilizando como recursos variáveis e rotinas para o desenvolvimento dos programas.

##### Qual o problema da Programação Estruturada?

Na verdade, não existe um problema em sí, porém, quando utilizada em programas complexos, a organização do código se torna um desafio.
Justamente por não oferecer uma forma simples para agrupar os dados e protege-los.

##### Mitos da Programação Orientada a Objetos

Dizer que o uso de uma linguagem OO, faz seu programa ser automaticamente orientado a objetos, é um mito.
É muito comuns termos programas em linguagens de OO que utilizam componentes da POO, porém, sua implementação é totalmente estruturada. 

### Simula 67

A primeira linguagem orientada a objetos, foi desenvolvida nos anos 60 pelos noruegueses `Ole-Johan Dahl` e `Kristen Nygoard`.
O `Simula 67` tinha muitos dos conceitos das principais linguagens OO de hoje, como:

* Classes e Objetos
* Métodos Virtuais
* Frameworks
* Concorrência
* Gerenciamento de Memoria

## O que é Função Utilitária e Conceitos Básicos

Chamamos de objetos a representação programática de algo, como por exemplo, um carro. Onde temos atributos e ações que podem ser tomadas ou executadas por ele.
Um Carro tem:

* Altura
* Largura
* Cor
* Combutível
* Número de Passageiros
* etc...

Um Carro pode:

* Ligar
* Desligar
* Acelerar
* Freiar
* etc...

#### Como identificar uma função utilitária?

* Ela consegue se resolver por ela mesma, sem dependências externas?
* Os parâmetros de entrada são simples e diretos?
* O resultado de saída também é simples e direto?

##### Exemplo de função utilitária

Um exemplo clássico é a validação de CPF e CNPJ.

:heavy_check_mark: Entrada Simples

:heavy_check_mark:  Saída Simples

:heavy_check_mark:  Não depende de recursos externos (Ex: Banco de Dados)

**Obs.** Independente da complexidade interna de uma validação de CPF ou CNPJ, temos uma entrada simples (o CPF) e uma saída simples (Verdadeiro ou Falso).

## Conceitos básicos da Orientação a Objetos

##### Classe e Objeto 

Uma representação dados em objetos ou entidades para o processamento de outros objetos.

##### Associação de Classes

Quando utilizamos uma classe dentro de outra classe

##### Herança

É a utilização de uma classe base, fazendo com que uma nova classe tenha todos os atributos e funções da classe pai, mais as suas próprias.

##### Encapsulamento

É a possibilidade de proteger alguns dados ou funcionalidades da classe, não permitindo que seus consumidores possam acessa-la.

##### Polimorfismo

Aqui podemos criar funções que terão o mesmo nome, porém, podem ter diferentes processamentos, implementações e entradas. 