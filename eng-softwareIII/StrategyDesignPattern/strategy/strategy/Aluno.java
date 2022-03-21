package strategy;

public class Aluno {
	private Curso curso;
	
	public void setCurso (Curso curso) {
		this.curso = curso;
	}
	
	public void fazerCurso() {
		this.curso.cursar();
	}
}
