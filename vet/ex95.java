package vet;

import java.util.Arrays;
import java.util.Scanner;

public class ex95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

