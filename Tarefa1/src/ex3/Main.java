package ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a;
        int op;
        double area = 0;
        System.out.println("**************************");
        System.out.println("---CALCULADORA DE ÁREA---");
        System.out.println("**************************");
        System.out.println("1 - Área do quadrado");
        System.out.println("2 - Área do círculo");
        System.out.println("**************************");
        System.out.print("Escolha uma das opções: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Escreva a largura de um dos lados do quadrado: ");
                a = sc.nextInt();
                area = a*a;
                break;
            case 2:
               System.out.print("Escreva o raio do círculo: ");
               a = sc.nextInt();
               area = Math.PI*(a*a);
        }
        System.out.println("Área da forma geométrica: " + area);
    }
}
