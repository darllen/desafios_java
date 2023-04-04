package casa;

public class Proprietario {
	public String nome;
	public String telefone;






	public Proprietario() {
	}

	public Proprietario(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public Proprietario(String nome) {
		this.nome = nome;
	}

	public boolean ehIgual(String nomeDonoA, String nomeDonoB){
		boolean retorno;

		if (nomeDonoA == nomeDonoB) {
			retorno = true;
		} else {
			retorno = false;
		}

		return retorno;
	}
}
