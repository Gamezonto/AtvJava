package mt;

import java.util.Scanner;

public class ex109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }

        System.out.println(identidade ? "A matriz é identidade" : "A matriz não é identidade");
        scanner.close();
    }
}

