package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 2 – Média simples
//Crie um programa que:
//1. Leia duas notas (double)
//2. Calcule a média
//3. Mostre o resultado
public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("A média desse aluno é: " + media + ".");
    }
}
