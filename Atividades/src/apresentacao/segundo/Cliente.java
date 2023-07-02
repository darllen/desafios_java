package com.example.apresentacao.segundo;

public class Cliente {

    public static void main(String[] args) {
        ProcessadorPagamento credito = new PagamentoAdaptador();
        credito.debitar(100);
    }
}
