## Paradigma Imperativo
 É aquele que expressa o código através de comandos ao computador, nele é possível ter controle de estado dos objetos.

 ```java
 	public class ParadigmaImperativo{
 		public static void main(String [] args){
 			int valor = 10; //instrucao
 			int resultado = valor * 3;
 			System.out.println("O resultado é: " + resultado);
 			
 			//As instruções são instantâneas.
 			//No momento que está declarando, elas estão sendo executadas.
 		}
 	}
 ```
 
## Paradigma Funcional
Programação Funcional é o processo de construir Softwares através de composição de funções puras, evitando compartilhamento de estados, dados mutáveis e efeitos colaterais.
É declarativa ao invés de imperativo, essa é uma definição de Eric Elliott.

Damos uma regra, uma regra, uma declaração de como queremos que o programa se comporte.

 ```java
public class ParadigmaFuncional{
	public static void main(String [] args){
	//  Conceito do Paradigma Funcional
	UnaryOperator<Integer> calculaValorVezesTres = valor -> valor * 3;
	int valor = 10;
	
	System.out.println("O resultado é: " + calculaValorVezesTres.apply(10));
	}
}

 ``` 
# CONCEITOS FUNDAMENTAIS DA PROGRAMAÇÃO FUNCIONAL
## Composição de Funções
É criar uma nova função através de composição de outras. Por exemplo: 
- Criar uma função que filtra um array, filtrando somente os números pares e multiplicando por dois.

```java
	public class Exemplo{
		public static void main(String [] args){
			int[] valores = {1,2,3,4};
			Arrays.stream(valores)
				.filter(numero -> numero % 2 == 0)
				.map(numero -> numero * 2)
				.forEach(numero -> System.out.println(numero));

		}
	}
```

## Funções Puras
É chamada de pura, quando invocada mais de uma vez e produz exatamente o mesmo resultado.

## Imutabilidade
Significa que uma vez que a uma variável que recebeu um valor, vai possuir esse valor para sempre, ou, quando criamos um objeto, ele não pode ser modificado.

```java
	public class Exemplo{
		public static void main(String [] args){
			int valor = 20;
			UnaryOperator<Integer> retornarDobro = valor -> valor * 2;
			System.out.println(retornarDobro.apply(valor));
				//Retorna o dobro do valor
			System.out.println(valor);
				//O valor não é alterado
		}
	}

```

## Imperativo X Declarativo
É muito comum aprender a programar de forma imperativa, onde mandamos alguém fazer algo. Exemplo:
- Busque o usuário 15 no banco de dados.

Na programação funcional tentamos programar de forma declarativa, onde declaramos o que desejamos, sem explicirar como será feito.
- Qual usuário 15?
- Quais os erros dessas informações?

###### Resolver o exercício 01.

## Lambda no Java
Os lambdas obedecem o conceito de paradigma funcional, com eles podemos facilitar a legibilidade do código, além disso, com a nova API Funcional do Java, podemos ter uma alta produtividade para lidar com objetos.

## Interfaces Funcionais
São interfaces que possuem apenas um método abstrato. Exemplo:
```java
public interface Funcao{
	String gerar(String valor);
}
```
Geralmente, as interfaces funcionais possuem uma anotação em nível de classe `@FunctionalInterface` para forçar o compilador a apontar um erro se a interface não estiver de acordo com as regras de uma interface funcional.
Essa anotação não é obrigatória, pois o compilador consegue reconhecer uma interface em tempo de compilação.
Antes do Java8, para implementar um comportamento específico para uma únicaclasse, deveríamos utilizar uma classe anônima para implementar este comportamento.

##### Sintaxe padrão
`InterfaceFuncional nomeVariavel = parametro -> logica`

```java
	public class FuncaoComLambda{
		public static void main(String [] args){
			Funcao addPrefixoSr = valor -> "Sr. " + valor;
			System.out.println(addPrefixoSr.gerar("João"));
		}
	}
	
	@FunctionalInterface
	interface Funcao{
		String gerar(String valor);
	}

```
##### !!!ATENÇÃO!!!
##### Quando uma lambda possui apenas uma instrução no corpo de sua lógica, não é necessário a utilização de chaves {} 
`Funcao addPrefixoSr = valor -> "Sr. " + valor;`
##### Se a função possuir mais de uma instrução, DEVEMOS utilizar as chaves e além disso, DEVEMOS explicitar o retorno caso o mesmo seja diferente de void. 
```
Funcao addPrefixoSr = valor -> {
	String valorComPrefixo = "Sr. " + valor;
	String valorComPrefixoEPontoFinal = valorComPrefixo + ".";
	return valorComPrefixoEPontoFinal;
}
```

###### Resolver exercícios 02.
