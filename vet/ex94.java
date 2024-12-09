package vet;

import java.util.Scanner;

public class ex94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}

