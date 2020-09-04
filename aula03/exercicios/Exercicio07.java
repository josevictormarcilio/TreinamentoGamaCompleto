package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, soma = 0, positivo = 0;
        final int QTDE = 3 ;
        
        for (int i = 0; i < QTDE; i++) {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            if (num >= 0) {
                positivo ++;
            } 
            soma +=num;
        }
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A quantidade de números positivos digitados é: " + positivo);
        System.out.println("A média dos números digitados é: " + (double)soma/QTDE); //castching - forçar variável na conversão de tipo
        System.out.println("A porcentagem de numeros positovos em relação so total é: " + (((double)positivo/QTDE)*100) + "%");

        entrada.close();
    }
}