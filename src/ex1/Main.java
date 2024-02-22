package ex1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");

       int num = sc.nextInt();
       if (num > 0) {
           System.out.println("Numero Positivo");
       } else if (num < 0) {
           System.out.println("Numero negativo");
       } else {
           System.out.println("Numero e zero ");
       }
    }
}
