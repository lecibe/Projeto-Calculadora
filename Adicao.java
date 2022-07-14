import java.util.Scanner;

public class Adicao implements OperacaoMatematica {

   private final int primeiroValor;
    private final int segundoValor;

    public Adicao (int primeiroValor, int segundoValor){
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    @Override
    public int operacaoMatematica() {
        return primeiroValor + segundoValor;
    }


    @Override
    public String toString() {
    return "Soma de " + primeiroValor + " + " + segundoValor + " = " + operacaoMatematica();

    }

}

