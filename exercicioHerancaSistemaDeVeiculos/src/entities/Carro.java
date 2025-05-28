package entities;

public class Carro extends Veiculo {
	private Integer quantidadePortas;

	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Quantidade de portas: " + getQuantidadePortas());
	}
 }
