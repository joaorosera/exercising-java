package entities;

public class Retangulo extends Figura {
	
	public Double base;
	public Double altura;
	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
		this.area = base * altura;
	}

	
}
