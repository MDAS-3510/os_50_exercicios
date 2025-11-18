package Parte3;

public class contador {
    public int contador = 1;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void contador() {
        while (contador <= 100) {
            System.out.println("numero: " + contador);
            contador++;
        }
    }
}
