package org.example;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(double taxaRendimento) {
        super();
        this.taxaRendimento = taxaRendimento;
    }

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        double rendimento = getSaldo() * (this.taxaRendimento / 100);
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + "aplicado!");
    }
}
