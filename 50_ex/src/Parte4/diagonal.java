package Parte4;

public class diagonal {
    private int[][] matriz;

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }


    public diagonal() {
        this.matriz = new int[][]{
            {11, 22, 33, 44},
            {55, 66, 77, 88},
            {99, 10, 11, 12},
            {13, 14, 15, 16}
        };
    }

    public void exibirDiagonal() {
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

}
