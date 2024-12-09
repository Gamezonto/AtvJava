package vet;

import java.util.Scanner;

public class ex87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;

        for (int i = 0; i < 10; i++) {
            if (scanner.nextInt() > 0) {
                contadorPositivos++;
            }
        }

        System.out.println(contadorPositivos);
        scanner.close();
    }
}
