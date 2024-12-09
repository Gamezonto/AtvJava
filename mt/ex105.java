package mt;

import java.util.Scanner;

public class ex105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Soma da coluna " + (i + 1) + ": " + somaColunas[i]);
        }

        scanner.close();
    }
}

