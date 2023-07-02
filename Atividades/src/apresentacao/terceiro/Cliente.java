package com.example.apresentacao.terceiro;

public class Cliente {

    public static void main(String[] args) {
        PagamentoAdaptador credito = new PagamentoAdaptador();
        credito.pagar(100);
        credito.creditar(20);
    }
}
