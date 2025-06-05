package application;

import entities.Gerente;
import entities.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("Geremias", 3600.00, 675.0);		
		Vendedor v = new Vendedor("Xavier", 1400.00, 75.00);
		
		System.out.println("Cálculo do salário do gerente: ");
		System.out.println(g.calcularSalarioTotal());
		
		System.out.println();
		
		System.out.println("Cálculo do salário do vendedor: ");
		System.out.println(v.calcularSalarioTotal());
	}

}
