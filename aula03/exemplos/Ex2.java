package exemplos;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cont = 1; //conta quantas notas serão digitadas
        double nota, media, soma = 0; //acumulador das notas digitadas
        final int QTDENOTAS = 3; //constante, nunca muda

        while (cont <= QTDENOTAS) {
            System.out.printf("Digite a nota (%d / %d): ", cont, QTDENOTAS); //d representa numero inteiro
            nota = entrada.nextDouble();
            soma = soma + nota;

            cont++; //cont +=5
        }

        media = soma / QTDENOTAS;

        System.out.printf("A media das notas é: %.2f \n" , media);

        entrada.close();
    }
}