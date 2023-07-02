package receita;

import java.util.ArrayList;

public class Livro {

	private ArrayList<Receita> receitas = new ArrayList<>();

	public Livro(ArrayList<Receita> receitas) {
		this.receitas = receitas;
	}

	public ArrayList<Receita> getReceitas() {
		return receitas;
	}

	public void setReceitas(ArrayList<Receita> receitas) {
		this.receitas = receitas;
	}
}
