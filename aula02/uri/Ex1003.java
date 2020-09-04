package uri;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int A, B, SOMA;

        A = entrada.nextInt();
        B = entrada.nextInt();

        SOMA = A+B;

        System.out.println("SOMA = " + SOMA);

        entrada.close();

    }
}