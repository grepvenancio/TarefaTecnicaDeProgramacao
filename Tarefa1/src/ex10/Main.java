package ex10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha_secreta = "Java123";
        String tentativa = "";
        boolean flag = false;
        while (!flag) {
            System.out.print("Tente adivinhar a senha secreta: ");
            tentativa = sc.nextLine();
            if (senha_secreta.equals(tentativa)) {
                flag = true;
            }
        }
        System.out.println("Parabéns você adivinhou a senha secreta!");
    }
}
