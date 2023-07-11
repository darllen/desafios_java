package bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo extends Sorteador{
    private List<Cartela> cartelas;
    private List<Integer> numerosSorteados;

    public Bingo() {
        cartelas = new ArrayList<>();
    }

    public void gerarCartelas(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            Cartela cartela = new Cartela();
            cartela.gerarCartela();
            cartelas.add(cartela);
        }
    }


    public int sortearNumero() {
         return super.sortearNumero(numerosSorteados);
    }

    public void verificarCartelasPremiadas() {
        // Lógica para verificar se alguma cartela é premiada
        // Pode ser implementada de acordo com as regras do jogo de bingo
    }


    // Outros métodos necessários para interação com o jogo
}

