package com.mycompany.mavenproject1;
import java.util.Scanner;

//Crie um programa que:
//1. Leia três notas (double)
//2. Leia três pesos (double)
//3. Calcule a média ponderada
//4. Exiba o resultado
public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        System.out.println("Digite a nota 1:");
        n1 = sc.nextDouble();
        System.out.println("Digite o peso 1:");
        p1 = sc.nextDouble();
        System.out.println("Digite a nota 2:");
        n2 = sc.nextDouble();
        System.out.println("Digite o peso 2:");
        p2 = sc.nextDouble();
        System.out.println("Digite a nota 3:");
        n3 = sc.nextDouble();
        System.out.println("Digite o peso 3:");
        p3 = sc.nextDouble();
        double media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
        System.out.println("Média ponderada: "+ media);
    }
}
