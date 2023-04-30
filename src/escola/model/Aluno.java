package escola.model;

import java.time.LocalDate;

public class Aluno extends Pessoa {

	private int id;
	
	private boolean ehAluno;
	
	private TipoAluno tipoAluno;
	
	public Aluno(String cpf, String nome, String email, int id, boolean ehAluno, TipoAluno tipoAluno) {
		super(cpf, nome, email);	
		this.id = id;
		this.ehAluno = ehAluno;
		this.tipoAluno = tipoAluno;
	}


	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}

	public boolean isEhAluno() {
		return ehAluno;
	}

	public void setEhAluno(boolean ehAluno) {
		this.ehAluno = ehAluno;
	}

	public TipoAluno getTipoAluno() {
		return tipoAluno;
	}

	public void setTipoAluno(TipoAluno tipoAluno) {
		this.tipoAluno = tipoAluno;
	}


	@Override
	public String toString() {
		return "Aluno "
				+ "[id=" + id + ", "
				+ " getCpf()=" + getCpf()
				+ ", getNome()=" + getNome() 
				+ ", getEmail()=" + getEmail() 
				+ ", getDataCadastro()=" + getDataCadastro()			
				+ "ehAluno=" + ehAluno 
				+ ", tipoAluno=" + tipoAluno + ","
				+ "] \n";
	}
	
}

