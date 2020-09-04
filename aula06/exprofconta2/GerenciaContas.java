package exprofconta2;

import java.util.ArrayList;

public class GerenciaContas {
    //local onde as contas são armazenadas
    private ArrayList<Conta> listaDeContas = new ArrayList<>();

    private void novaConta(Conta conta){
        listaDeContas.add(conta);
    }

    public void novaContaCorrente(int numeroConta){
        Conta conta;
        conta = new ContaCorrente(numeroConta);
        novaConta(conta);
    }

    public void novaContaEspecial(int numeroConta, double limite){
        Conta conta;
        conta = new ContaEspecial(numeroConta, limite);
        novaConta(conta);
    }

    public void novaContaPoupanca(int numeroConta){
        Conta conta;
        conta = new ContaPoupanca(numeroConta);
        novaConta(conta);
    }

    public boolean isContaValida(int numeroConta){
        Conta conta;
        for(int i = 0; i < listaDeContas.size(); i++){
            conta = listaDeContas.get(i);
            if(conta.getNumero() == numeroConta){
                return true;
            }
        }
        return false;
    }

    public double getSaldo (int numeroConta){
        Conta conta;
        for(int i = 0; i < listaDeContas.size(); i++){
            conta = listaDeContas.get(i);
            if(conta.getNumero() == numeroConta){
                return conta.getSaldo();
            }
        }
        return 0;
    }

    public boolean sacar (int numeroConta, double valor){
        Conta conta;

        for(int i = 0; i < listaDeContas.size(); i++){
            conta = listaDeContas.get(i);
            if(conta.getNumero() == numeroConta){
                return conta.sacar(valor); 
            }
        }
        return false;
    }

    public boolean depositar (int numeroConta, double valor){
        Conta conta;

        for(int i = 0; i < listaDeContas.size(); i++){
            conta = listaDeContas.get(i);
            if(conta.getNumero() == numeroConta){
                return conta.depositar(valor);
                
            }
        }
        return false;
    }

}