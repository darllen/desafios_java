package aluno;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno {
	private Integer codigo;
	private String email;
	private String nome;
	private LocalDate dataNascimento;
	private String cidade;


	public Aluno(String nome, String cidade, String email) {
		this.email = email;
		this.nome = nome;
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Aluno " + codigo + "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nE-mail: " + email + "\nCidade: " + cidade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
}
