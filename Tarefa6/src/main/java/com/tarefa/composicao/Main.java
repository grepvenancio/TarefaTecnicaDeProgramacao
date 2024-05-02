package com.tarefa.composicao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-**\tRegistrar pessoa");
        System.out.print("->>\tInsira um nome: ");
        String nome = sc.nextLine();
        System.out.print("->>\tInsira uma idade: ");
        int idade = sc.nextInt();
        System.out.print("->>\tInsira um logradouro: ");
        String _ = sc.nextLine();
        String logradouro = sc.nextLine();
        Endereco endereco = new Endereco(logradouro);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

    }
}
