import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base e altura do triângulo: ");
        double base = entrada.nextDouble(), altura = entrada.nextDouble();

        entrada.close();

        System.out.printf("Área do triângulo:", (base * altura) / 2);
    }
}

