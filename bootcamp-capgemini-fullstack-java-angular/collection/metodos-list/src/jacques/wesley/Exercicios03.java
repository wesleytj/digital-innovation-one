package jacques.wesley;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicios03 {
    //Faça um programa que receba a temperatura média dos 6 primeiros meses
    //do ano e armazene-as em uma lista
        //Após isto, calcule a media semestral das temperaturas e mostre
        //todas as temperaturas acima desta media, e em que mes elas ocorreram
        //(mostrar mes por extenso.

    public static void main(String[] args) {
        List<Meses> meses = new ArrayList<>(); //Lista iniciada
        for (int i=0; i<6; i++){

        }

        Temperaturas t = new Temperaturas(); //Temperatura instanciada

        double temp = 0.0;
        for (int i=0; i < meses.size(); i++) {
            temp = t.gerarTemp();
            System.out.printf("%.2f \n", temp);
        }
    }
}

class Meses{
    private String nome;
    private byte id;
    private Temperaturas temp;

    public Meses(byte id, String nome, Temperaturas temp){
        this.id = id;
        this.nome = nome;
        this.temp = temp;
    }

    public String getNome() {
        return nome;
    }

    public byte getId() {
        return id;
    }

    public Temperaturas getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Meses{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", temp=" + temp +
                '}';
    }
}

class Temperaturas{
    private double temp;

    public double getTemp() {
        return temp;
    }

    public double gerarTemp(){
        Random aleatorio = new Random();
        double temp = aleatorio.nextDouble() * 100;

        return temp;
    }

    @Override
    public String toString() {
        return "Temperaturas{" +
                "temp=" + temp +
                '}';
    }
}
