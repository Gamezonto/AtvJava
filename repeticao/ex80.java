package repeticao;

import java.util.Scanner;

public class ex80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int somaIdades = 0, contador = 0;

        while (true) {
            nome = scanner.next();
            if (nome.equalsIgnoreCase("fim")) break;
            somaIdades += scanner.nextInt();
            contador++;
        }

        System.out.println(contador > 0 ? somaIdades / (double) contador : 0);
        scanner.close();
    }
}


