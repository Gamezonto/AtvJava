import java.util.Scanner;
public class ex25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faltas = scanner.nextInt();

        System.out.println(faltas > 15 ? "Reprovado por falta." : "Aprovado.");

        scanner.close();
    }
}
