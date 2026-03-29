package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 1 – Soma de dois números
//Crie um programa que:
//1. Leia dois números inteiros
//2. Calcule a soma entre eles
//3. Exiba o resultado
public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Digite o primeiro valor: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("O resultado da equação " + n1 + " + "
        + n2 + " é igual a: " + soma + ".");
    }
}
