public class Main {

    public static void main(String args[]){
    ContaCorrente cc= new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    cc.depositar(100);
    cc.sacar(50);
    cp.depositar(100);
    cp.sacar(50);

    cc.verSaldo();
    cp.verSaldo();

    }

}
