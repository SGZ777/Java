package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 7 – Conversão de moeda
//Crie um programa que:
//1. Leia um valor em reais
//2. Converta para dólares
//3. Exiba o resultado
public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorBRL = 0;
        double cotacaoDolar = 0.2;
        System.out.println("Digite o valor que deseja converter: ");
        valorBRL = sc.nextDouble();
        double conversao = valorBRL * cotacaoDolar;
        System.out.println("R$"+ valorBRL+ " equivale a US$" + conversao);
    }
}
