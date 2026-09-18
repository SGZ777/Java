package org.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, "Kentaro Miura");
        menuPrincipal(conta1);

    }

    public static void menuPrincipal(ContaBancaria conta1) {
        int opcao;
        do {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            " * * CAIXA ELETRÔNICO * * \n\n" +
                                    "1. Conta Bancária\n" +
                                    "2. Conta Corrente\n" +
                                    "3. Conta Poupança\n" +
                                    "0. Sair\n\n" +
                                    "Escolha uma opção: "
                    )
            );
            switch (opcao) {
                case 1: {
                    menuContaBancaria(conta1);
                    break;
                }
                case 2: {
                    menuContaCorrente();
                    break;
                }
                case 3: {
                    menuContaPoupanca();
                    break;
                }
                case 0: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Obrigado por usar os serviços do DB Bank."
                    );
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção Inválida!"
                    );
                }
            }
        } while (opcao != 0);
    }


    // ================= CONTA BANCÁRIA =================

    public static void menuContaBancaria(ContaBancaria conta1) {
        int menu2;
        double valor;
        do {
            menu2 = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            " * * MENU CONTA BANCÁRIA * *\n\n" +
                                    "1. Ver Saldo\n" +
                                    "2. Sacar\n" +
                                    "3. Depositar\n" +
                                    "0. Voltar ao menu anterior\n\n" +
                                    "Escolha a opção desejada: "
                    )
            );
            switch (menu2) {

                case 1: { // Ver saldo
                    JOptionPane.showMessageDialog(
                            null,
                            "Cliente: " + conta1.getTitular() + "\n" +
                                    "Número: " + conta1.getNumero() + "\n" +
                                    "Saldo: R$ " + conta1.getSaldo()
                    );
                    break;
                }
                case 2: { // Sacar
                    valor = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Digite valor a sacar: "
                            )
                    );
                    conta1.sacar(valor);
                    break;
                }
                case 3: { // Depositar
                    valor = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Digite valor a depositar: "
                            )
                    );
                    conta1.depositar(valor);
                    break;
                }
                case 0: { // Voltar
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção Inválida!"
                    );
                }
            }
        } while (menu2 != 0);
    }

    public static void menuContaPoupanca() {
        ContaPoupanca conta3 = new ContaPoupanca(1, "Daniel", 5);
        int opcao;
        double valor;
        do {

            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            " * * CONTA POUPANÇA * * \n\n" +
                                    "1. Consultar saldo\n" +
                                    "2. Sacar\n" +
                                    "3. Depositar\n" +
                                    "4. Aplicar Rendimento\n\n" +
                                    "0. Voltar ao menu anterior\n\n" +
                                    "Digite a opção desejada: "
                    )
            );

            switch (opcao) {

                case 1: { // Consultar saldo
                    JOptionPane.showMessageDialog(
                            null,
                            "Conta Número: " + conta3.getNumero() + "\n" +
                                    "Titular: " + conta3.getTitular() + "\n" +
                                    "Saldo R$: " + conta3.getSaldo()
                    );
                    break;
                }

                case 2: { // Sacar
                    valor = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Digite valor do saque: "
                            )
                    );
                    conta3.sacar(valor);
                    break;
                }

                case 3: { // Depositar

                    valor = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Digite valor do depósito: "
                            )
                    );
                    conta3.depositar(valor);
                    break;
                }

                case 4: { // Aplicar rendimento
                    conta3.aplicarRendimento();
                    break;
                }
                case 0: { // Voltar
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção Inválida!"
                    );
                }
            }

        } while (opcao != 0);
    }

    public static void menuContaCorrente() {
        ContaCorrente conta2 = new ContaCorrente("Medina", 2, 1000);
        int opcao;
        double valor;
        do {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            " * * CONTA CORRENTE * * \n\n" +
                                    "1. Consultar saldo\n" +
                                    "2. Sacar\n" +
                                    "3. Depositar\n" +
                                    "4. Consultar limite\n\n" +
                                    "0. Voltar ao menu anterior\n\n" +
                                    "Digite a opção desejada: "
                    )
            );

            switch (opcao) {
                case 1: { // Consultar saldo
                    JOptionPane.showMessageDialog(
                            null,
                            "Conta Número: " + conta2.getNumero() + "\n" +
                                    "Titular: " + conta2.getTitular() + "\n" +
                                    "Saldo R$: " + conta2.getSaldo()
                    );
                    break;
                }

                case 2: { // Sacar
                    valor = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Digite valor do saque: "
                            )
                    );
                    conta2.sacar(valor);
                    break;
                }

                case 3: { // Depositar
                    valor = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Digite valor do depósito: "
                            )
                    );
                    conta2.depositar(valor);
                    break;
                }

                case 4: { // Consultar limite
                    JOptionPane.showMessageDialog(
                            null,
                            "Conta Número: " + conta2.getNumero() + "\n" +
                                    "Titular: " + conta2.getTitular() + "\n" +
                                    "Saldo R$: " + conta2.getSaldo() + "\n" +
                                    "Limite R$: " + conta2.getLimite()
                    );
                    break;
                }
                case 0: { // Voltar

                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção Inválida!"
                    );
                }
            }

        } while (opcao != 0);
    }
}