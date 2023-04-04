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
