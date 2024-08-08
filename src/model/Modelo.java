package model;

public class Modelo {

	private String nome;
	private String dataNascimento;
	private String email;
	private String cpf;
	
	public Modelo(String nome, String dataNascimento, String email, String cpf) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() { 
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getDataNascimento() {
		
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	public String getCpf() {
		
		return cpf;
	}

	public void setCpf(String cpf) {
		
		this.cpf = cpf;
	}
}
