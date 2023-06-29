package receita;

import receita.repository.ReceitaRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	private static ReceitaRepository repository = new ReceitaRepository();

	public static void main(String[] args) {
		String[] ingredientes = {"200 g de biscoito de maisena","150 g de margarina","1 lata de leite condensado (395 g)","1 caixa de creme de leite (200 g)","suco de 4 limões","raspas de 2 limões", "3 ou 4 claras de ovo", "3 colheres (sopa) de açúcar"};
		String[] modoDePreparo = {"Triture o biscoito de maisena em um liquidificador ou processador.","Junte a margarina e bata mais um pouco.","Despeje a massa em uma forma de fundo removível (27 cm de diâmetro).","Com as mãos, espalhe os biscoitos triturados no fundo e nas laterais da forma, cobrindo toda área de maneira uniforme.","Leve ao forno médio (180° C), preaquecido, por aproximadamente 10 minutos."};


		Receita a = new Receita("Torta de Limão", 80, 12, ingredientes, modoDePreparo, "Jamilly" );
		repository.create(a);
		System.out.println(repository.findByTitle("Torta de Limão"));
		repository.toPrint();

	}

	// ingredientes ["200 g de biscoito de maisena","150 g de margarina","1 lata de leite condensado (395 g)","1 caixa de creme de leite (200 g)","suco de 4 limões","raspas de 2 limões, "3 ou 4 claras de ovo", "3 colheres (sopa) de açúcar"]
	//
	//modoDePreparo: ["Triture o biscoito de maisena em um liquidificador ou processador.","Junte a margarina e bata mais um pouco.","Despeje a massa em uma forma de fundo removível (27 cm de diâmetro).","Com as mãos, espalhe os biscoitos triturados no fundo e nas laterais da forma, cobrindo toda área de maneira uniforme.","Leve ao forno médio (180° C), preaquecido, por aproximadamente 10 minutos."]
	//
	//String titulo, int tempoDePreparo, int rendimento, ArrayList<String> ingredientes,
	//			ArrayList<String> modoDePreparo, String usuario

}
