package com.tarefa.dependencia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-**\tNOVA COMPRA");
        System.out.print("->>\tInsira um id: ");
        int id = sc.nextInt();
        System.out.print("->>\tInsira os produtos: ");
        String _ = sc.next();
        String produtos = sc.nextLine();
        Compra compra = new Compra(id, produtos.split(" "));
        Cupom cupom = new Cupom();
        compra.finalizarCompra(cupom);
    }
}
