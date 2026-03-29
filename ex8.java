package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 8 – Volume de uma caixa
//Crie um programa que:
//1. Leia comprimento, largura e altura
//2. Calcule o volume
public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double comprimento = 0;
        double largura = 0;
        double altura = 0;
        System.out.println("Digite o comprimento da caixa:");
        comprimento = sc.nextDouble();
        System.out.println("Digite a largura da caixa:");
        largura = sc.nextDouble();
        System.out.println("Digite a altura da caixa:");
        altura = sc.nextDouble();
        double volume = (comprimento * largura * altura);
        System.out.println("O volume da caixa é de: " + volume);
    }
}
