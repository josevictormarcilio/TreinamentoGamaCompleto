package uri;

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double c1, num1, valor1, c2, num2, valor2, total;

        c1 = entrada.nextDouble();
        num1 = entrada.nextDouble();
        valor1 = entrada.nextDouble();
        c2 = entrada.nextDouble();
        num2 = entrada.nextDouble();
        valor2 = entrada.nextDouble();

        total = ((num1*valor1) + (num2*valor2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
        System.out.println("Códiogo 1: " + c1 + " e " + "código 2: " + c2);

        entrada.close();

 }
}