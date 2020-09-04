package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        /*
        Scanner entrada = new Scanner(System.in);
        double medidaKM, milha, jarda, pe, polegada;

        // entrada de dados
        System.out.println("Informe a medida em KM");
        medidaKM = entrada.nextDouble();

    
         * //processamento println //Milhas milha = medidaKM * 0.62137;
         * System.out.println("A medida em milhas é : "+ milha);
         * 
         * //Jarda jarda = milha * 1.760; System.out.println("A medida em jarda é : "+
         * jarda);
         * 
         * //Pés pe = jarda * 3; System.out.println("A medida em pés é : "+ jarda);
         * 
         * // Polegadas polegada = pe * 12;
         * System.out.println("A medida em polegada é: "+ polegada);
         

        // processamento printf
        // Milhas
        milha = medidaKM * 0.62137;
        System.out.printf("A medida em milhas é: %.2f \n", milha);

        // Jarda
        jarda = milha * 1.760;
        System.out.printf("A medida em jarda é: %.2f \n", jarda);

        // Pés
        pe = jarda * 3;
        System.out.printf("A medida em pés é: %.2f \n", jarda);

        // Polegadas
        polegada = pe * 12;
        System.out.printf("A medida em polegada é: %.2f \n", polegada);

    */


        //declarando uma constante - nunca muda

        Scanner entrada = new Scanner (System.in);

        final float KM_MILHAS = 0.62137f;
        final int MILHAS_JARDAS = 1760;
        final int JARDAS_PES = 3;
        final int PES_POLEGADAS = 12;

        double km;

        System.out.println("Quanto KM foram rodados?");
        km = entrada.nextDouble();

        entrada.close();
        
        System.out.println(km + " km");
        System.out.println("Em milhas " + km + "km são " + (km *KM_MILHAS));
        System.out.println("Em jardas " + km + "km são " + (km *KM_MILHAS * MILHAS_JARDAS));
        System.out.println("Em Pés " + km + "km são " + (km *KM_MILHAS * MILHAS_JARDAS * JARDAS_PES));
        System.out.println("Em Pés " + km + "km são " + (km *KM_MILHAS * MILHAS_JARDAS * JARDAS_PES * PES_POLEGADAS));

    }
}