package dowhile;

public class ex52 {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 1;

        do {
            soma += numero;
            numero++;
        } while (numero <= 100);

        System.out.println(soma);
    }
}

