package exercicios2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double a, b, c;

        System.out.println("Insira o primeiro valor");    
        a = entrada.nextDouble();

        System.out.println("Insira o segundo valor");    
        b = entrada.nextDouble();

        System.out.println("Insira o terceiro valor");    
        c = entrada.nextDouble();

        if (a > b+c || b > a+c || c> a+b)  {
            System.out.println("Não é um triângulo");
            } else if (a == b && b == c && a == c) {
                System.out.println("É um triângulo equilátero");
                } else if (a == b || b == c || a == c) {
                     System.out.println("É um triângulo isósceles");
                     } else{
                        System.out.println("É um triângulo escaleno");
        }
            
        entrada.close();


    }
}