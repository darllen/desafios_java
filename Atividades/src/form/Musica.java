package form;

public class Musica {
    private String titulo;
    private String autorLetra;
    private String autorMusica;
    private String interprete;
    private int q_musicosAcompanhantes;


    public Musica(String titulo, String autorLetra, String autorMusica, String interprete, int q_musicosAcompanhantes) {
        this.titulo = titulo;
        this.autorLetra = autorLetra;
        this.autorMusica = autorMusica;
        this.interprete = interprete;
        this.q_musicosAcompanhantes = q_musicosAcompanhantes;
    }

    public Musica(String titulo, String autorLetra, String autorMusica, String interprete) {
        this.titulo = titulo;
        this.autorLetra = autorLetra;
        this.autorMusica = autorMusica;
        this.interprete = interprete;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorLetra() {
        return autorLetra;
    }

    public void setAutorLetra(String autorLetra) {
        this.autorLetra = autorLetra;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getQ_musicosAcompanhantes() {
        return q_musicosAcompanhantes;
    }

    public void setQ_musicosAcompanhantes(int q_musicosAcompanhantes) {
        this.q_musicosAcompanhantes = q_musicosAcompanhantes;
    }
}
