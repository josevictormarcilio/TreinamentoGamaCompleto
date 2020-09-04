package exemplos;
//Entrada de dados

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int valor;

      valor = entrada.nextInt();   
      System.out.println("Você digitou o valor " + valor);
     
      //não obrigatório fechar
      entrada.close();
    }
}