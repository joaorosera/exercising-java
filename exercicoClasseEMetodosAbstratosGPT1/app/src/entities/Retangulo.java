package entities;

public class Retangulo extends Forma {

	private Double largura;
	private Double altura;
	
	public Retangulo() {}

	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	@Override 
	public double calcularArea() {
		return largura * altura;
	}
}
