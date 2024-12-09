import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = preco * quantidade;

        if (quantidade > 10) {
            valorTotal *= 0.9;
        }

        System.out.println("O valor total a ser pago é: " + valorTotal);

        scanner.close();
    }
}
