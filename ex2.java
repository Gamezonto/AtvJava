
import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        scan.close();

        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Raio: %.2f | Perímetro: %.2f | Área: %.2f%n", raio, perimetro, area);
    }
}