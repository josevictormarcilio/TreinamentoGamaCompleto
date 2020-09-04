package exercicio02;

public class ContaPoupanca extends Conta {
    private static double taxa; //static = o mesmo atributo para todos os objetos, pois é um atributo de classe 

    public ContaPoupanca (int num){
        super(num);
    }

    //o método que altera o atributo de classe deve ser static também
    public static void setTaxa(double taxaPoup) {
        taxa = taxaPoup;
    }

    @Override
    public void sacar (double valor){
        if ((valor > 0 && getSaldo() + taxa >= valor)){
            super.sacar(valor - taxa);
        }
    }
}