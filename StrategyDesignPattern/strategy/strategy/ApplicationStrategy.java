package strategy;

public class ApplicationStrategy {

	public static void main(String[] args) {
		Aluno pedro = new Aluno();
		pedro.setCurso(new CursoComum());
		pedro.fazerCurso();
		
		Aluno tiago = new Aluno();
		tiago.setCurso(new CursoEspecial());
		tiago.fazerCurso();
		
		pedro.setCurso(new CursoEspecial());
		pedro.fazerCurso();
		
		tiago.setCurso(new CursoComum());
		tiago.fazerCurso();
		
	}

}
