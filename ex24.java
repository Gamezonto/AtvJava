import java.util.Scanner;
import java.util.Arrays;

public class ex24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();

        Arrays.sort(numeros);

        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
