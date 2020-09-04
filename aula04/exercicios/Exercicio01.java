package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        tipo(numero);

        entrada.close();
    }

    public static void tipo(int num) {
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }

    public static boolean isPar (int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

        /*
        //Outro tipo de resposta usando boolean: 

        public static void main(String[] args) {
            if(isPar(10)){
                System.out.println("É Par");
            } else {
                System.out.println("É impar");
            }
        }   

        public static boolean isPar (int num){
            return (num % 2 == 0);
        }
        */
    }

}