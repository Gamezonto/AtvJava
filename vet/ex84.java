package vet;

import java.util.Scanner;

public class ex84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;

        for (int i = 0; i < 5; i++) {
            if (scanner.nextInt() % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println(contadorPares);
        scanner.close();
    }
}

