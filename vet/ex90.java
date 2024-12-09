package vet;

import java.util.Scanner;

public class ex90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasZero = false;

        for (int i = 0; i < 5; i++) {
            if (scanner.nextInt() == 0) {
                hasZero = true;
            }
        }

        System.out.println(hasZero ? "Há um número zero" : "Não há nenhum número zero");
        scanner.close();
    }
}

