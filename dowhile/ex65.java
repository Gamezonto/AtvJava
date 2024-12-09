package dowhile;

import java.util.Scanner;

public class ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int somaIdades = 0, contador = 0;

        do {
            nome = scanner.next();
            if (nome.equalsIgnoreCase("fim")) break;
            somaIdades += scanner.nextInt();
            contador++;
        } while (true);

        System.out.println(contador > 0 ? somaIdades / (double) contador : 0);

        scanner.close();
    }
}


