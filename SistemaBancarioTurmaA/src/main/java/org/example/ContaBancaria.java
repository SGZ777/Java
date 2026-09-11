package org.example;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public ContaBancaria() {
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado.\nR$" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de deposito inválido.");
        } else {
            this.saldo += valor;
            System.out.println("Deposito realizado.\nR$" + valor);
        }
    }

    public void mostrarInformacoes(){
        System.out.println("Conta número: " + this.getNumero());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
}