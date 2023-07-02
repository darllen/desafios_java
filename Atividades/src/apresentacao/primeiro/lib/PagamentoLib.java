package com.example.apresentacao.primeiro.lib;

public class PagamentoLib {
    private double limite;
    private double limiteDisponivel;


    public boolean autorizar(double valor) {
        if(valor <= limiteDisponivel){
            return true;
        } else {
            return false;
        }
    }

    public void capturar(double valor) {
        // captura
        this.limiteDisponivel -= valor;
    }

    public void creditar(double valor) {
        // credita - libera o limite
        if((this.limiteDisponivel + valor) <= this.limite){
            this.limiteDisponivel += valor;
        } else {
            this.limiteDisponivel = this.limite;
        }

    }
}
