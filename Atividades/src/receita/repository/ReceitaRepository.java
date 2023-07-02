package receita.repository;

import receita.Receita;

import java.util.ArrayList;

public class ReceitaRepository {
	private ArrayList<Receita> receitas = new ArrayList<>();
    private static int ID = 1;

	
	public void create(Receita receita){
        if(findByTitle(receita.getTitulo()) == null) {
            receita.setId(ID++);
            receitas.add(receita);
            System.out.println("Receita adicionada!");
        } else {
            System.out.println("Receita já existe!");
        }
    }

    public void toPrint() {
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

    //
    // UPDATE
    //

    public void deleteByTitle(String nome) {
        nome = nome.toLowerCase();
        Receita receita = findByTitle(nome);
        if(receita != null){
            receitas.remove(receita);
            System.out.println("deleted!");
        } else {
            System.out.println("Receita não existe!");
        }
    }

}
