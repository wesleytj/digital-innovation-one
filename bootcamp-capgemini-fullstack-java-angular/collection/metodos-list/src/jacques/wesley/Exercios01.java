package jacques.wesley;

import java.util.*;

public class Exercios01 {
    public static void main(String[] args) {
        //01. Crie uma lista e adicione 7 notas nessa lista
        System.out.println("Criando lista...");
        List<Double> notas = new ArrayList<>();
        notas.add(3d); //3d == 3.0
        notas.add(2d);
        notas.add(1d);
        notas.add(8d);
        notas.add(4d);
        notas.add(5d);
        notas.add(9d);
        System.out.println("01 - Lista criada: \n" + notas);

        //02. Exiba a posicao da nota 5.0
        System.out.println("02 - A nota 5.0 está na posição: " + notas.indexOf(5d));

        //03. Adicione na lista a nota 8.5 na posição 4.
        System.out.println("03 - Adicionando nota...");
        notas.add(4, 8.5);
        System.out.println("Nota adicionada... \n" + notas);

        //04 - Substitua a nota 5.0 pela nota 6.0
        System.out.println("04 - Substituindo nota...");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println("Nota substiuida... \n" + notas);

        //05 - Confira se a nota 5.0 está na lista
        if(notas.contains(5d))
            System.out.println("05 - A nota 5.0 está na lista, na posição " + notas.indexOf(5d));
        else
            System.out.println("05 - A nota 5.0 não está na lista... \n" + notas);

        //06. Exiba todas as notas na ordem que foram informadas e depois em ordem crescente
        System.out.println("06 - Notas em ordem que foram informadas: \n" + notas);
//        Collections.sort(notas);
        System.out.println("06 - Notas em ordem crescente: \n" + notas);

        //07. Exiba a terceira nota informada
        System.out.println("07 - A terceira nota informada é: " + notas.get(3 - 1));

        //08. Exiba a menor nota
        System.out.println("08 - A menor nota é: " + Collections.min(notas));

        //09. Exiba a maior nota
        System.out.println("09 - A maior nota é: " + Collections.max(notas));

        //10. Remova a última nota
        System.out.println("10 - Removendo nota...");
        notas.remove(notas.size() - 1);
        System.out.println("Nota removida... \n" + notas);

        //11. Efetue a soma das notas
        System.out.println("11 - Somando notas...");
        double soma = 0;
//        for ( double nota : notas ) {
//            soma += nota;
//        }
//        OU
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma é: " + soma);

        //12. Exiba a media das notas
        System.out.println("12 - A media das notas é: " + (soma / notas.size()));

        //13. Remova as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println("13 - Lista sem as notas menores que 7 \n" + notas);

        //14. Limpe toda a lista
        System.out.println("14 - Limpando lista...");
        notas.clear();
        System.out.println(notas);

        //15. Verifique se a lista esta vazia
        System.out.println("15 - A lista está vazia? " + notas.isEmpty());
    }
}
