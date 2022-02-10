public final class ContaCorrente extends Conta{

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        this.juro();
    }

    @Override
    protected void juro(){
        this.saldo +=1;
    }
}
