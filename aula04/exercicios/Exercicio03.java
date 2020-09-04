package exercicios;

import java.util.Scanner;

//Escreva um método em Java que conte quantas vogais existem um uma palavra dada como parâmetro.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String texto;

        System.out.print("Digite uma palavra:");
        texto = entrada.nextLine();
        
        System.out.println("A palavra tem: " + vogal(texto) + " vogais");

        entrada.close();
    }

    public static int vogal (String palavra){
        
        int vogais = 0;
        String auxiliar = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            char c = auxiliar.charAt(i);

            if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
                vogais++;
            } 
        }
        return vogais;
    }
}