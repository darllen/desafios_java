package apresentacao.segundo;

public interface ProcessadorPagamento {

    void debitar(double valor);
    void creditar(double valor);
}
