package exemplos;

import java.util.Scanner;

//trabsformando texto em int/double e vice-versa
public class Ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int numeroInt;
        double numeroDouble;
    
        texto = entrada.nextLine();
        
        System.out.println(texto + 1);
    
        numeroInt = Integer.parseInt(texto +1);
        System.out.println(numeroInt +1);

        numeroDouble = Double.parseDouble(texto +1);
        System.out.println(numeroDouble +1);
    
        entrada.close();
    }

}