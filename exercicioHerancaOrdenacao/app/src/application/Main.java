package application;

import entities.Ordenador;
import entities.OrdenadorDecrescente;

public class Main {

    public static void main(String[] args) {
        int[] numeros = { 5, 2, 9, 1, 3 };

        Ordenador ordCrescente = new Ordenador();
        Ordenador ordDecrescente = new OrdenadorDecrescente();

        System.out.print("Original: ");
        ordCrescente.imprimir(numeros);

        // Copiar o vetor original para manter os dados
        int[] copia1 = numeros.clone();
        int[] copia2 = numeros.clone();

        ordCrescente.ordenar(copia1);
        System.out.print("Crescente: ");
        ordCrescente.imprimir(copia1);

        ordDecrescente.ordenar(copia2);
        System.out.print("Decrescente: ");
        ordDecrescente.imprimir(copia2);
    }
}
