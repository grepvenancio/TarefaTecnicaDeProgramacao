package model;

import java.util.Vector;

public class Aluno extends Pessoa {
    private Vector<Vector<Nota>> notas;
    private Vector<Vector<Disciplina>> matriculado;
    public Aluno(int id, String nome, int idade) {
        super(id, nome, idade);
        this.notas = new Vector<>();
        this.matriculado = new Vector<>(12);
        this.notas.add(new Vector<>());
    }

    public void gerarHistorico() {
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Notas do " + i + 1 + " semestre.");
            for (int j = 0; j < notas.get(i).size(); j++) {
                System.out.println(notas.get(i).get(j).toString());
            }
        }
    }

    public void matricular(Disciplina disciplina, int semestre) {
        if (semestre >= this.matriculado.size()) {
            this.matriculado.add(new Vector<>());
        }
        this.matriculado.get(semestre).add(disciplina);
    }

    public int inserirNota(int semestre, Nota nota) {
        if (semestre <= this.notas.size()) {
            this.matriculado.add(new Vector<>());
        }
        Vector<Disciplina> materiasMatriculado = this.matriculado.get(semestre);
        boolean flag = false;
        for ( Disciplina disciplina : materiasMatriculado) {
            if (disciplina == nota.getDisciplina()) {
                flag = true;
            }
        }
        if (flag == false) {
            return -1;
        }
        if (semestre == 0) {
            this.notas.firstElement().add(nota);
            return 0;
        }
        System.out.println("Aqui: " + semestre);
        this.notas.get(semestre).add(nota);
        return 0;
    }
}

