package entities;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Cilindradas: " + getCilindradas());
	}
}
