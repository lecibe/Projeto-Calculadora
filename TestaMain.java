import java.util.List;
import java.util.ArrayList;

public class TestaMain {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Adicao adicao = new Adicao(10, 20);
        calculadora.executa(adicao);

        Divisao divisao = new Divisao(60, 4);
        calculadora.executa(divisao);

        Multiplicacao multiplicacao = new Multiplicacao(56, 48);
        calculadora.executa(multiplicacao);

        Subtracao subtracao = new Subtracao(88,10);
        calculadora.executa(subtracao);


        System.out.println("Histórico calculadora");
        System.out.println(calculadora.getOperacoes());








    }

}


