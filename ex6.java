package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 6 – Consumo de combustível
//Crie um programa que:
//1. Leia a distância percorrida (km)
//2. Leia o combustível gasto (litros)
//3. Calcule o consumo médio
public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distanciaKM = 0;
        int combustivelLT = 0;
        System.out.println("Qual foi a distância percorrida em KM? ");
        distanciaKM = sc.nextInt();
        System.out.println("Quantos litros de combustivel foram gastos? ");
        combustivelLT = sc.nextInt();
        int consumo = (distanciaKM / combustivelLT);
        System.out.println("O consumo de combustível foi de: " + consumo);
    }
}
