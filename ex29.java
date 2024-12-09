import java.util.Scanner;

public class ex29{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        String classificacao = (imc < 18.5) ? "Abaixo do peso" :
                (imc < 24.9) ? "Peso normal" :
                        (imc < 29.9) ? "Sobrepeso" :
                                (imc < 34.9) ? "Obesidade grau I" :
                                        (imc < 39.9) ? "Obesidade grau II" :
                                                "Obesidade grau III";

        System.out.println("O IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}

