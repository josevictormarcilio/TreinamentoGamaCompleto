package exercicios;

import java.util.Scanner;

public class Exercicio06 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       double base, altura, area;

       System.out.println("Digite a medida da base do triângulo");
       base = entrada.nextDouble();

       System.out.println("Digite a medida da altura do triângulo");
       altura = entrada.nextDouble();

       entrada.close();

       area = (altura * base)/2;

       System.out.println("A área do triângulo é: " + area);

   } 
}