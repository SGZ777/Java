package com.mycompany.mavenproject1;
import java.util.Scanner;

//Exercício 9 – Horas trabalhadas
//Crie um programa que:
//1. Leia horas trabalhadas
//2. Leia valor por hora
//3. Calcule o salário
public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int horasTrabalhadas = 0;
        double valorHora = 0;
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor em reais pago por hora trabalhada: ");
        valorHora = sc.nextDouble();
        double salario = (horasTrabalhadas * valorHora);
        System.out.println("O salário é de RS$" + salario);
    }
}
