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

	public Casa(String cor, boolean temMuro) {
		this.cor = cor;
		this.temMuro = temMuro;
	}

	public double calcularIPTU(double area){
		double valorMetro;
		double imposto = 0;

		switch (endereco.bairro){
			case "Boa viagem":
				valorMetro = 1500;
				break;

			case "Boa Vista":
				valorMetro = 1500;
				break;

			case "Pina":
				valorMetro = 1500;
				break;

			default:
				valorMetro = 850;
		}

		double valorVenal = area * valorMetro;

		if (temMuro == false){
			imposto = (valorVenal * 0.02) + 0.1;
		} else {
			imposto = valorVenal * 0.02;
		}

		return imposto;

	}

}
