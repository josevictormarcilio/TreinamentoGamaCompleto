package uri;

import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        double A, B, C, MEDIA;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        MEDIA = ((A*2)+(B*3)+(C*5))/10;

        System.out.printf("MEDIA = %.1f\n" , MEDIA);

        entrada.close();
    }
}