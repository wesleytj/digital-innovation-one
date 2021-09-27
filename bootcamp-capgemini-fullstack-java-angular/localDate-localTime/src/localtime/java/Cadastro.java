package localtime.java;

import java.time.LocalTime;
import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);

    String nome;
    byte idade;
    LocalTime momento;

    public void cadastro(){
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextByte();
        momento = LocalTime.now();
    }

    public void informacoes(){
        System.out.println("===== DADOS CADASTRADOS =====");
        System.out.println("===== Nome: " + nome);
        System.out.println("===== Idade: " + idade);
        System.out.println("===== Momento do cadastro: " + momento);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro obj = new Cadastro();

        System.out.println("====================");
        System.out.println("===== LOCALTIME =====");
        System.out.println("====================");

        System.out.println("Você gostaria de iniciar seu cadastro agora? [0] - Sim [1] - Não");
        int option = sc.nextInt();
        if(option == 0){
            obj.cadastro();
            obj.informacoes();
        }else{
            System.out.println("Programa encerrado!");
        }

    }
}
