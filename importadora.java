package com.mycompany.mavenproject1;
/*
 * @author Arthur
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ENTRADAS
        Scanner sc = new Scanner(System.in);
        String descricao = "";
        double precoEmDolar = 0;
        int quantidadeProduto = 0;
        double valorDolar = 5.24;
        double subtotalDolar = 0;
        double subtotalReais = 0;
        double valorEmReal = 0;
        System.out.println("Digite a descrição do produto: ");
        descricao = sc.nextLine();
        System.out.println("Digite o valor do produto em dólares: ");
        precoEmDolar = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a quantidade de produtos: ");
        quantidadeProduto = Integer.parseInt(sc.nextLine());
        //PROCESSAMENTO
        subtotalDolar = quantidadeProduto * precoEmDolar;
        valorEmReal = valorDolar * precoEmDolar;
        subtotalReais = quantidadeProduto * valorEmReal;
        //SAÍDAS
        System.out.println("Produto: " + descricao);
        System.out.println("Valor em US$: " + precoEmDolar);
        System.out.println("Valor em R$: " + valorEmReal);
        System.out.println("Subtotal em US$: " + subtotalDolar);
        System.out.println("Subtotal em R$: " + subtotalReais);
    }
}
