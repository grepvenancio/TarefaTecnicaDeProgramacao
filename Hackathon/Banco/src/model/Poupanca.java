package model;

public class Poupanca extends Conta {
    private Corrente contaCorrente;
    public Poupanca(int numConta, String titular, double saldo, Corrente contaCorrente){
        super(numConta, titular, saldo);
        this.contaCorrente = contaCorrente;
    }

    @Override
    public double sacar(double saque) {
        saque = super.sacar(saque);
        this.contaCorrente.depositar(saque);
        return this.contaCorrente.sacar(saque);
    }

}
