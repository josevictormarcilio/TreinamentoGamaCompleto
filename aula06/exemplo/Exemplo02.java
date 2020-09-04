package exemplo;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        int numeroProcurado = 20;
        boolean achou;

        numeros.add(12);
        numeros.add(34);
        numeros.add(55);
        numeros.add(5);

        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
            soma = soma + numeros.get(i);
        }
        System.out.println("Soma = "+ soma);

        achou = false;
        for (int j = 0; j < numeros.size(); j++) {
            if (numeros.get(j) == numeroProcurado){
                achou=true;
                break; //interrompe o laço (no caso o For)
            } 
        }
        if (achou) {
            System.out.println("Encontrado!!! :)");
        } else {
            System.out.println("Não encontrado :(");
            
        }
    }
}