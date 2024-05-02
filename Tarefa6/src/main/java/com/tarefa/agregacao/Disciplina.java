package com.tarefa.agregacao;

import java.util.Vector;

public class Disciplina {
    public String nome;
    private Vector<Aluno> alunos;

    public Disciplina(String nome, Aluno... alunos) {
        this.nome = nome;
        this.alunos = new Vector<>();
        if (alunos.length > 0) {
            for (Aluno aluno : alunos) {
                this.alunos.add(aluno);
            }
        }
    }

    public void insertAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int countAlunos() {
        return alunos.size();
    }
}
