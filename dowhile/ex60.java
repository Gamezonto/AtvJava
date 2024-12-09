package dowhile;

public class ex60 {
    public static void main(String[] args) {
        int a = 0, b = 1, contador = 1;

        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            contador++;
        } while (contador <= 20);
    }
}

