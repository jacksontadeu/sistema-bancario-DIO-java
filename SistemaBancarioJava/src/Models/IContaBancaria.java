package Models;

public interface IContaBancaria {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(ContaBancaria contaDestino, double valor);

    void imprimirExtrato();
}
