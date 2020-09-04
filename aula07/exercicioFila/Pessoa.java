package exercicioFila;

public class Pessoa {
    public static final int VIP = 0;
    public static final int NORMAL = 1;

    private String nome, senha;
    private int prioridade;

    public Pessoa(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
        selecionaPrioridade();
    }

    private void selecionaPrioridade(){
        if(senha.charAt(0) == 'P'){
            this.prioridade = VIP;
        }else{
            this.prioridade = NORMAL;
        }
    }

    public String getSenha(){
        return senha;
    }

    public int getPrioridade(){
        return prioridade;
    }

    public String getDados(){
        return nome + " : " + ( (prioridade == VIP)? "VIP" : "NORMAL" );
    }
}