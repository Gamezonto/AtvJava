package vet;

import java.util.Scanner;

public class ex88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0, contPares = 0;
        int somaImpares = 0, contImpares = 0;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                somaPares += numero;
                contPares++;
            } else {
                somaImpares += numero;
                contImpares++;
            }
        }

        System.out.println(somaPares / (double) contPares);
        System.out.println(somaImpares / (double) contImpares);

        scanner.close();
    }
}


