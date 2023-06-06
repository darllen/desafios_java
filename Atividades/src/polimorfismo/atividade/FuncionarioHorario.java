package polimorfismo.atividade;

public class FuncionarioHorario extends Funcionario{
    private double valorHora;
    private Integer qtdHoras;

    public FuncionarioHorario(String cpf, String nome, byte idade, double valorHora, Integer qtdHoras) {
        super(cpf, nome, idade, valorHora * qtdHoras);
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double obterSalario(){;
        return this.valorHora * this.qtdHoras;
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(this.obterSalario());
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
}
