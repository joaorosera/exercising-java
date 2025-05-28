package application;

import entities.Circulo;
import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
	Retangulo retangulo = new Retangulo(20.0, 10.0);
	Circulo circulo = new Circulo(5);
	
	retangulo.exibirArea();
	circulo.exibirArea();
	
	}

}
