package repeticao;

import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        boolean ehPrimo = numero > 1;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        System.out.println(ehPrimo ? "Primo" : "Não é primo");

        scanner.close();
    }
}

