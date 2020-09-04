package exemplos;

import java.util.Stack;

public class exemplo01 {

    public static void main(String[] args) throws Exception{
        
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10); //empilhar
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);

        System.out.println(pilha);

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop()); //desempilhar
        }

        
        try { //tente fazer isso
            int n = pilha.pop();
            System.out.println(n);
        
        } catch (Exception e) { //se tiver problema
            System.out.println("Ocorreu um erro :(");
        } 

        System.out.println("Final do programa");
    }
}