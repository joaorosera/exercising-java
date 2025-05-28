package entities;

public class Aluno extends Pessoa {
	
	public int matricula;
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matrícula: " + matricula);
	}

	public Aluno(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
	

}
