package model;

import java.util.Date;
import java.util.Vector;

public abstract class Locatario {
    protected String nome;
    protected int qtEmprestimo;
    protected int maxEmprestimos;
    protected Vector<Emprestimo> emprestimos;

    public Locatario(String nome, int maxEmprestimos) {
        this.nome = nome;
        this.maxEmprestimos = maxEmprestimos;
        this.emprestimos = new Vector<>(10);
    }

    public int pegarEmprestimo(Livro livro, Date previsaoDevolucao) {
        if (this.qtEmprestimo > maxEmprestimos) {
            return -1;
        }
        Date dtEmprestimo = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, this, dtEmprestimo, previsaoDevolucao);
        this.emprestimos.add(emprestimo);
        return 0;
    }

    public Vector<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

}
