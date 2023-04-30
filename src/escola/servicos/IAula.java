package escola.servicos;

import escola.model.Aluno;
import escola.model.Curso;
import escola.model.Professor;

public interface IAula {

	
	void matricular (Aluno aluno);
	
	void contratarProfessor (Professor professor);
	
	void definirCurso(Curso curso);
	
	
	
}
