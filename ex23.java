import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mes = scanner.next().toLowerCase();

        int dias = switch (mes) {
            case "janeiro", "março", "maio", "julho", "agosto", "outubro", "dezembro" -> 31;
            case "abril", "junho", "setembro", "novembro" -> 30;
            case "fevereiro" -> 28;
            default -> -1;
        };

        System.out.println(dias != -1 ? "O mês de " + mes + " tem " + dias + " dias." : "Mês inválido.");
        scanner.close();
    }
}
