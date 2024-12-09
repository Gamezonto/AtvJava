import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.15;

        System.out.println("O novo salário depoios do aumento é: " + novoSalario);

        scanner.close();
    }
}
