package br.com.alltechsl;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        Consumer<String> imprimeFrase1 = frase -> System.out.println(frase);
        Consumer<String> imprimeFrase2 = System.out::print;
        imprimeFrase1.accept("Primeira forma de imprimir a frase");
        imprimeFrase2.accept("Segunda forma de imprimeir a frase");
    }
}
