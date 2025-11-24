package Parte5;

public class Dobro {
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void dobro() {

        System.out.println(this.numero + " O dobro e: " + (this.numero * 2));
    }

}
