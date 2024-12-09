package vet;

import java.util.Scanner;

public class ex93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 50) {
                contador++;
            }
        }

        System.out.println("Quantidade no intervalo de 10 a 50: " + contador);
        scanner.close();
    }
}

