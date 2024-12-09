import java.util.Scanner;

public class ex18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else {
            System.out.println("O maior número é: " + numero2);
        }

        scanner.close();
    }
}

