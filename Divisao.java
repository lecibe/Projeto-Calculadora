
public class Divisao  implements OperacaoMatematica {;

   private final int primeiroValor;
   private final int segundoValor;

    public Divisao (int primeiroValor, int segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }
    @Override
    public int operacaoMatematica() {
        return primeiroValor / segundoValor;
    }


    @Override
    public String toString() {
        return "Divisão de " + primeiroValor + " + " + segundoValor + " = " + operacaoMatematica();

    }
}
