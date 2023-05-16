package prova.questao7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programacao {
    private LocalDate data;
    private ArrayList<Filme> filmes;


    public Programacao(LocalDate data, ArrayList<Filme> filmes) {
        this.data = data;
        this.filmes = filmes;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
}
