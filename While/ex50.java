package While;

import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int somaIdades = 0, contador = 0;

        while (true) {
            nome = scanner.next();
            if (nome.equalsIgnoreCase("fim")) break;
            int idade = scanner.nextInt();
            somaIdades += idade;
            contador++;
        }

        System.out.println("Média das idades: " + (contador > 0 ? somaIdades / (double) contador : 0));

        scanner.close();
    }
}

