package application;

import entities.AlunoGraduacao;

public class Main {
	
	public static void main(String[] args) {
		
		AlunoGraduacao aluno = new AlunoGraduacao("João", 19, 1144007919, "Engenharia de Software");
		aluno.exibirDados();
	}

}
