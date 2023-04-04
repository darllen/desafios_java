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

}
