package exercicioCliente;

public class ClienteVip extends Cliente{
    double creditoEspecial;

    public ClienteVip (String nome, String email, double creditoEspecial){
        super(nome, email);
        this.creditoEspecial = creditoEspecial;
    }

    @Override
    public boolean fazerCompra(double valor){
        if (valor > 0 && getCredito() + creditoEspecial >= valor) {
            credito = credito - valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " crédito especial: " + creditoEspecial;
    }

}