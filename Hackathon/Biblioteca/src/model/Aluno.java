package model;

public class Aluno extends Locatario {
    private double debito;
    public Aluno(String nome) {
        super(nome, 2);
    }

    public void multar(double debito) {
        this.debito += debito;
    }

    public double getDebito() {
        return debito;
    }
}
