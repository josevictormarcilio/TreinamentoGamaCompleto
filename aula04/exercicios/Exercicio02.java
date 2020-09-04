package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Digite 1/3 número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite 2/3 número: ");
        numero2 = entrada.nextInt();

        System.out.print("Digite 3/3 número: ");
        numero3 = entrada.nextInt();

        System.out.println("O menor número é: " + menor(numero1, numero2, numero3)); 
        entrada.close();
    }

    public static int menor (int num1, int num2, int num3){
       int armazena;
        if (num1 <= num2){
            armazena = num1;
        } else {
            armazena = num2;
        } if (armazena >= num3) {
                armazena = num3;
            }
        return armazena;
    }
}