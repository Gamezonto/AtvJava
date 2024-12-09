package vet;

import java.util.Scanner;

public class ex85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}

