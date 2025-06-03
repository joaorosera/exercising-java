package entities;

public class Camisa extends Produto {

    private String corDaCamisa;
    private int tamanhoDaCamisa;
    private String materialDaCamisa;

    public Camisa() {
        super();
    }

    public Camisa(String nome, double preco, String corDaCamisa, int tamanhoDaCamisa, String materialDaCamisa) {
        super(nome, preco);
        this.corDaCamisa = corDaCamisa;
        this.tamanhoDaCamisa = tamanhoDaCamisa;
        this.materialDaCamisa = materialDaCamisa;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor da camisa: " + corDaCamisa);
        System.out.println("Tamanho da camisa: " + tamanhoDaCamisa);
        System.out.println("Material da camisa: " + materialDaCamisa);
    }

    public String getCorDaCamisa() {
        return corDaCamisa;
    }

    public void setCorDaCamisa(String corDaCamisa) {
        this.corDaCamisa = corDaCamisa;
    }

    public int getTamanhoDaCamisa() {
        return tamanhoDaCamisa;
    }

    public void setTamanhoDaCamisa(int tamanhoDaCamisa) {
        this.tamanhoDaCamisa = tamanhoDaCamisa;
    }

    public String getMaterialDaCamisa() {
        return materialDaCamisa;
    }

    public void setMaterialDaCamisa(String materialDaCamisa) {
        this.materialDaCamisa = materialDaCamisa;
    }
}
