package Parte1;

public class soma_numeros {

    public int numero1;
    public int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int somar() {
        return this.numero1 + this.numero2;
    }

    public void mostrarMensagem() {
        System.out.println("A soma e: " + somar());
    }
}
