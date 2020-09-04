package exercicios2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;
        double result;

        System.out.println("Informe um valor inteiro: ");
        num = entrada.nextInt();

        if (num > 20){

            result = num/2.0;
            System.out.println("A metade do número é: " + result);

        } 

        entrada.close();

    }
}