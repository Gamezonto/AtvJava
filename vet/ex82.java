package vet;

import java.util.Scanner;

public class ex82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += scanner.nextInt();
        }

        System.out.println(soma);
        scanner.close();
    }
}

