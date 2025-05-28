package entities;

public class Leao extends Animal {
	
	@Override
	public void fazerSom() {
		System.out.println("Leão rugindo");
	}

	public Leao(String nome, int idade) {
		super(nome, idade);
	}
	
}
