import Models.ContaBancaria;
import Models.ContaCorrente;
import Models.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente();
        ContaBancaria cp = new ContaPoupanca();
        ContaBancaria cp1 = new ContaPoupanca();

        cc.imprimirExtrato();
        cc.depositar(1200);
        cc.imprimirExtrato();
        cc.sacar(100);
        cc.imprimirExtrato();
        cc.transferir(cp,500);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}