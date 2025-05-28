package entities;

public class Circulo extends Figura {
	
	public double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
		this.area = Math.PI * raio * raio;
	}
	
	

}
