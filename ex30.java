import java.util.Scanner;

public class ex30{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        double preco = quantidade < 12 ? 0.50 : 0.40;
        double valorTotal = quantidade * preco;

        System.out.println("O valor total a ser pago é: R$ " + valorTotal);

        scanner.close();
    }
}
