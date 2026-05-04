import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        double valorDeposito;
        double valorSaque;
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor do depósito: ");
                    valorDeposito = sc.nextDouble();

                    if (valorDeposito <= 0){
                        System.out.println("Valor inválido.");
                    } else {
                        saldo += valorDeposito;
                        System.out.println("Depósito efetuado com sucesso!");
                        System.out.println("Saldo: R$ " + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Valor do saque: ");
                    valorSaque = sc.nextDouble();

                    if (valorSaque <= 0){
                        System.out.println("Valor inválido.");
                    } else if (valorSaque > saldo){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Saldo: R$ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Operação encerrada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 4);
        sc.close();
    }
}
