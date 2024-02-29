package ex2;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String login, senha;
        boolean flag = false;
        String[][] registros = {
                {"abc", "senha123"},
                {"teste", "senhaTeste"},
                {"admin", "senhaSecreta"},
                {"algo", "senhaFraca"},
                {"controle", "senhaForte"},
                {"def", "superSenha"},
        };
        System.out.println("*************LOGIN*************");
        System.out.print("Insira o usuário: ");
        login = sc.nextLine();
        System.out.print("Insira a senha do usuário: ");
        senha = sc.nextLine();
        for(String[] linha: registros) {
            if (login.equals(linha[0]) && senha.equals(linha[1])) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Acesso garantido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}