package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int num = 1, soma= 0;

        while (num != 0){
            System.out.print("Digite um numero inteiro, caso não queira continuar digite 0: ");
            num = entrada.nextInt();

            if (num>0) {
                soma+=num;
            } 
        }
        System.out.println("A soma dos numeros digitados é: " + soma);
        entrada.close();
    }
}