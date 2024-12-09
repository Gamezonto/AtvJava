package dowhile;

import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int a = 0, b = 1;

        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        } while (a <= numero);

        scanner.close();
    }
}

