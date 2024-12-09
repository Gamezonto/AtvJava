package While;
import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        while (contador < 5) {
            String nome = scanner.next();
            int idade = scanner.nextInt();
            somaIdades += idade;
            contador++;
        }

        double mediaIdades = somaIdades / 5.0;

        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}

