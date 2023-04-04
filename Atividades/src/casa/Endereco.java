package casa;

public class Endereco {
	public String rua;
	public String numero;
	public String bairro;
	public String cidade;





	public Endereco() {
	}

	public Endereco(String rua) {
		this.rua = rua;
	}

	public Endereco(String rua, String numero, String bairro, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco(String numero, String bairro, String cidade) {
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco(String bairro, String cidade) {
		this.bairro = bairro;
		this.cidade = cidade;
	}



}
