package Models;

public class ContaCorrente extends ContaBancaria {
    @Override
    public void imprimirExtrato(){
        System.out.println("***Extrato de Conta Corrente***");
        super.imprimirExtrato();
        System.out.println("********************************");
    }


}
