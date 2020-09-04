package exemplos.exveiculo;

public class Veiculo {

    String modelo, marca;
    double consumo;

    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    
    void exibirDados() {
        System.out.println("Modelo: " + modelo + "\nMarca: " + marca );
    }
    
    /*
    String exibirDados() {
        return "Modelo: " + modelo + "\nMarca: " + marca;
    }
    */
    double valorConsumo(){
        return consumo;
    }
}