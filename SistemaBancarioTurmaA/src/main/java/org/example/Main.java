package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {

        int opcao;

        do {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "----------------- BANCO MASTER -----------------\n\n" +
                                    "1. Conta Bancária\n" +
                                    "2. Conta Corrente\n" +
                                    "3. Conta Poupança\n" +
                                    "4. Sair\n\n" +
                                    "Digite a opção desejada:"
                    )
            );

            switch (opcao) {
                case 1: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Menu conta bancária"
                    );
                    menuContaBancaria();
                    break;
                }

                case 2: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Menu conta corrente"
                    );
                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Menu conta poupança"
                    );
                    break;
                }

                case 4: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Até logo!"
                    );
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida"
                    );
                }
            }

        } while (opcao != 4);
    }

    public static void menuContaBancaria(){
        ContaBancaria conta1 = new ContaBancaria(1, "Daniel Vorcaro");

        int opcao;
        double valor;

        do {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "----------------- BANCO MASTER -----------------\n\n" +
                                    "1. Consultar Saldo\n" +
                                    "2. Depositar\n" +
                                    "3. Sacar\n" +
                                    "4. Voltar\n\n" +
                                    "Digite a opção desejada:"
                    )
            );

            switch (opcao) {
                case 1: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Saldo: R$" + conta1.getSaldo()
                    );
                    break;
                }

                case 2: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Depositar"
                    );
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser depositado?"));
                    conta1.depositar(valor);
                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Sacar"
                    );
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser depositado?"));
                    conta1.sacar(valor);
                    break;
                }

                case 4: {
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida"
                    );
                }
            }

        } while (opcao != 4);
    }
}
