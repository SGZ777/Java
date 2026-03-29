package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 10 – Antecessor e sucessor
//Crie um programa que:
//1. Leia um número inteiro
//2. Mostre o antecessor e o sucessor
public class ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        int sucessor = (numero + 1);
        int antecessor = (numero - 1);
        System.out.println("O número digitado foi " + numero + " , seu antecessor é "+ antecessor + " e seu sucessor é " + sucessor + ".");
    }
}
