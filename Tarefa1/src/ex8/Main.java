package ex8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1, n, soma = 0, qtImpar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma quantidade de números impáres: ");
        n = sc.nextInt();
        while (qtImpar < n) {
            if (i % 2 != 0) {
                soma += i;
                qtImpar++;
            }
            i++;
        }
        System.out.println("A soma dos primeiros " + n + "números impáres é igual a: " + soma);
    }
}
