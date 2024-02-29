package ex9;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String[] nomes = new String[5];
        String cmp_nome;
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o " + (i + 1) + "⁰ nome: ");
            nomes[i] =  sc.nextLine();
        }
        System.out.print("Insira um nome para checar se está presente no array: ");
        cmp_nome = sc.nextLine();
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals(cmp_nome)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Nome Presente na lista");
        } else {
            System.out.println("Nome não está presente na lista");
        }
    }
}
