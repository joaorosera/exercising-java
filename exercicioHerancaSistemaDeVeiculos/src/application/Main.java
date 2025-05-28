package application;

import entities.Carro;
import entities.Moto;

public class Main {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setMarca("Toyota");
		carro.setModelo("Corolla");
		carro.setAno(2025);
		carro.setQuantidadePortas(4);
		
		System.out.println();
		System.out.println();
		
		Moto moto = new Moto();
		moto.setMarca("Suzuki");
		moto.setModelo("Hayabusa");
		moto.setAno(2025);
		moto.setCilindradas(1300);
		
		
		System.out.println("Informações do carro:");
		carro.exibirInformacoes();;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Informações da moto:");
		moto.exibirInformacoes();
	}

}
