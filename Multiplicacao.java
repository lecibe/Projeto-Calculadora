
public class Multiplicacao implements OperacaoMatematica {

    private final int primeiroValor;
    private final int segundoValor;

    public Multiplicacao (int primeiroValor, int segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    @Override
    public int operacaoMatematica() {
        return primeiroValor * segundoValor;
    }



    @Override
    public String toString() {
        return "Multiplicação de " + primeiroValor + " * " + segundoValor + " = " + operacaoMatematica();

    }
}
