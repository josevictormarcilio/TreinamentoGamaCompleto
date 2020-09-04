import java.util.Scanner;
import java.util.Stack;

public class exercicio01 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        String frase;

        Stack<Character> pilha = new Stack<>();

        System.out.println("Digite uma frase: ");
        frase = entrada.nextLine();


        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }

        System.out.print(pilha);

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop()); //desempilhar
        }

        entrada.close();

    }
}