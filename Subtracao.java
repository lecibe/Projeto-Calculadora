
public class Subtracao implements OperacaoMatematica {

   private final int primeiroValor;
   private final int segundoValor;

    public Subtracao (int primeiroValor, int segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    @Override
    public int operacaoMatematica() {
            return primeiroValor - segundoValor;
    }


    @Override
    public String toString() {
        return "Subtração de " + primeiroValor + " - " + segundoValor + " = " + operacaoMatematica();

    }
}
