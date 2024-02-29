package ex3;
import java.util.Scanner;

public class Main {
    public static void imprimirMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Transposição de Matriz**********");
        int dimX, dimY;
        System.out.print("Escreva a dimensão da matriz no eixo Y: ");
        dimY = sc.nextInt();
        System.out.print("Escreva a dimensão da matriz no eixo X: ");
        dimX = sc.nextInt();
        int[][] matriz = new int[dimY][dimX];
        int[][] matrizTransposta = new int[dimX][dimY];
        for(int i = 0; i < matriz.length; i++) {
            System.out.println("*Registro da linha " + i + ".");
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("-Registro da coluna " + j + ": ");
                matriz[i][j] = sc.nextInt();
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("********Matriz Original********");
        imprimirMatriz(matriz);
        System.out.println("********Matriz Transposta********");
        imprimirMatriz(matrizTransposta);
    }
}