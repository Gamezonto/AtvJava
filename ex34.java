import java.util.Scanner;

public class ex34{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 18 && idade <= 70)) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto facultativo.");
        }

        scanner.close();
    }
}
