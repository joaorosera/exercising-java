package entities;

public class Elefante extends Animal {
	
	@Override
	public void fazerSom() {
		System.out.println("Elefante trombetando");
	}

	public Elefante(String nome, int idade) {
		super(nome, idade);
	}
}
