package entities;

public class Revista extends ItemBiblioteca {
	
	private String edicao;
	private String mesPublicacao;
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Edição: " + getEdicao());
		System.out.println("Mês de publicação: " + getMesPublicacao());
	}
	
	public Revista(String titulo, int anoPublicacao, String edicao, String mesPublicacao) {
		super(titulo, anoPublicacao);
		this.edicao = edicao;
		this.mesPublicacao = mesPublicacao;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getMesPublicacao() {
		return mesPublicacao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

}
