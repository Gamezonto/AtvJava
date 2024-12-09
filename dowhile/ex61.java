package dowhile;
import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0, contador = 2;

        do {
            soma += contador;
            contador += 2;
        } while (contador <= numero);

        System.out.println(soma);

        scanner.close();
    }
}
