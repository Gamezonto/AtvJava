package mt;

import java.util.Scanner;

public class ex106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        boolean iguais = true;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = scanner.nextInt();
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguais = false;
                }
            }
        }

        System.out.println(iguais ? "As matrizes são iguais" : "As matrizes são diferentes");
        scanner.close();
    }
}

