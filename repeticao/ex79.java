package repeticao;

import java.util.Scanner;

public class ex79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
        scanner.close();
    }
}

