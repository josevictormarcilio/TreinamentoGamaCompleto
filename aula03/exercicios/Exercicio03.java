package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int num, cont;

        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();

        /*
        cont = 1;
        while (cont < num){
            System.out.print(cont + ", ");
            cont*=2;
        }
        */
        cont = 2;
        
        System.out.print(1);
        while (cont <= num) {
            System.out.print(", " + cont);
            cont*=2;
        }
        entrada.close();

    }
}