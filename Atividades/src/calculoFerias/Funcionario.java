package calculoFerias;


import java.util.Date;

public abstract class Funcionario {
    private String nome;
    private String cargo;
    private Date dataAdmissao;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

}
