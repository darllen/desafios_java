package polimorfismo.atividade;

public class FuncionarioChefe extends Funcionario{
    private double valorInicial;
    private double gratificacao;
    private Funcionario funcionarioAcessor;


    public FuncionarioChefe(String cpf, String nome, byte idade, double valorInicial, double gratificacao, Funcionario funcionarioAcessor) {
        super(cpf, nome, idade, valorInicial + gratificacao);
        this.valorInicial = valorInicial;
        this.gratificacao = gratificacao;
        this.setFuncionarioAcessor(funcionarioAcessor);

    }

    @Override
    public double obterSalario() {
        return this.valorInicial + this.gratificacao;
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(this.obterSalario());
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Funcionario getFuncionarioAcessor() {
        return funcionarioAcessor;
    }

    public void setFuncionarioAcessor(Funcionario funcionarioAcessor) {
        if (funcionarioAcessor instanceof FuncionarioChefe || funcionarioAcessor instanceof FuncionarioHorario){
            this.funcionarioAcessor = null;
        } else {
            this.funcionarioAcessor = funcionarioAcessor;
        }
    }
}


