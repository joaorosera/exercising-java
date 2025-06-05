package entities;

public class Impressora {
	
	private String documento;
	
	public Impressora() {}

	public Impressora(String documento) {
		this.documento = documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public void imprimir() {
		System.out.println("Imprimindo documento genérico");
	}

}
