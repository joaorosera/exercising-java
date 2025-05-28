package application;

import entities.Gerente;

public class Main {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Carla", 8500.0, "RH");
		g1.exibirDados();
		System.out.println("Departamento: " + g1.departamento);

	}

}
