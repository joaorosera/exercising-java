package entities;

public class Pessoa {
	
	public String nome;
	public int idade;
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
