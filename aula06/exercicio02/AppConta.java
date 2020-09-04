package exercicio02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numConta;
        double valor, limite;
        // Conta cc = null;
        // ContaEspecial ce = null;
        // ContaPoupanca cp = null;
        Conta conta = null;
        ArrayList<Conta> listaContas = new ArrayList<>();

        do {

            System.out.println("1 - Nova conta corrente");
            System.out.println("2 - Nova conta especial");
            System.out.println("3 - Nova conta poupança");
            System.out.println("4 - Exibir saldo");
            System.out.println("5 - Fazer saque");
            System.out.println("6 - Fazer um depósito");
            System.out.println("7 - sair");
            System.out.println("==>");
            opcao = entrada.nextInt();

            switch (opcao) { // alternativa ao if/else
                case 1:
                    System.out.println("Informe o número da conta: ");
                    numConta = entrada.nextInt();
                    conta = new Conta(numConta);
                    listaContas.add(conta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta: ");
                    numConta = entrada.nextInt();
                    conta = new ContaEspecial(numConta, 1000);
                    listaContas.add(conta);
                    break;

                case 3:
                    System.out.println("Informe o número da conta: ");
                    numConta = entrada.nextInt();
                    conta = new ContaPoupanca(numConta);
                    listaContas.add(conta);
                    break;

                case 4:

                    System.out.println("Informe o número da conta: ");
                    numConta = entrada.nextInt();

                    for (int j = 0; j < listaContas.size(); j++) {
                        if (listaContas.get(j).getNumConta() == numConta) {
                            System.out.println("Saldo: " + conta.getSaldo());
                            break; // interrompe o laço (no caso o For)
                        } else {
                            System.out.println("Conta não encontrada :(");
                        }
                    }

                case 5:
                
                System.out.println("Informe o número da conta: ");
                numConta = entrada.nextInt();

                for (int j = 0; j < listaContas.size(); j++) {
                    if (listaContas.get(j).getNumConta() == numConta) {
                        System.out.println("Saldo: " + conta.getSaldo());
                        break; // interrompe o laço (no caso o For)
                    } else {
                        System.out.println("Conta não encontrada :(");
                    }
                }    
                
                System.out.println("Informe o valor do saque: ");
                    valor = entrada.nextDouble();
                    conta.sacar(valor);
                    break;

                case 6:
                    System.out.println("Informe o valor do depósito: ");
                    valor = entrada.nextDouble();
                    conta.depositar(valor);

                case 7:
                    break;
                default:// qualquer outra opção diferente das listadas acima
            }

        } while (opcao != 7);

        entrada.close();
    }
}