package ex1;

public class Main {
    public static void main(String args[]) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] m2 = {
                {4, 1, 7},
                {3, 2, 4},
                {3, 1, 8}
        };
        int[][] m3 = new int[3][3];
        for(int i = 0; i < m3.length; i++) {
            for(int j = 0; j < m3[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for(int[] arr: m3) {
            for(int e: arr) {
                System.out.print(e + " ");
            }
            System.out.println("");
        }
    }
}