public class ContaCorrente extends Conta{
    // ContaCorrente herda de Conta

    //Reescrever o método da classe mãe

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        this.juro();
    }

    private void juro(){
        this.saldo -= 1;
    }
}
