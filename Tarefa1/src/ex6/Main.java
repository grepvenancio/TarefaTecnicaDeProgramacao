package ex6;
import java.util.Scanner;

public class Main {

    public static int Fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Fatorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fatorial;
        System.out.print("Digite um número para descobrir o fatorial do mesmo: ");
        n = sc.nextInt();
        fatorial = Fatorial(n);
        System.out.println("Fatorial de " + n + " é igual a: " + fatorial);
    }
}
