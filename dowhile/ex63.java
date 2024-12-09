package dowhile;

import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        do {
            System.out.println(numero % 10);
            numero /= 10;
        } while (numero > 0);

        scanner.close();
    }
}
