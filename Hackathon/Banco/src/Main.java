import model.Corrente;
import model.Poupanca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Corrente contaCorrente = new Corrente(
                1,
                "TesteCorrente",
                100,
                300,
                300);
        Poupanca poupanca = new Poupanca(1, "TestePoupança", 150, contaCorrente);
        poupanca.sacar(50);
        System.out.println("Saldo poupança: " + poupanca.getSaldo());
        System.out.println("Saldo corrente: " + contaCorrente.getSaldo());
        double saque = contaCorrente.sacar(150);
        System.out.println("Sacou: " + saque);
        System.out.println("Saldo corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo chque especial: " + contaCorrente.getChequeEspecial());
        contaCorrente.depositar(150);
        System.out.println("Depositando: 150");
        System.out.println("Saldo Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo cheque especial: " + contaCorrente.getChequeEspecial());
    }
}