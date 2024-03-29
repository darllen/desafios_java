package apresentacao.terceiro.lib;

public class PagamentoLib {
    private double limite;
    private double limiteDisponivel;

    protected boolean autorizar(double valor) {
        if(valor <= limiteDisponivel){
            return true;
        } else {
            return false;
        }
    }

    protected void capturar(double valor) {
        this.limiteDisponivel -= valor;
    }

    protected void creditar(double valor) {
        if((this.limiteDisponivel + valor) <= this.limite){
            this.limiteDisponivel += valor;
        } else {
            this.limiteDisponivel = this.limite;
        }
    }







    public PagamentoLib(double limite, double limiteDisponivel) {
        this.limite = limite;
        this.limiteDisponivel = limiteDisponivel;
    }

    public PagamentoLib() {
    }
}
