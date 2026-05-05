import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        int somaTotal = 0;
        int qtdNumeros = 0;

        do{
            System.out.println("Digite um número: ");
            numeros = sc.nextInt();
            somaTotal += numeros;
            if (numeros != 0){
                qtdNumeros++;
            }
        }
        while(numeros != 0);

        double media = (somaTotal/qtdNumeros);
        System.out.println("\nSoma total: "+somaTotal);
        System.out.println("Média: "+media);
    }
}
