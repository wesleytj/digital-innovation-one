package jacques.wesley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicios02 {
    /*Dadas as seguintes informaçoes sobre meus gatos,
    * crie uma lista e ordene esta lista exibindo:
    * (nome - idade - cor);
    *
    * Gato1 = nome: Jon, idade: 18, cor: preto
    * Gato2 = nome: Simba, idade 6, cor: tigrado
    * Gato3 = nome: Jon, idade: 12, cor: amarelo*/

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", (byte) 18, "Amarelo"));
            add(new Gato("Simba", (byte) 6, "Tigrado"));
            add(new Gato("Jon", (byte) 12, "Amarelo"));
        }};

        System.out.println("Mostre pela ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("Mostre uma ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Mostre pela Ordem Natural (nome): ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Mostre pela ordem Idade: ");
        Collections.sort(meusGatos, new ComparatorIdade());
//        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Mostre pela ordem Cor: ");
        Collections.sort(meusGatos, new ComparatorCor());
//        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Mostre pela ordem Nome/Cor/Idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);



    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private byte idade;
    private String cor;

    public Gato (String nome, byte idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public byte getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return (byte) Byte.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase((g2.getCor()));
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return (byte) Byte.compare(g1.getIdade(), g2.getIdade());
    }
}