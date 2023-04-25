package campeonato;

import java.time.LocalDateTime;

public class Jogo {
    private LocalDateTime dataHora;
    private Time visitante;
    private Time mandante;
    private int golsVisitante;
    private int golsMandante;
    private String estado;


    public Jogo(LocalDateTime dataHora, Time visitante, Time mandante, int golsVisitante, int golsMandante, String estado) {
        this.dataHora = dataHora;
        this.visitante = visitante;
        this.mandante = mandante;
        this.golsVisitante = golsVisitante;
        this.golsMandante = golsMandante;
        this.estado = estado;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
