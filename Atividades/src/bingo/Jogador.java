package bingo;

public class Jogador extends Participante{
    private Cartela cartela;

    @Override
    public void marcarNumero(int numero) {
        System.out.println(numero + " - OK");
    }

    public Jogador(String nome, int identificacao, Cartela cartela) {
        super(nome, identificacao); // <--
        this.cartela = cartela;
    }

    public Cartela getCartela() {
        return cartela;
    }

}
