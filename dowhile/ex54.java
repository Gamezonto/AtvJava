package dowhile;

import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0, contador = 0;

        do {
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        System.out.println(soma / 5.0);

        scanner.close();
    }
}

