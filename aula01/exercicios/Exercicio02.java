package exercicios;

import java.util.Scanner;

//faca um programa que leia duas notas de um aluno e calcule a média
public class Exercicio02 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);

       double nota1, nota2, media;

       System.out.println("Digite a nota 1");
       nota1 = entrada.nextDouble();

       System.out.println("Digite a nota 2");
       nota2 = entrada.nextDouble();

       entrada.close();
       
       media = (nota1 + nota2) / 2;

       System.out.println("A média é: " + media);

    }
}