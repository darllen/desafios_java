package parte5;

import java.time.LocalDate;

public class Boletoo {
    private String fornecedor;
    private double valor;
    private LocalDate dataVencimento;


    public Boletoo(String fornecedor, double valor, LocalDate dataVencimento) {
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }


    public boolean verificarEmDia(){
        LocalDate agora = LocalDate.now();
        boolean retorno = true;



        return retorno;
    }


}
