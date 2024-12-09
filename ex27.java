import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        char sexo = scanner.next().charAt(0);

        boolean podeAposentar = (sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60);

        System.out.println(podeAposentar ? "Pode se aposentar." : "Não pode se aposentar.");

        scanner.close();
    }
}
