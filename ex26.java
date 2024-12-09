import java.util.Scanner;
public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double preco = 0.0;

        switch (codigo) {
            case 1 -> preco = 10.0;
            case 2 -> preco = 20.0;
            case 3 -> preco = 30.0;
            default -> System.out.println("Código de produto inválido.");
        }

        if (preco != 0.0) {
            double valorTotal = preco * quantidade;
            System.out.println("O valor total a ser pago é: " + valorTotal);
        }

        scanner.close();
    }
}
