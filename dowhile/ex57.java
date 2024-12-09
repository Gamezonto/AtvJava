package dowhile;
import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        boolean Primo = numero > 1;
        int divisor = 2;

        do {
            if (numero % divisor == 0) {
                Primo = false;
                break;
            }
            divisor++;
        } while (divisor <= Math.sqrt(numero));

        System.out.println(Primo ? "Primo" : "Não é primo");

        scanner.close();
    }
}

