package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);
        int num, result, cont = 0;

        System.out.print("Digite um numero inteiro: ");
        num = entrada.nextInt();

        while (cont < 11) {
            result = num * cont;
            System.out.println(num + " x " + cont + " = " + result);
            cont++;
        }

        entrada.close();
    }
}