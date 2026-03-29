package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 4 – Conversão de idade
//Crie um programa que:
//1. Leia a idade em anos
//2. Converta para meses
//3. Exiba o resultado
public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idadeAnos = 0;
        int idadeMeses = 0;
        System.out.println("Quantos anos você tem?");
        idadeAnos = sc.nextInt();
        idadeMeses = idadeAnos * 12;
        System.out.println("Você já está vivo fazem " + idadeMeses + " meses :)");
    }
}
