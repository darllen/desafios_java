package com.example.apresentacao.terceiro;


import com.example.apresentacao.terceiro.lib.PagamentoLib;

public class PagamentoAdaptador extends PagamentoLib implements ProcessadorPagamento {

    public void pagar(double valor) {
        super.autorizar(valor);
        super.capturar(valor);
    }
    public void creditar(double valor) {
        super.creditar(valor);
    }

}
