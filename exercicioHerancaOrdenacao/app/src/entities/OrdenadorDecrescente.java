package entities;

public class OrdenadorDecrescente extends Ordenador {

    // Ordena em ordem decrescente (sobrescrita)
    @Override
    public void ordenar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
