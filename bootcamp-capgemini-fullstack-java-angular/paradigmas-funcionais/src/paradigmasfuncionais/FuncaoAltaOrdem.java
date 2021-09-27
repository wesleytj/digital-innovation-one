package paradigmasfuncionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo adicao = (a, b) -> a + b;
        Calculo subtracao = (a, b) -> a - b;
        Calculo divisao = (a, b) -> a / b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo resto = (a, b) -> a % b;

        System.out.println(executarOperacao(adicao, 10,2));
        System.out.println(executarOperacao(subtracao, 10,2));
        System.out.println(executarOperacao(divisao, 10,2));
        System.out.println(executarOperacao(multiplicacao, 10,2));
        System.out.println(executarOperacao(resto, 10, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}