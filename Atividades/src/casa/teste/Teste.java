package casa.teste;

import casa.*;

public class Teste {
	public static void main(String[] args) {
		Porta porta = new Porta();
		Garagem garagem = new Garagem();
		Casa casaA = new Casa();
		Casa casaB = new Casa();

		porta.cor = "azul";
		porta.altura = 1.80;

		garagem.numCarros = 2;
		garagem.ehCoberta = true;
		garagem.porta = null;
		//----------------------------
		casaA.temMuro = true;
		casaA.endereco.rua = "Caramuru";
		casaA.endereco.numero = "32";
		casaA.endereco.bairro = "Ouro Preto";
		casaA.endereco.cidade = "Paulista";
		casaA.cor = "branco gelo";
		casaA.porta.cor = "azul";
		casaA.porta.altura = 1.80;
		casaA.garagem.numCarros = 2;
		casaA.garagem.ehCoberta = true;
		casaA.garagem.porta = null;
		casaA.dono.nome = "Carlos Alberto";
		casaA.dono.telefone = "3445-3040";
		//----------------------------
		casaB.temMuro = false;
		casaB.endereco.rua = "Caramuru";
		casaB.endereco.numero = "49";
		casaB.endereco.bairro = "Ouro Preto";
		casaB.endereco.cidade = "Paulista";
		casaB.cor = "azul piscina";
		casaB.porta = null;
		casaB.garagem.numCarros = 2;
		casaB.garagem.ehCoberta = true;
		casaB.garagem.porta = null;
		casaB.dono.nome = "Joaquim Rivieira";
		casaB.dono.telefone = "";
		//----------------------------
		
		casaA.cor = "verde";
		//casaB.temMuro = true;
		casaB.dono.nome = "Ana Raquel";
		casaB.dono.telefone = "3543-3434";
		
		
		System.out.println(casaA.dono.ehIgual(casaA.dono.nome, casaB.dono.nome));
		System.out.println(casaA.calcularIPTU(40)); // tem muro
		System.out.println(casaB.calcularIPTU(40)); // não tem muro
		
		
	
	}
}
