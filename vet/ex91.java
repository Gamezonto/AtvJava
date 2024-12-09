package vet;

import java.util.Scanner;

public class ex91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPositivos = 0, somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.println("Soma dos positivos: " + somaPositivos);
        System.out.println("Soma dos negativos: " + somaNegativos);

        scanner.close();
    }
}

