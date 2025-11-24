package Parte5;

public class Maior {

    private int a, b;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Maior(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int retornarMaior() {
        return (a > b) ? a : b;
    }

    public void exibirMaior() {
        System.out.println("O maior entre " + a + " e " + b + " e: " + retornarMaior());
    }
}
