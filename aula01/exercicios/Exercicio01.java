package exercicios;

public class Exercicio01 {
    
    // calcular a soma, subtração, divisão e multiplicação entre os valores 15 e 7
    public static void main(String[] args) {
        double n1, n2, div;

        //soma
        System.out.println("15 + 7 = " + (15 + 7));

         //subtração
         System.out.println("15 - 7 = " + (15 - 7));

          //multiplicação
        System.out.println("15 * 7 = " + (15 * 7));

         //divisão
         n1 = 15;
         n2 = 7; 
         div = n1/n2;

         //formatar quantidade de casas decimais printf("%.2f")
         System.out.println(n1 + " / " + n2 + " = " + div);
    }
}