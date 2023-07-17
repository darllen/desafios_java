package bingo;

import java.util.List;

public class Organizador extends Participante{

    public Organizador(String nome, int identificacao) {
        super(nome, identificacao); // <--
    }
    public void verificarJogadores(List<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador: " + jogador.getNome() + ", Cartela: " + jogador.getCartela());
        }
    }

    @Override
    public void marcarNumero(int numero) {
        if (numero < 75){
            System.out.println(numero + " - OK");
        } else {
            System.out.println("Será sorteado um novo número");
        }
    }

}
