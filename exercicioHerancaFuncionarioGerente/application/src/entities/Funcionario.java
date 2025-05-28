package entities;

public class Funcionario {
	
	String nome;
	double salario;
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
	}

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
}
