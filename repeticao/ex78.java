package repeticao;

import java.util.Scanner;

public class ex78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        while (numero > 0) {
            System.out.println(numero % 10);
            numero /= 10;
        }

        scanner.close();
    }
}

