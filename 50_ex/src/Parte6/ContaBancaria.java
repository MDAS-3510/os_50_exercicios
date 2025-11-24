package Parte6;
public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
            return true;
        }
        System.out.println("Valor inválido para depósito.");
        return false;
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
            return true;
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        } else {
            System.out.println("Valor inválido para saque.");
            return false;
        }
    }
    public void exibirSaldo() {
        System.out.printf("Conta: %d | Titular: %s | Saldo atual: R$ %.2f%n",
                numeroConta, titular, saldo);
    }
    public int getNumeroConta() { return numeroConta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}