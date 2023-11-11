public class ContaCorrente extends Conta implements Operavel{
    @Override
    protected double obterSaldoAtual() {
        return super.saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public double sacar(double valor) {
        saldo -= valor;
        return saldo;
    }
}