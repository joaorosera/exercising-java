package application;

import java.util.ArrayList;
import entities.Animal;
import entities.Leao;
import entities.Elefante;

public class Main {

	public static void main(String[] args) {
		
	ArrayList<Animal> animal = new ArrayList<>();
	
	Animal leao = new Leao("Joshua", 28);
	Animal elefante = new Elefante("Xavier", 87);
	
	animal.add(leao);
	animal.add(elefante);
	
	for (Animal a : animal) {
		a.fazerSom();
		System.out.println();
		}
	}
}
