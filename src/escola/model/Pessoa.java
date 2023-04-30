package escola.model;

import java.time.LocalDate;

public class Pessoa {


	private String cpf;
	
	private String nome; 

	private String email;
	
	private LocalDate dataCadastro;
	
	
	public Pessoa(String cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dataCadastro = LocalDate.now();
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}


	
	

	

}
