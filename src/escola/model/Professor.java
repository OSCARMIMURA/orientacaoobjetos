package escola.model;

public class Professor extends Pessoa{

	private String especialidade;
	

	private String formacao;
	

	public Professor(String cpf, String nome, String email, String especialidade, String formacao) {
		super(cpf, nome, email);
		this.especialidade = especialidade;
		this.formacao = formacao;
	}

	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getFormacao() {
		return formacao;
	}



	public void setFormacao(String formacao) {
		formacao = formacao;
	}

	
	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", formacao=" + formacao + ", getCpf()=" + getCpf()
				+ ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getDataCadastro()=" + getDataCadastro()
				+ "]";
	}

	
	
	
}
