package exprofconta2;

public abstract class Conta { //classe abstrata não permite gerar objeto a partir dela
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String exibir() {
        return numero + " : " + saldo;
    }

    //todas as classes precisam implementar o método depositas (determinar padrão)
    //public abstract boolean depositar(double valor);

    public boolean depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        }
        return false;
    } 

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}