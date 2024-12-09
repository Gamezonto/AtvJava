package dowhile;

import java.util.Scanner;

public class ex59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0, contador = 0;

        do {
            String nome = scanner.next();
            int idade = scanner.nextInt();
            somaIdades += idade;
            contador++;
        } while (contador < 5);

        System.out.println(somaIdades / 5.0);

        scanner.close();
    }
}

