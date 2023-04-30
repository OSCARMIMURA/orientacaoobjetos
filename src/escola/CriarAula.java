package escola;

import escola.model.Aluno;
import escola.model.Curso;
import escola.model.Professor;
import escola.model.TipoAluno;
import escola.servicos.Aula;

public class CriarAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso1 = new Curso(1, "Java");
		
		Aula aula  = new Aula();
		
		
	
		Aluno aluno1 = new Aluno("11111111111", "Andre","andre@andre", 1, true, TipoAluno.BOLSAINTEGRAL);
		Aluno aluno2 = new Aluno("22222222222", "Bia","b@bia",2, true, TipoAluno.BOLSAPARCIAL);
		Aluno aluno3  = new Aluno("3333333333", "Carla","carla@carla",3, true, TipoAluno.SEMBOLSA);
		
		Professor p1 = new Professor("444444444", "Pardal","Pardal@Disney",  "Fisica", "Mestrado");		
		
		aula.definirCurso(curso1);
		
		aula.matricular(aluno1);
		aula.matricular(aluno2);
		aula.matricular(aluno3);
		
		aula.contratarProfessor(p1);
		
		System.out.println("Curso:");
		System.out.println(aula.getCurso().toString());
		
		System.out.println("\n Professor:");
		System.out.println(aula.getProfessor().toString());
		
		System.out.println("\n Alunos:");
		System.out.println(aula.getAlunos().toString());
		
		
		
		
		
}

}
