package While;

import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0;
        int contador = 2;

        while (contador <= numero) {
            soma += contador;
            contador += 2;
        }

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);

        scanner.close();
    }
}

