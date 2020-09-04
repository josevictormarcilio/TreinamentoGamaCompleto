package exercicioCliente;

import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcao;

        Cliente cliente1 = new Cliente("Jose", "jose@hotmail.com");
        ClienteVip cliente2 = new ClienteVip("Jose", "jose@hotmail.com", 1000);

        System.out.println(cliente1.fazerCompra(100));
        System.out.println(cliente1);
        System.out.println(cliente2.fazerCompra(100));
        System.out.println(cliente2);


     }
}