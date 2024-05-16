package model;

import java.util.Vector;

public class Professor extends Pessoa {
    private Vector<Disciplina> leciona;
    public Professor(int id, String nome, int idade, Disciplina... leciona) {
        super(id, nome, idade);
        this.leciona = new Vector<>();
        for ( Disciplina disciplina : leciona ) {
            this.leciona.add(disciplina);
        }
    }

    public int darNota(int semestre, Nota nota, Aluno aluno) {
        if (!this.leciona.contains(nota.getDisciplina())) {
            return -1;
        }
        return aluno.inserirNota(semestre, nota);
    }

    public void disciplinas() {
        for (Disciplina disciplina : this.leciona) {
            System.out.println(disciplina);
        }
    }
}
