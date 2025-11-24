package Parte5;

public class Fatorial {
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void fatorial() {
        int fat = 1;
        for (int i = 1; i <= this.numero; i++) {
            fat = fat * i;
        }
        System.out.println("O fatorial de " + this.numero + " e: " + fat);
    }
}
