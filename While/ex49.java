package While;

import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int fatorial = 1;

        while (numero > 1) {
            fatorial *= numero;
            numero--;
        }

        System.out.println(fatorial);

        scanner.close();
    }
}

