package entities;

public class AlunoGraduacao extends Aluno{

	public String curso;
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Curso: " + curso);
	}

	public AlunoGraduacao(String nome, int idade, int matricula, String curso) {
		super(nome, idade, matricula);
		this.curso = curso;
	}
}
