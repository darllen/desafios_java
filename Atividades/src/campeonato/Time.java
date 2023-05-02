package campeonato;

import java.util.ArrayList;


public class Time {
    private ArrayList<Integer> pontuacao;
    private String nome;
    private Estado estado;
    private String treinador;

    public Time(ArrayList<Integer> pontuacao, String nome, Estado estado, String treinador) {
        this.pontuacao = pontuacao;
        this.nome = nome;
        this.estado = estado;
        this.treinador = treinador;
    }

    public ArrayList<Integer> getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(ArrayList<Integer> pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    @Override
    public String toString() {
        return "\n[" + nome + ", " + estado + ", " + treinador + "]\n" +
                "Pontuação: " + pontuacao;
    }
}
