package entities;

public class Vendedor extends Funcionario {

	private Double comissao;
	
	public Vendedor() {}

	public Vendedor(String nome, Double salario, Double comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalarioTotal() {
		return super.calcularSalarioTotal() + getComissao();
	}
	
}
