package model;

public class Conta {
    private int numConta;
    private String titular;
    protected double saldo;

    public Conta(int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public double sacar(double saque) {
        if (this.saldo == 0) {
            return 0;
        }
        double diff = this.saldo - saque;
        if (diff < 0) {
            saque = this.saldo;
            this.saldo = 0;
        } else {
            this.saldo = diff;
        }
        return saque;
    }

}
