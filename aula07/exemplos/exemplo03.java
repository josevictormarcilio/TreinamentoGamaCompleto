package exemplos;

import java.util.TreeSet;

public class exemplo03 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();
        int [] numeros = {2, 4, 3, 6, 9, 8, 7, 2, 5, 0, 3}; //vetor de números
        
        //percorre da osição 0 até o tamanho do vetor
        for (int i = 0; i < numeros.length; i++) {
            //System.out.print(arvore.add(numeros [i]) + " "); validar resultado boolean
            arvore.add(numeros [i]); //pega explicitamente os valores em cada posição
        }
        
        //exibe todos os elementos da árvore
        System.out.println(arvore);

        //verifica so o valor está presente na árvore
        System.out.println(arvore.contains(70));

        //para cada valor da árvore
        for (int valor : arvore) {
            System.out.print(valor + " - ");
        }
        
    }
}