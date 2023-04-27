package aluno;

import java.util.ArrayList;

public class RepositorioAlunos {

	private ArrayList<Aluno> colecao = new ArrayList<>();
	private static int CODIGO = 100;
	
	// Inserir Aluno
	public void inserirAluno(Aluno aluno) {
		aluno.setCodigo(CODIGO++);
		this.colecao.add(aluno);
	}

	// Pesquisar aluno pelo código
	public ArrayList<Aluno> pesquisarAlunoPorCodigo(Integer codigo) {
		ArrayList<Aluno> retorno = new ArrayList<>();
		for(Aluno a : this.colecao) {
			if (a.getCodigo() == codigo) {
				retorno.add(a);
			}
		}
		return retorno;
	}

	// Pesquisar aluno pelo nome
	public ArrayList<Aluno> pesquisarAlunoPorNome(String nome) {
		ArrayList<Aluno> retorno = new ArrayList<>();
		for(Aluno a : this.colecao) {
			if (a.getNome().contains(nome)) {
				retorno.add(a);
			}
		}
		return retorno;
	}

	// Pesquisar aluno pelo cidade
	public ArrayList<Aluno> pesquisarAlunoPorCidade(String cidade) {
		ArrayList<Aluno> retorno = new ArrayList<>();
		for(Aluno a : this.colecao) {
			if (a.getCidade().contains(cidade)) {
				retorno.add(a);
			}
		}
		return retorno;
	}

	// Pesquisar aluno pelo email
	public ArrayList<Aluno> pesquisarAlunoPorEmail(String email) {
		ArrayList<Aluno> retorno = new ArrayList<>();
		for(Aluno a : this.colecao) {
			if (a.getEmail().contains(email)) {
				retorno.add(a);
			}
		}
		return retorno;
	}



	// Remover aluno
	public void removerAluno(int codigo) {
		Aluno aluno = this.obterAluno(codigo);
		this.colecao.remove(aluno);
	}

	// Alterar aluno
	public void alterarAluno(int codigo, Aluno novo) {
		Aluno atual = this.obterAluno(codigo);
		int index = this.colecao.indexOf(atual);
		this.colecao.set(index, novo);
	}

	// Imprimir todos os alunos
	public void imprimirAlunos() {
		for (Aluno a : this.colecao) {
			System.out.println(a);
			System.out.println("------------------------");
		}
	}

	public Aluno obterAluno(int codigo) {
		for (Aluno a : this.colecao) {
			if (a.getCodigo() == codigo) {
				return a;
			}
		}
		return null;
	}
	
	
	
	
	
}
