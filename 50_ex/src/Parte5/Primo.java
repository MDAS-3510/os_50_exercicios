package Parte5;

public class Primo {

    private int numero;

    public Primo(int numero) {
        this.numero = numero;
    }

    public boolean ehPrimo() {
        if (numero <= 1)
            return false;
        if (numero <= 3)
            return true;
        if (numero % 2 == 0 || numero % 3 == 0)
            return false;

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void exibirResultado() {
        System.out.println(numero + (ehPrimo() ? " e primo" : " nao e primo"));
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
