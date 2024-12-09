import java.util.Scanner;
public class ex13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        System.out.println(numero1 % numero2 == 0 ? numero1 + " é múltiplo de " + numero2 : numero1 + " não é múltiplo de " + numero2);

        scanner.close();
    }
}
