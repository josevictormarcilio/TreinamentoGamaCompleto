package exercicios2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome;
        boolean resultado;

        System.out.println("Digite sua senha: ");
        nome = entrada.nextLine();

        resultado = nome.equals("R10p5"); //equalsIgnoreCase
        
        if (resultado) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso Negado");
        }
        entrada.close();
    }
}