import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();
        String conceito = (nota >= 9.0) ? "A" :
                (nota >= 7.0) ? "B" :
                        (nota >= 5.0) ? "C" :
                                (nota >= 3.0) ? "D" : "E";

        System.out.println("A conceituação do aluno é: " + conceito);

        scanner.close();
    }
}
