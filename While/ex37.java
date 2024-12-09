package While;

public class ex37 {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 1;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

