package mt;

import java.util.Scanner;

public class ex101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = soma / 16.0;
        System.out.println(media);

        scanner.close();
    }
}

