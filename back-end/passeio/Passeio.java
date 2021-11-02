package exercicio;

public class Passeio {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Franjinha";
		
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nomeCachorro = "Bidu";
		p1.cachorro.idade = 3;
		p1.cachorro.cor = "Azul";
		
		Caminhada c = new Caminhada();
		c.andar(p1);
	
	}
	
	
}
