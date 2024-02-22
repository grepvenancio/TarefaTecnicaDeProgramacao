package ex5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite um número para saber se o mesmo é par ou impar: ");
       int n = sc.nextInt();
       if (n % 2 == 0) {
           System.out.println("O número é par");
       } else {
           System.out.println("O número é impar");
       }
    }
}
