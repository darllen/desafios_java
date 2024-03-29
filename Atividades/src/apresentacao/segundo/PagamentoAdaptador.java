package apresentacao.segundo;


import apresentacao.segundo.lib.PagamentoLib;

public class PagamentoAdaptador implements ProcessadorPagamento {
    PagamentoLib pagamentos = new PagamentoLib();

    public void debitar(double valor){
        pagamentos.autorizar(valor);
        pagamentos.capturar(valor);
    }

    public void creditar(double valor){
        pagamentos.creditar(valor);
    }
}
