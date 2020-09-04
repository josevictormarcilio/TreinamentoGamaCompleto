package exemplos;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {

        /*
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in)
        int num, soma=0;
        char continua = 's';

        continua = 's';
        while (continua == 's' || continua == 'S'){

            System.out.println("Digite o próximo número: ");
            num = entradaInt.nextInt();
            soma += num; //soma = soma + num;
           
            System.out.print("Deseja continuar? (s/n) ");
            //entrada.nextLine(); //leitura perdida para zerar buffer e fazer a leitura de 2 Scanners 
            continua = entradaStr.nextLine().charAt(0); //pega o primeiro caracter da String digitada

        }

        System.out.println("A soma foi: " + soma);
        entradaInt.close();
        entradaStr.close();

        */

        //leitura de variáveis de diferentes tipos

        Scanner entrada = new Scanner(System.in);
        int num, soma=0;
        String texto;
        char continua = 's';

        continua = 's';
        while (continua == 's' || continua == 'S'){

            System.out.println("Digite o próximo número: ");
            texto = entrada.nextLine();
            //num = entrada.nextInt();
            num = Integer.parseInt(texto);//transforma string em numero inteiro
            soma += num; //soma = soma + num;
           
            System.out.print("Deseja continuar? (s/n) ");
            //entrada.nextLine(); //leitura perdida para zerar buffer e fazer a leitura de 2 Scanners 
            continua = entrada.nextLine().charAt(0); //pega o primeiro caracter da String digitada

        }

        System.out.println("A soma foi: " + soma);
        entrada.close();

    }
}