package escola.servicos;

import java.util.ArrayList;
import java.util.List;

import escola.model.Aluno;
import escola.model.Curso;
import escola.model.Professor;

public class Aula implements IAula {

	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	private List<Aluno> alunos = new ArrayList<>();; 
	
	private Professor professor;
	
	private Curso curso;
	
	@Override
	public void matricular(Aluno aluno) {
		// TODO Auto-generated method stub
		
		alunos.add(aluno);
		
	}

	@Override
	public void contratarProfessor(Professor professor) {
		// TODO Auto-generated method stub
		this.professor = professor;
		
	}

	@Override
	public void definirCurso(Curso curso) {
		// TODO Auto-generated method stub
		
		this.curso = curso;
		
	}

	@Override
	public String toString() {
		return "Aula [alunos=" + alunos + ", professor=" + professor + ", curso=" + curso + "]";
	}
	
	

}
