package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 5 – Salário com bônus
//Crie um programa que:
//1. Leia o salário de um funcionário
//2. Calcule um bônus de 10%
//3. Mostre o salário final
public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salarioFunc = 0;
        System.out.println("Digite o valor do seu salário: ");
        salarioFunc = sc.nextDouble();
        double salarioFinal = salarioFunc + (salarioFunc * 0.10);
        System.out.printf("O salário final com o bônus aplicado será de R$%.2f", salarioFinal);
    }
}
