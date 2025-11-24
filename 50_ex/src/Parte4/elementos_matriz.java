package Parte4;

public class elementos_matriz {
    public int[] vetor = { 4, 7, 12, 23, 18, 9, 30, 44, 51, 16 };

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public void imprimirElementos() {
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.println("Numero par: " + num);
            }
        }
    }
}
