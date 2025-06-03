package application;

import java.io.ObjectInputStream.GetField;
import java.util.Locale;

import entities.Camisa;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Livro livro = new Livro(
				"O Pequeno Príncipe",
				149.90, 
				"Antoine de Saint-Exupéry", 
				96, 
				true
			);
		
		Camisa camisa = new Camisa(
			    "Camisa polo",
			    99.90,
			    "Verde",
			    48,
			    "Poliéster"
			);

		
		System.out.println("Dados do livro:");
		livro.exibirInfo();
		
		System.out.println();
		
		System.out.println("Dados da Camisa:");
		camisa.exibirInfo();

	}

}
