package lojinha;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionario {
    public static void main(String args[]) {
        Funcionario fc1 = new Funcionario("43500344322", "Júlio dos Santos", 3450);
        Funcionario fc2 = new Funcionario("304.304.223-33", "Adriana Milena da Paz e Souza", 8550.40);

        List funcionarios = new ArrayList();

        funcionarios.add(fc1);
        funcionarios.add(fc2);

        for (Object fc : funcionarios) {
            if (((Funcionario) fc).getNome().length() > 20) {
                System.out.println("Nome: " + ((Funcionario) fc).obterNomeAbreviado(((Funcionario) fc).getNome()));
            } else {
                System.out.println("Nome: " + ((Funcionario) fc).getNome());
            }
            System.out.println("CPF: " + ((Funcionario) fc).formatarCPF(((Funcionario) fc).getCpf()));
            ((Funcionario) fc).adicionarAumentoSalario(10);
            System.out.println("Nº de salários: " + ((Funcionario) fc).obterNumeroSalariosMinimos(((Funcionario) fc).getSalario()));

            System.out.println("-------------------------");
        }
    }
}
