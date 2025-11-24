package Parte7;


public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }
    public ContaBancaria(int numeroConta, String titular) {
        this(numeroConta, titular, 0.0); 
    }

    public ContaBancaria(int numeroConta) {
        this(numeroConta, "Titular não informado");
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("ContaBancaria{numeroConta=%d, titular='%s', saldo=%.2f}",
                numeroConta, titular, saldo);
    }

    public int getNumeroConta() { return numeroConta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
