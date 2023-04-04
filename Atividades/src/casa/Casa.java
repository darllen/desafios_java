package casa;

public class Casa {
	public Endereco endereco = new Endereco();
	public String cor;
	public Porta porta = new Porta();
	public Garagem garagem = new Garagem();
	public boolean temMuro;
	public Proprietario dono = new Proprietario();





	public Casa() {
	}

	public Casa(Endereco endereco, String cor, Porta porta, Garagem garagem, boolean temMuro, Proprietario dono) {
		this.endereco = endereco;
		this.cor = cor;
		this.porta = porta;
		this.garagem = garagem;
		this.temMuro = temMuro;
		this.dono = dono;
	}

	public Casa(String cor, Porta porta, Garagem garagem, boolean temMuro, Proprietario dono) {
		this.cor = cor;
		this.porta = porta;
		this.garagem = garagem;
		this.temMuro = temMuro;
		this.dono = dono;
	}

	public Casa(Porta porta, Garagem garagem, boolean temMuro, Proprietario dono) {
		this.porta = porta;
		this.garagem = garagem;
		this.temMuro = temMuro;
		this.dono = dono;
	}

	public Casa(Garagem garagem, boolean temMuro, Proprietario dono) {
		this.garagem = garagem;
		this.temMuro = temMuro;
		this.dono = dono;
	}

	public Casa(boolean temMuro, Proprietario dono) {
		this.temMuro = temMuro;
		this.dono = dono;
	}

	public Casa(Proprietario dono) {
		this.dono = dono;
	}
}
