package polimorfismo.atividade;

public class Funcionario {
    protected String cpf;
    protected String nome;
    protected byte idade;
    protected double salario;


    public double obterSalario(){
        return this.salario;
    }

    public Funcionario(String cpf, String nome, byte idade, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
