import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}
