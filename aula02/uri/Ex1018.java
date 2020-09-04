package uri;

import java.util.Scanner;

public class Ex1018 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, r100, r50, r20, r10, r5, r2, r1, valor;

        numero = entrada.nextInt();

        while (numero < 0 || numero > 1000000) {
            numero = entrada.nextInt();
        }

        valor = numero;
        r100 = numero/100;
        numero = numero - (r100*100);
        r50 = numero/50;
        numero = numero - (r50*50);
        r20 = numero/20;
        numero = numero - (r20*20);
        r10 = numero/10;
        numero = numero - (r10*10);
        r5 = numero/5;
        numero = numero - (r5*5);
        r2 = numero/2;
        numero = numero - (r2*2);
        r1 = numero;

        System.out.println(valor);
        System.out.println(r100 + " nota(s) de R$ 100,00");
        System.out.println(r50 + " nota(s) de R$ 50,00");
        System.out.println(r20 + " nota(s) de R$ 20,00");
        System.out.println(r10 + " nota(s) de R$ 10,00");
        System.out.println(r5 + " nota(s) de R$ 5,00");
        System.out.println(r2 + " nota(s) de R$ 2,00");
        System.out.println(r1 + " nota(s) de R$ 1,00");

        entrada.close();


    }

}