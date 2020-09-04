package exercicioCliente;

public class Cliente {
    private String nome, email;
    protected double credito;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.credito = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getCredito() {
        return credito;
    }

    public boolean fazerCompra(double valor) {

        if (valor > 0 && credito >= valor) {
            credito = credito - valor;
            return true;
        }
        return false;

    }

    public boolean quitarDivida(double valor){
        if (valor >0){
        credito = credito + valor;
        return true;
        }
        return false;
    }

    //toString vem da classe Object que é um extends implicito para toda classe
    @Override
    public String toString() {
        return nome + ": " + email + " credito: " + credito;
    }

}