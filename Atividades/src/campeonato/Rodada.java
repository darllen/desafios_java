package campeonato;


import java.util.ArrayList;

public class Rodada {
    private int numeroRodada;
    private ArrayList<Jogo> jogos;


    public Rodada(int numeroRodada, ArrayList<Jogo> jogos) {
        this.numeroRodada = numeroRodada;
        this.jogos = jogos;
    }

    public int getNumeroRodada() {
        return numeroRodada;
    }

    public void setNumeroRodada(int numeroRodada) {
        this.numeroRodada = numeroRodada;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }
}
