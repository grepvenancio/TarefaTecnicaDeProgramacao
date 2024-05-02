package com.tarefa.agregacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-**\tCRIAÇÃO DE DISCIPLINA");
        System.out.print("->>\tNome da disciplina: ");
        String nomeDis = sc.nextLine();
        System.out.println();

        Disciplina disciplina = new Disciplina(nomeDis);

        System.out.println("-**\tINSERCAO DE ALUNOS");
        System.out.print("->>\tQuantidade de alunos: ");
        int qtAlunos = sc.nextInt();
        System.out.println(qtAlunos);

        for (int i = 1; i <= qtAlunos; i++) {
            String _ = sc.nextLine();
            System.out.println("-**\tALUNO: " + i);
            System.out.print("->>\tNome do aluno: ");
            String nomeAluno = sc.nextLine();
            System.out.println();
            Aluno aluno = new Aluno(i, nomeAluno);
            disciplina.insertAluno(aluno);
        }
    }
}
