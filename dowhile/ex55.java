package dowhile;

import java.util.Scanner;

public class ex55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int contador = 1;

        do {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        } while (contador <= 10);

        scanner.close();
    }
}

