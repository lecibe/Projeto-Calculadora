import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {


    private List<OperacaoMatematica> operacoes = new ArrayList<>();

    public List<OperacaoMatematica> getOperacoes(){
        return operacoes;
    }

    public int executa(OperacaoMatematica calculoMatematico){
       operacoes.add(calculoMatematico);
       return calculoMatematico.operacaoMatematica();
    }

    public static int escolhaUmaOperacao() {
        System.out.println("Digite o número da operação desejada: \n" +
                "1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - Divisão \n" +
                "4 - Multiplicação \n" +
                "5 - Sair");
             Scanner scannerTeclado = new Scanner(System.in);
             return scannerTeclado.nextInt();
    }
}

