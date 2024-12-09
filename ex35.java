import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        String resultado = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("Média: " + media);
        System.out.println(resultado);

        scanner.close();
    }
}

