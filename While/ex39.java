package While;

import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (contador < 5) {
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        }

        double media = soma / 5.0;

        System.out.println("A média aritmética dos valores lidos é: " + media);

        scanner.close();
    }
}

