package exercicio03;

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;
    @Override
    public double CalacularValorComImposto() {

        return valor + valorImposto;
    }
}
