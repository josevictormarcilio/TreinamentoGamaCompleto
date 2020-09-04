package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double salarioMin, qtdKW, valorKW, valorR, valorDesc;
        //entrada de dados
        System.out.println("Digite o valor do salário mínimo");
        salarioMin = entrada.nextDouble();
        
        System.out.println("Digite a quantidade de quilowatts consumida");
        qtdKW = entrada.nextDouble();

        entrada.close();

        //Processamento e saída de dados
        //Valor por KW
        valorKW = salarioMin * 0.002;
        System.out.println("O valor em reais de cada quilowatt é: " + valorKW);

        //Valor total
        valorR = qtdKW * valorKW;
        System.out.println("O valor em reais a ser pago por residência é: " + valorR);

        //Valor com desconto
        valorDesc = valorR - (valorR * 0.15);
        System.out.println("O valor em reais a ser pago com desconto de 15% é: " + valorDesc);

        //printF - resposta formatada
        //Valor por KW
        valorKW = salarioMin * 0.002;
        System.out.printf("O valor em reais de cada quilowatt é: R$ %.2f \n" , valorKW);

        //Valor total
        valorR = qtdKW * valorKW;
        System.out.printf("O valor em reais a ser pago por residência é: R$ %.2f \n" , valorR);

        //Valor com desconto
        valorDesc = valorR - (valorR * 0.15);
        System.out.printf("O valor em reais a ser pago com desconto é: R$ %.2f \n" , valorDesc);
    }
}