package com.example.apresentacao.primeiro;


public class Cliente {

    public static void main(String[] args) {
        PagamentoAdaptador credito = new PagamentoAdaptador();
        credito.debitar(100);
    }
}
