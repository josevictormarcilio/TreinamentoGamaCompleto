package exercicios2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, desconto;

        System.out.println("Informe seu salario: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento de desoconto!");
        } else if (salario > 600 && salario <= 1200) {
            desconto = salario * 0.20;
            System.out.println("Desconto de 20% " + desconto);
        } else if (salario > 1200 && salario <= 2000) {
            desconto = salario * 0.25;
            System.out.println("Desconto de 25% " + desconto);
        } else {
            desconto = salario * 0.23;
            System.out.println("Desconto de 30% " + desconto);
        }
        entrada.close();
    }
}