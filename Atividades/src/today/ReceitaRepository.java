package today;

import java.util.ArrayList;

public class ReceitaRepository {
	
	private ArrayList<Receita> receitas = new ArrayList<>();
	
	
	// alterar, cadastrar, excluir, ler receita
	
	public void addReceita(String titulo, int tempoDePreparo, int rendimento, ArrayList<String> ingredientes,
			ArrayList<String> modoDePreparo, String usuario){
			
        if(findByTitle(titulo) == null) {
            Receita novaReceita = new Receita(titulo, tempoDePreparo, rendimento, ingredientes, modoDePreparo, usuario);
            receitas.add(novaReceita);
        } else {
            System.out.println("Receita já existe!");
        }
    }

    public void printTimes() {
        for (Receita r : receitas) {
            System.out.println(r);

        }
    }
    
    public Receita findByTitle(String nome) {
        for (Receita receita : receitas) {
            if(receita.getTitulo().equalsIgnoreCase(nome)) {
                return receita;
            }
        }
        return null;
    }

}
