package form;

import java.time.LocalDate;

public class Inscricao {
    private Musica musica1;
    private Musica musica2;
    private String biografiaArtistica;
    private Pessoa responsavel;
    private boolean comBanda;
    private String partitura;
    private String local;
    private LocalDate agora = LocalDate.now();


    public Inscricao(Musica musica1, Musica musica2, String biografiaArtistica, Pessoa responsavel, boolean comBanda, String partitura, String local) {
        this.musica1 = musica1;
        this.musica2 = musica2;
        this.biografiaArtistica = biografiaArtistica;
        this.responsavel = responsavel;
        this.comBanda = comBanda;
        this.partitura = partitura;
        this.local = local;
    }

    public Musica getMusica1() {
        return musica1;
    }

    public void setMusica1(Musica musica1) {
        this.musica1 = musica1;
    }

    public Musica getMusica2() {
        return musica2;
    }

    public void setMusica2(Musica musica2) {
        this.musica2 = musica2;
    }

    public String getBiografiaArtistica() {
        return biografiaArtistica;
    }

    public void setBiografiaArtistica(String biografiaArtistica) {
        this.biografiaArtistica = biografiaArtistica;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isComBanda() {
        return comBanda;
    }

    public void setComBanda(boolean comBanda) {
        this.comBanda = comBanda;
    }

    public String getPartitura() {
        return partitura;
    }

    public void setPartitura(String partitura) {
        this.partitura = partitura;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getAgora() {
        return agora;
    }

    public void setAgora(LocalDate agora) {
        this.agora = agora;
    }

}
