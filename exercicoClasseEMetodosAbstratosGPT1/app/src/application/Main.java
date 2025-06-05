package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		List<Forma> Lista = new ArrayList<>();
		
		Lista.add(new Retangulo(5.0, 3.0)); 
		Lista.add(new Circulo(2.0));
		
		double total = 0;
		
		for (Forma form : Lista) {
			double area = form.calcularArea();
			total += area;
			System.out.println("Área: " + area);			
		}
		
		System.out.println("Área total: " + total);
	}
}
