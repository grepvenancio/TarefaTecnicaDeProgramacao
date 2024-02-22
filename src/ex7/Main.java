package ex7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int idade;
       System.out.print("Digite a sua idade: ");
       idade = sc.nextInt();
       if (idade < 18) {
           System.out.println("Menor de idade");
       } else if (idade < 60) {
           System.out.println("Adulto");
       } else {
           System.out.println("Idoso");
       }
    }
}
