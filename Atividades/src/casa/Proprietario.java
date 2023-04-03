package casa;

public class Proprietario {
	public String nome;
	public String telefone;
	
	
	
	
	
	public boolean ehIgual(Proprietario donoA, Proprietario donoB){
		boolean retorno;
		
		if (donoA == donoB) {
			retorno = true;
		} else {
			retorno = false;
		}
		
		return retorno;
	}
	

}
