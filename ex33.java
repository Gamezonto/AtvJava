import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        char turno = scanner.next().charAt(0);

        String saudacao = (turno == 'M' || turno == 'm') ? "Bom dia, " :
                (turno == 'V' || turno == 'v') ? "Boa tarde, " :
                        "Turno inválido.";

        System.out.println(saudacao + (saudacao.equals("Turno inválido.") ? "" : nome + "."));

        scanner.close();
    }
}
