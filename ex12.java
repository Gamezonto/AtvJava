import java.util.Scanner;

public class ex12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);

        scanner.close();
    }
}
