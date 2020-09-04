package exercicios;

import java.util.Scanner;

// ler salário com aumento de 25% e mostrar o novo valor
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double salario, novosalario; 

        System.out.println("Digite o seu salário");
        salario = entrada.nextDouble();

        entrada.close();

        novosalario = salario + (salario * 0.25); // salario * 1.25

        System.out.println("O seu salário pós reajuste é: " + novosalario);
    }
}