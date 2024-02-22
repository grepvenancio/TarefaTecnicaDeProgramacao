package ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Escreava um número para obter a tabuada do mesmo: ");
       n = sc.nextInt();
       for (int i = 1; i <= 10; i++) {
           System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
