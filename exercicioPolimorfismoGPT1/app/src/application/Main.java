package application;

import java.util.ArrayList;
import java.util.List;

import entities.Impressora;
import entities.ImpressoraJatoDeTinta;
import entities.ImpressoraLaser;

public class Main {

	public static void main(String[] args) {
		
		List<Impressora> Lista = new ArrayList<>();
		
		Lista.add(new Impressora());
		Lista.add(new ImpressoraLaser());
		Lista.add(new ImpressoraJatoDeTinta());
		
		for (Impressora imp : Lista) {
			imp.imprimir();
		}
	}
}
