package ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = sc.nextInt();

        if (num1 != num2) {
            System.out.println("São números diferentes");
            if (num1 > num2) {
                System.out.println("O primeiro número é maior que o segundo");
            } else {
                System.out.println("O segundo número é maior que o primeiro");
            }
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}

