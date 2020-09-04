package exprofconta;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double valor, limite;
/*      ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null; */
        Conta conta = null;
        ArrayList<Conta> listaDeContas = new ArrayList<>();

        do {
            System.out.println("1-Nova conta corrente");
            System.out.println("2-Nova conta poupança");
            System.out.println("3-Nova conta especial");
            System.out.println("4-Exibir o saldo");
            System.out.println("5-Fazer saque");
            System.out.println("6-Fazer um depósito");
            System.out.println("7-Sair");
            System.out.print("==> ");
            opcao = in.nextInt();

            switch (opcao) { //alernativa ao if/else
                case 1:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();
                    conta = new ContaCorrente(numeroConta);
                    listaDeContas.add(conta);
                    break;
                case 2:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();
                    conta = new ContaPoupanca(numeroConta);
                    listaDeContas.add(conta);
                    break;
                case 3:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();
                    conta = new ContaEspecial(numeroConta, 1000);
                    listaDeContas.add(conta);
                    break;
                case 4:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    for(int i = 0; i < listaDeContas.size(); i++){
                        conta = listaDeContas.get(i);
                        if(conta.getNumero() == numeroConta){
                            System.out.println("saldo: " + conta.getSaldo());
                            break;
                        }
                    }

                    break;
                case 5:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    for(int i = 0; i < listaDeContas.size(); i++){
                        conta = listaDeContas.get(i);
                        if(conta.getNumero() == numeroConta){
                            System.out.println("Informe o valor do saque:");
                            valor = in.nextDouble();
                            conta.sacar(valor); 
                            break;
                        }
                    }
       
                    break;
                case 6:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    for(int i = 0; i < listaDeContas.size(); i++){
                        conta = listaDeContas.get(i);
                        if(conta.getNumero() == numeroConta){
                            System.out.println("Informe o valor do depósito:");
                            valor = in.nextDouble();
                            conta.depositar(valor);
                            break;
                        }
                    }
                    break;
                case 7: 
                    break;
                default: //qualquer outra opção diferente das listadas acima
                    System.out.println("Opção inválida");
                    //break;
            }

        } while (opcao != 7);

        in.close();
    }
}