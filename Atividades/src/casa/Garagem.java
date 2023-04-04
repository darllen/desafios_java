package casa;

public class Garagem {
	public int numCarros;
	public boolean ehCoberta;
	public Porta porta = new Porta();





	public Garagem() {
	}

	public Garagem(int numCarros, boolean ehCoberta, Porta porta) {
		this.numCarros = numCarros;
		this.ehCoberta = ehCoberta;
		this.porta = porta;
	}

	public Garagem(int numCarros, boolean ehCoberta) {
		this.numCarros = numCarros;
		this.ehCoberta = ehCoberta;
	}

	public Garagem(int numCarros, Porta porta) {
		this.numCarros = numCarros;
		this.porta = porta;
	}

	public Garagem(boolean ehCoberta, Porta porta) {
		this.ehCoberta = ehCoberta;
		this.porta = porta;
	}

	public Garagem(Porta porta) {
		this.porta = porta;
	}

	public Garagem(int numCarros) {
		this.numCarros = numCarros;
	}

	public Garagem(boolean ehCoberta) {
		this.ehCoberta = ehCoberta;
	}
}
