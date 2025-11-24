package Parte4;

public class soma_matrizes {
    private int[] matrizA = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] matrizB = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    public int[] getMatrizA() {
        return matrizA;
    }
    public void setMatrizA(int[] matrizA) {
        this.matrizA = matrizA;
    }
    public int[] getMatrizB() {
        return matrizB;
    }
    public void setMatrizB(int[] matrizB) {
        this.matrizB = matrizB;
    }

    public void soma() {
        int[] matrizSoma = new int[matrizA.length];
        for (int i = 0; i < matrizA.length; i++) {
            matrizSoma[i] = matrizA[i] + matrizB[i];
        }
        System.out.println("Soma das matrizes:");
        for (int num : matrizSoma) {
            System.out.print(num + " ");
        }
        
    }


}
