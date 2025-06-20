package entities;

public class Produto {
	
	private String name;
	private double preco;
	
	public Produto() {
		
	}
	
	public void exibirInfo() {
		System.out.println("Nome do produto: " + name);
		System.out.println("Preço do produto: " + preco);
	}

	public Produto(String name, double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
