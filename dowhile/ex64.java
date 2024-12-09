package dowhile;

import java.util.Scanner;

public class ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int fatorial = 1;

        do {
            fatorial *= numero;
            numero--;
        } while (numero > 0);

        System.out.println(fatorial);

        scanner.close();
    }
}

