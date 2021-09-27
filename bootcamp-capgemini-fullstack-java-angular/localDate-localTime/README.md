## LocalDate

É uma classe imutável para representar uma data.
Seu formato padrão é `yyyy-MM-dd` exemplo `2021-09-20`

```java
import java.time.LocalDate;

public class Exemplo{
	public static void main (String [] args){
		LocalDate hoje	= LocalDate.now();
		System.out.println(hoje);
		
	}	
}

```

Exemplo de como podemos manipular o LocalDate

```java
import java.time.LocalDate;

public class Exemplo{
	public static void main (String [] args){
		LocalDate hoje	= LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		System.out.println(hoje);
		System.out.println(ontem);		
	}	
}

```

## LocalTime

É uma classe imutável que representa um padrão de `hora-minutos-segundos`.
Pode ser representado até o nível de nanosegundos.
Sua utilização é parecida com a `LocalDate`.

```java
import java.time.LocalTime;

public class Exemplo{
	public static void main (String [] args){
		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		
	}	
}

```

Exemplo de como podemos manipular o LocalTime

```java
import java.time.LocalTime;

public class Exemplo{
	public static void main (String [] args){
		LocalTime agora = LocalTime.now();
		LocalTime maisUmaHora = agora.plusHours(1);
		System.out.println(agora);
		System.out.println(maisUmaHora);
		
	}	
}

```

## LocalDateTime

Funciona como uma concatenação entre `LocalDate` + `LocalTime`.
Também é uma classe imutável e pode-se trabalhar com dia e hora de uma só vez.

```java
import java.time.LocalDateTime;

public class Exemplo{
	public static void main (String [] args){
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
		System.out.println(agora);
		System.out.println(futuro);
		
	}	
}

```
