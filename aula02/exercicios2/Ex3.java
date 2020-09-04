package exercicios2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float num1, num2;

        System.out.println("Digite um número");
        num1 = entrada.nextFloat();

        System.out.println("Digite outro número");
        num2 = entrada.nextFloat();

        if (num1 > num2) {
            System.out.println(num1 + " e " + num2);
        } else {
            System.out.println(num2 + " e " + num1);
        }
        entrada.close();
    }
}