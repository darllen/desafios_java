package calculoFerias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sistema {
    public static void main(String args[]) throws ParseException {
        // Criação de um objeto de funcionário CLT
        FuncionarioCLTImpl funcionario = new FuncionarioCLTImpl();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // ITEM 2: Exibição das informações do funcionário
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Data de admissão: " + funcionario.getDataAdmissao());

            // ITEM 4 e 5: Verificação do direito a férias
            if (funcionario.temDireitoFerias() && funcionario.temSaldoFerias()) {
                Date periodoReferencia;

                try {
                    periodoReferencia = formato.parse("17/07/2023");
                } catch (ParseException e) {
                    System.out.println("Erro ao fazer o parse da data de referência: " + e.getMessage());
                    return;
                }

                int duracao = 30;

                // ITEM 6: Cálculo das datas de início e término das férias
                Date dataInicio = funcionario.calcularDataInicioFerias(periodoReferencia, duracao);
                Date dataTermino = funcionario.calcularDataTerminoFerias(dataInicio, duracao);

                // ITEM 7: Exibição das informações das férias calculadas
                System.out.println("Data de início das férias: " + dataInicio);
                System.out.println("Data de término das férias: " + dataTermino);
                System.out.println("Duração das férias: " + duracao + " dias");

                // ITEM 8: Registro das informações no banco de dados
                funcionario.save();
            } else {
                // Exibição da mensagem de não direito a férias
                System.out.println("O funcionário não possui direito a férias no momento, de acordo com as regras da CLT.");
            }

        } catch (NullPointerException e) {
            System.out.println("Ocorreu um NullPointerException. Verifique se o objeto funcionario foi corretamente inicializado.");
        }

    }

}
