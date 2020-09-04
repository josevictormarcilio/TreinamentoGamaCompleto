package exercicios;

import java.util.Random;
import java.util.TreeSet;

public class exercicio03 {
    public static void main(String[] args) {
        
        TreeSet<Integer> arvore = new TreeSet<>();
         Random rnd = new Random();

    for (int i = 0; i < arvore.size(); i++) {
        arvore.add(rnd.nextInt(500)); 
    }
    
    System.out.print(arvore);
    }
    
}