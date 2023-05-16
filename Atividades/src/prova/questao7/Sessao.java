package prova.questao7;

import java.util.ArrayList;

public class Sessao {
    private String formato;
    private ArrayList<String> horarios;
    private String dublagem;


    public Sessao(String formato, ArrayList<String> horarios, String dublagem) {
        this.formato = formato;
        this.horarios = horarios;
        this.dublagem = dublagem;
    }

    public Sessao(String formato, ArrayList<String> horarios) {
        this.formato = formato;
        this.horarios = horarios;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public ArrayList<String> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<String> horarios) {
        this.horarios = horarios;
    }

    public String getDublagem() {
        return dublagem;
    }

    public void setDublagem(String dublagem) {
        this.dublagem = dublagem;
    }
}
