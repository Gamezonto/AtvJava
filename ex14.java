import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();
        int meses = scanner.nextInt();
        int anos = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem aproximadamente " + totalDias + " dias de vida.");

        scanner.close();
    }
}
