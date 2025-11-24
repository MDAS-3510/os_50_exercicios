package Parte5;

public class MDC {
    private int a, b;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = Math.abs(a);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = Math.abs(b);
    }

    public MDC(int a, int b) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
    }

    public int calcularMDC() {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void exibirMDC() {
        System.out.println("MDC(" + a + ", " + b + ") = " + calcularMDC());
    }

}
