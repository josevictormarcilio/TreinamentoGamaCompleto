package exemplos.exveiculo;

import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
        /*
        Veiculo veiculo = new Veiculo("Hb20", "Hyundai", 15);

        veiculo.exibirDados();
        System.out.println("O valor de consumo de km/L é: " + veiculo.valorConsumo());
        */

        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        double valorConsumo;

        System.out.println("Digite o modelo de um carro: ");
        marca = entrada.nextLine();

        System.out.println("Digite uma marca de carro");
        modelo = entrada.nextLine();

        System.out.println("Digite o consumo de km/L do veículo:");
        valorConsumo = entrada.nextDouble();

        Veiculo veiculo = new Veiculo(modelo, marca, valorConsumo);

        veiculo.exibirDados();
        System.out.println("O valor de consumo de km/L é: " + veiculo.valorConsumo());

        entrada.close();
    }
}