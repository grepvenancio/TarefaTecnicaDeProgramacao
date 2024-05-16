package model;

public class Corrente extends Conta {
    private double chequeEspecial;
    private double limiteChequeEspecial;
    public Corrente(int numConta, String titular, double saldo, double chequeEspecial, double limiteChequeEspecial) {
        super(numConta, titular, saldo);
        this.chequeEspecial = chequeEspecial;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void depositar(double saldo) {
        System.out.println("Cheque especial: " + this.chequeEspecial + " Limite: " + this.limiteChequeEspecial);
        if (this.chequeEspecial < this.limiteChequeEspecial) {
            double diff = this.limiteChequeEspecial - this.chequeEspecial;
            System.out.println("A diferença é igual a " + diff);
            saldo = saldo - diff;
            this.chequeEspecial += diff;
        }
        System.out.println("Sobrou " + saldo);
        super.depositar(saldo);
    }


    @Override
    public double sacar(double saque) {
        if (this.getSaldo() == 0 && this.chequeEspecial == 0) {
            return 0;
        }
        double diff = this.getSaldo() - saque;
        if (diff < 0 && this.chequeEspecial >= saque) {
            this.chequeEspecial += diff;
            super.saldo = 0;
        } else if (diff < 0 && this.chequeEspecial < saque) {
            saque -= this.chequeEspecial;
            this.chequeEspecial = 0;
        } else {
            this.saldo = diff;
        }
        return saque;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
}
