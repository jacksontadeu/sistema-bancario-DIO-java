package Models;

public class ContaPoupanca extends ContaBancaria {
    @Override
    public void imprimirExtrato(){
        System.out.println("***Extrato de Conta Poupança***");
        super.imprimirExtrato();
        System.out.println("********************************");
    }


}
