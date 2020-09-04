package exercicio02;

public class Conta {
    private int num;
    private double saldo;

    public Conta (int num){
        this.num = num;
        this.saldo = 0;
    }

    public void depositar (double valor){
        if (valor > 0) {
            saldo += + valor;
        }
    }

    public void sacar (double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }

    public int getNumConta(){
        return num;
    }

    public double getSaldo(){
        return saldo;
    }

    public String imprimir (){
        return "Número da conta: " + num + "\nSaldo: R$ " + saldo;
    }
}