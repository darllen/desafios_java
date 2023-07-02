package aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class EntradaCadastro {

	private static RepositorioAlunos repositorio = new RepositorioAlunos();

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
			exibirMenu();
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				exibirCadastro();
				break;
			case 2:
				exibirListar();
				break;
			case 3:
				exibirPesquisar();
				break;
			case 4:
				exibirExcluir();
				break;
			case 5:
				exibirAlterar();
				break;
			case 6:
				break;
			default:
				System.out.println("Opção inválida .. escolha outra!");
				break;
			}
		} while(opcao != 6);
		teclado.close();

		System.out.println("Até a próxima!!");
	}

	private static void exibirMenu() {
		System.out.println("%%%%%%%%%%% MENU %%%%%%%%%");
		System.out.println(" (1) Cadastrar ");
		System.out.println(" (2) Listar todos ");
		System.out.println(" (3) Pesquisar ");
		System.out.println(" (4) Excluir ");
		System.out.println(" (5) Alterar ");
		System.out.println(" (6) Sair ");
		
		System.out.print("Digite a opção: ");
	}

	private static void exibirCadastro() {
		
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" ... Cadastrar Aluno ... ");

		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Cidade: ");
		String cidade = teclado.nextLine();
		System.out.print("E-mail: ");
		String email = teclado.nextLine();
		System.out.print("Data de nascimento[dd/mm/aaaa]: ");
		String dataRecebida = teclado.nextLine();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada = LocalDate.parse(dataRecebida, formato);

		Aluno a = new Aluno(nome, cidade, email);

		try {
			a.setDataNascimento(dataFormatada);
			repositorio.inserirAluno(a);
			System.out.println("Aluno inserido com sucesso!\n");
		} catch (Exception e) {
			System.out.println("Formato inválido\n");
		}

	}

	private static void exibirAlterar() {
		System.out.println("%%%%%%%  ALTERAR ALUNO %%%%%%%%");
		System.out.println("... Alterar aluno ... ");

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o código do aluno: ");
		int codigo = Integer.parseInt(teclado.nextLine());
		
		Aluno aluno = repositorio.obterAluno(codigo);
		System.out.println("Altere os dados do estudante:  " + aluno.getNome());
		
		System.out.println("Nome [" + aluno.getNome() +"]: ");
		String nome = teclado.nextLine();
		System.out.println("Cidade [" + aluno.getCidade() + "]: ");
		String cidade = teclado.nextLine();
		System.out.println("E-mail [" + aluno.getEmail() + "]: ");
		String email = teclado.nextLine();
		System.out.println("Data de nascimento [" + aluno.getDataNascimento() + "]: ");
		String data = teclado.nextLine();

		if (nome != null && !nome.equals("")) {
			aluno.setNome(nome);	
		}
		if (cidade != null && !cidade.equals("")) {
			aluno.setCidade(cidade);	
		}
		if (email != null && !email.equals("")) {
			aluno.setEmail(email);	
		}
		if (data != null && !data.equals("")) {
			try {
				aluno.setDataNascimento(LocalDate.parse(data));
			} catch (Exception e) {
				System.out.println("Formato inválido");
			}
		}
		
		repositorio.alterarAluno(codigo, aluno);
		System.out.println("### Alterado com sucesso! ###");
		System.out.println();
	}

	private static void exibirExcluir() {
		System.out.println("%%%%%%%  EXCLUIR ALUNO %%%%%%%%");
		System.out.println("... Excluir Aluno ... ");

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o código do aluno: ");
		int codigo = teclado.nextInt();
		
		repositorio.removerAluno(codigo);
		
		System.out.println("### Removido com sucesso! ###");
		System.out.println();
	}

	private static void exibirPesquisar() {
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" ... Pesquisar aluno ... ");
		Scanner teclado = new Scanner(System.in);
		int op;

		System.out.println("Pesquisar por: ");
		System.out.println(" (1) Código ");
		System.out.println(" (2) Nome ");
		System.out.println(" (3) E-mail ");
		System.out.println(" (4) Cidade ");

		System.out.print("\nDigite a opção: ");
		op = teclado.nextInt();

		if (op == 1){
			ArrayList<Aluno> alunoPorCodigo = repositorio.pesquisarAlunoPorCodigo(teclado.nextInt());
			System.out.println("Alunos encontrados: ");
			for (Aluno a : alunoPorCodigo) {
				System.out.println(a);
			}
		}
		if (op == 2){
			ArrayList<Aluno> alunoPorNome = repositorio.pesquisarAlunoPorNome(teclado.nextLine());
			System.out.println("Alunos encontrados: ");
			for (Aluno a : alunoPorNome) {
				System.out.println(a);
			}
		}
		if (op == 3){
			ArrayList<Aluno> alunoPorEmail = repositorio.pesquisarAlunoPorEmail(teclado.nextLine());
			System.out.println("Alunos encontrados: ");
			for (Aluno a : alunoPorEmail) {
				System.out.println(a);
			}
		}
		if (op == 4){
			ArrayList<Aluno> alunoPorCidade = repositorio.pesquisarAlunoPorCidade(teclado.nextLine());
			System.out.println("Alunos encontrados: ");
			for (Aluno a : alunoPorCidade) {
				System.out.println(a);
			}
		}


		teclado.close();
		System.out.println();

	}

	private static void exibirListar() {
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" ... Listar todos os alunos ... ");
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%% ");

		repositorio.imprimirAlunos();
		System.out.println();
	}

}
