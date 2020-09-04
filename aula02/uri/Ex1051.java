package uri;

import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double salario;

        salario = entrada.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            System.out.printf("Isento\n");
        } else if (salario > 2000 && salario <= 3000) {
            System.out.printf("R$ %.2f \n" , salario *0.08);
        } else if (salario > 3000 && salario <= 4500) {
            System.out.printf("R$ %.2f \n" , (1000*0.8) + ((salario-1000) *0.18));
        } else {
            System.out.printf("R$ %.2f \n" , salario *0.28);
        }
        entrada.close();
    }
}