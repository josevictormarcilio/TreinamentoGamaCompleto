package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0,  num = 1;

       while (num != 0){
           System.out.println("Digite um número: ");
            num = entrada.nextInt();
            soma += num; 
       }
    
       System.out.println("A soma dos números é = " + soma);
       entrada.close();
    }
}