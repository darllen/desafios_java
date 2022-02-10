public abstract class Conta { 

    protected double saldo;
    public int conta;


    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void verSaldo(){
        System.out.println("Saldo R$ "+ this.saldo);
    }

    //método abstrato
    protected abstract void juro();

}
