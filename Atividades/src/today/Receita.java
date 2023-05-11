package today;

import java.util.ArrayList;

public class Receita {
	private int id;
	private String titulo;
	private int tempoDePreparo;
	private int rendimento;
	private ArrayList<String> ingredientes = new ArrayList<>();
	private ArrayList<String> modoDePreparo = new ArrayList<>();
	private String usuario;
	
	
	public Receita(String titulo, int tempoDePreparo, int rendimento, ArrayList<String> ingredientes,
			ArrayList<String> modoDePreparo, String usuario) {
		super();
		this.titulo = titulo;
		this.tempoDePreparo = tempoDePreparo;
		this.rendimento = rendimento;
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoDePreparo;
		this.usuario = usuario;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getTempoDePreparo() {
		return tempoDePreparo;
	}


	public void setTempoDePreparo(int tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}


	public int getRendimento() {
		return rendimento;
	}


	public void setRendimento(int rendimento) {
		this.rendimento = rendimento;
	}


	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}


	public ArrayList<String> getModoDePreparo() {
		return modoDePreparo;
	}


	public void setModoDePreparo(ArrayList<String> modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

	
	
	
	
	

}
