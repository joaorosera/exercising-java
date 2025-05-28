package application;

import java.util.ArrayList;

import entities.ItemBiblioteca;
import entities.Livro;
import entities.Revista;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<ItemBiblioteca> lista = new ArrayList<>();
		Livro livro1 = new Livro("Os 7 anões", 2038, "Elizabete da Silva", 764);
		Revista revista1 = new Revista("MAD", 2010, "Terceira edição", "Outubro");
		
		lista.add(livro1);
		lista.add(revista1);
		
		for (ItemBiblioteca item: lista) {
			item.exibirDados();
			System.out.println();
		}
	}

}
