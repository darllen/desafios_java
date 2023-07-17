package apresentacao.terceiro;

public class Cliente {

    public static void main(String[] args) {
        PagamentoAdaptador credito = new PagamentoAdaptador();
        credito.debitar(100);
        credito.creditar(20);
    }
}
