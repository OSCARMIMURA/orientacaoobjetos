package escola.model;

public class Curso {


	private int id;
	
	private String Curso;
	
	
	public Curso(int id, String curso) {
		
		this.id = id;
		Curso = curso;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", Curso=" + Curso + "]";
	}


	
	
}
