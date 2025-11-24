package Parte4;

public class ordem_inversa {
    private int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


    public int[] getVetor() {
        return vetor;
    }
    
    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

  

    public void exibirInverso() {
        System.out.print("Vetor em ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}
