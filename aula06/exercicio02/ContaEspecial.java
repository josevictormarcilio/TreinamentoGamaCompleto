package exercicio02;

public class ContaEspecial extends Conta{
    private double limite;
    final double TAXA_DEPOSITO = 0.10;
    
    public ContaEspecial (int num, double limite){
        super(num);
        this.limite = limite;
    }

    @Override
    public void sacar (double valor){
        if (valor > 0 && getSaldo() + limite >= valor) {
            super.sacar(valor);
        }
    }

    @Override
    public void depositar (double valor){
        super.depositar(valor - TAXA_DEPOSITO);
    }
}