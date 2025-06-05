package entities;

public class Circulo extends Forma {

	private Double raio;

	public Circulo() {
	}

	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
