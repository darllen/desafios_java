package prova.questao7;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Sessao> sessoes;

    public Filme(String titulo, ArrayList<Sessao> sessoes) {
        this.titulo = titulo;
        this.sessoes = sessoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(ArrayList<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}
