package vet;

import java.util.Arrays;
import java.util.Scanner;

public class ex86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}

