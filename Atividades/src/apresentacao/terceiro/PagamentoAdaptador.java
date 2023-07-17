package apresentacao.terceiro;


import apresentacao.terceiro.lib.PagamentoLib;

public class PagamentoAdaptador extends PagamentoLib implements ProcessadorPagamento {
    public void debitar(double valor) {
        this.autorizar(valor);
        super.capturar(valor);
    }
    public void creditar(double valor) {
        super.creditar(valor);
    }
    @Override
    public boolean autorizar(double valor) {
        return true;
    }
}
