import java.util.Scanner;
public class ex17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade <= 64) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso(Tá com o pé na cova....).");
        }

        scanner.close();
    }
}

