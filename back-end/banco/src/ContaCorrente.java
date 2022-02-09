public class ContaCorrente {

    private double saldo;
    public int conta;


    public void sacar(double valor){
       if (this.saldo >= valor){
           this.saldo -= valor;
           this.juro();
       }else{
           System.out.println("Saldo Insuficiente");
       }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void verSaldo(){
        this.juro();
        System.out.println("Saldo R$ "+ this.saldo);

    }

    private void juro(){
        this.saldo -= 1;
    }
}
