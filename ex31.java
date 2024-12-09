import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = scanner.nextDouble();
        double salarioFuncionario = scanner.nextDouble();
        double quantidadeSalarios = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidadeSalarios + " salários-mínimos.");

        scanner.close();
    }
}
