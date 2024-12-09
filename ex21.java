import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menores = 0;
        int maiores = 0;

        System.out.print("Digite a idade: ");
        while (true) {
            int idade = scanner.nextInt();
            if (idade < 0) break;
            if (idade < 18) menores++;
            else maiores++;
            System.out.print("Digite a idade : ");
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);

        scanner.close();
    }
}
