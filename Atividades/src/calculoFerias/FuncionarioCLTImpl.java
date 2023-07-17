package calculoFerias;

import java.util.Date;

public class FuncionarioCLTImpl extends Funcionario implements Calculo{
    @Override
    public boolean temDireitoFerias() {
        return false;
    }

    @Override
    public boolean temSaldoFerias() {
        return false;
    }

    @Override
    public Date calcularDataInicioFerias(Date periodoReferencia, int duracao) {
        return null;
    }

    @Override
    public Date calcularDataTerminoFerias(Date dataInicio, int duracao) {
        return null;
    }

    public void save(){
        System.out.println("Salvo no banco!");
    }


}
