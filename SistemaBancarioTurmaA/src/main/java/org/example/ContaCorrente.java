package org.example;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(String titular, int numero, double limite){
        super(numero, titular);
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor de saque inválido!");
        }
        else {
            if (valor <= getSaldo() + limite){
                double tempSaldo = getSaldo();
                if (valor <= tempSaldo){
                    super.sacar(valor);
                }
                else{
                    double valorLimite = valor - tempSaldo;
                    super.sacar(tempSaldo);
                    limite -= valorLimite;
                    System.out.println("Saque realizado utilizando limite!");
                }
            }
            else{
                System.out.println("Saque não realizado! Saldo + limte insuficientes");
            }
        }
    }
}
