package entities;

public class Livro extends Produto {
	
	private String nomeDoAutor;
	private int numeroDePaginas;
	private boolean capaDura;
	
	public Livro() {
		
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Nome do autor do livro: " + nomeDoAutor);
		System.out.println("Número de páginas do livro: " + numeroDePaginas);
		System.out.println("O livro tem capa dura? " + capaDura);

	}

	public Livro(String name, double preco, String nomeDoAutor, int numeroDePaginas, boolean capaDura) {
		super(name, preco);
		this.nomeDoAutor = nomeDoAutor;
		this.numeroDePaginas = numeroDePaginas;
		this.capaDura = capaDura;
	}

	public String getNomeDoAutor() {
		return nomeDoAutor;
	}

	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public boolean isCapaDura() {
		return capaDura;
	}

	public void setCapaDura(boolean capaDura) {
		this.capaDura = capaDura;
	}

}
