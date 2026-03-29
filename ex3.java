package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 3 – Área de um retângulo
//Crie um programa que:
//1. Leia largura e altura
//2. Calcule a área
//3. Exiba o resultado
public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double altura = 0;
        double largura = 0;
        System.out.println("Digite a altura do retângulo: ");
        altura = sc.nextDouble();
        System.out.println("Digite a largura do retângulo: ");
        largura = sc.nextDouble();
        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area + ".");
    }
}
