package exercicios2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, vp;

        salario = entrada.nextDouble();
        vp = entrada.nextDouble();

        if (vp > salario*0.3) {
            System.out.println("emprestimo negado");
        } else {
            System.out.println("emprestimo aprovado");
        }

        entrada.close();
    }
}