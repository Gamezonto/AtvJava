package While;

import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int a = 0, b = 1, temp;

        System.out.print("Sequência de Fibonacci: ");
        while (a <= numero) {
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }

        scanner.close();
    }
}

