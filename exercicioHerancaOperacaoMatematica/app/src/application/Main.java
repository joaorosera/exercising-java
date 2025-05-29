package application;

import entities.Divisao;
import entities.Multiplicacao;
import entities.OperacaoMatematica;
import entities.Soma;
import entities.Subtracao;

public class Main {

	public static void main(String[] args) {
		
		OperacaoMatematica op = new OperacaoMatematica();
		
		op = new Soma();
		op.calcular(10, 5);
		
		op = new Subtracao();
		op.calcular(10, 5);
		
		op = new Multiplicacao();
		op.calcular(10, 5);
		
		op = new Divisao();
		op.calcular(10, 5);
	}

}
