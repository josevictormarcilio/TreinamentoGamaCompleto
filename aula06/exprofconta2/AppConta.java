package exprofconta2;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double valor, limite;
        GerenciaContas gerenciaContas = new GerenciaContas();

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

            switch (opcao) { 
                case 1:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();
                    gerenciaContas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();
                    gerenciaContas.novaContaPoupanca(numeroConta);
                    break;

                case 3:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    System.out.println("Informe o valor do limite: ");
                    limite = in.nextDouble();

                    gerenciaContas.novaContaEspecial(numeroConta, limite);
                    break;

                case 4:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    if (gerenciaContas.isContaValida(numeroConta)) {

                        double saldo = gerenciaContas.getSaldo(numeroConta);

                        System.out.println("saldo: " + saldo);
                    } else {
                        System.out.println("Conta inexistente.");
                    }
                    
                    break;

                case 5:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    System.out.println("Informe o valor do saque:");
                    valor = in.nextDouble();

                    if (gerenciaContas.sacar(numeroConta, valor)) {
                        System.out.println("Saque efetuado com sucesso");
                    }else {
                        System.out.println("Falha ao efetuar o saque");
                    }
       
                    break;

                case 6:
                    System.out.println("Informe o numero da conta:");
                    numeroConta = in.nextInt();

                    System.out.println("Informe o valor do depósito:");
                    valor = in.nextDouble();

                    if (gerenciaContas.depositar(numeroConta, valor)) {
                        System.out.println("Depósito efetuado com sucesso.");
                    } else {
                        System.out.println("Falha ao efetuar o depósito.");
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