package bingo;

public class Participante {
    private String nome;
    private int identificacao;


    public void marcarNumero(int numero) {
        System.out.println(numero);
    }

    public Participante(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

}