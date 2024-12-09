package dowhile;
import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int divisor = 1;

        do {
            if (numero % divisor == 0) System.out.println(divisor);
            divisor++;
        } while (divisor <= numero);

        scanner.close();
    }
}

