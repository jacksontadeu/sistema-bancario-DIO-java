package Models;

public class ContaBancaria implements IContaBancaria {

    private static int SEQUENCIAL = 1;

    private static int AGENCIA_PADRAO = 1;

    protected int agencia;

    protected int numero;

    protected double saldo;

    public ContaBancaria() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta..: %d", this.numero));
        System.out.println(String.format("Saldo..: %.2f", this.saldo));
    }
}
