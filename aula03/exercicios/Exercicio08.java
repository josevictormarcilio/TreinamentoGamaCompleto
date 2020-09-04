package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtde, numero, pares = 0, impares = 0, soma=0;

        System.out.println("Quanto numeros serão digitados? ");
        qtde = entrada.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println("Informe o número: ");
            numero = entrada.nextInt();

            if (numero >= 0 ){
                if (numero%2 == 0) {
                    pares ++;
                    soma += numero;
                 } else {
                    impares++;
                 }
            }
        }
            System.out.println("A media dos pares é " + (double)soma/pares);
            System.out.println("Temos " + (double)impares/qtde*100 + "% de impares");
            entrada.close();
    }
}