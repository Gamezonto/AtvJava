package vet;

import java.util.Scanner;

public class ex83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            soma += scanner.nextInt();
        }

        System.out.println(soma / 7.0);
        scanner.close();
    }
}

