import java.util.Scanner;
import java.util.Stack;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;
        Stack<Character> pilha = new Stack<>();

        System.out.println("Digite uma frase: ");
        frase = entrada.nextLine();
        frase = frase + " "; //solução 1: encontrar espaço e esvaziar tudo que tem na pilha

        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.charAt(i) == ' '){
                while (!pilha.isEmpty()) {
                    System.out.print(pilha.pop());
                }
                System.out.print(" ");
            } else {
                pilha.push(frase.charAt(i));
            }
        }

        //solução 2: encontrar espaço e esvaziar tudo que tem na pilha
        /* 
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        */

        entrada.close();

    }
}