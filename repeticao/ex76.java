package repeticao;

import java.util.Scanner;

public class ex76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0;

        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println(soma);
        scanner.close();
    }
}


