package Parte4;

public class media_vetor {
    private int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    private double media;
    private int soma;

    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public void calcularMedia() {
        soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        media = (double) soma / vetor.length;
    }
}
