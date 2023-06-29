package receita;

import java.util.ArrayList;
import java.util.Arrays;

public class Receita {
	private Integer id;
	private String titulo;
	private int tempoDePreparo;
	private int rendimento;
	private String[] ingredientes;
	private String [] modoDePreparo;
	private String usuario;


	public Receita(String titulo, int tempoDePreparo, int rendimento, String[] ingredientes, String[] modoDePreparo, String usuario) {
		this.titulo = titulo;
		this.tempoDePreparo = tempoDePreparo;
		this.rendimento = rendimento;
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoDePreparo;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String[] getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String[] modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Receita{" +
				"titulo='" + titulo + '\'' +
				", tempoDePreparo=" + tempoDePreparo +
				", rendimento=" + rendimento +
				", ingredientes=" + Arrays.toString(ingredientes) +
				", modoDePreparo=" + Arrays.toString(modoDePreparo) +
				'}';
	}
}
