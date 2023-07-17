package calculoFerias;

import java.util.Date;

public interface Calculo {

    boolean temDireitoFerias();
    boolean temSaldoFerias();
    Date calcularDataInicioFerias(Date periodoReferencia, int duracao);
    Date calcularDataTerminoFerias(Date dataInicio, int duracao);
    void save();
}
