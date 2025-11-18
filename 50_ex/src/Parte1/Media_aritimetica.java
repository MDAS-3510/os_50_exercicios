package Parte1;

public class Media_aritimetica {
    public int numero1;
    public int numero2;
    public int numero3;

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

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public double calcularMedia() {
        return (this.numero1 + this.numero2 + this.numero3) / 3.0;
    }

}
