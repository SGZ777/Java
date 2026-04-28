import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número para ver sua tabuada: ");
        numero = sc.nextInt();
        for(int i=1; i <= 10; i++){
            System.out.println(numero +"x"+ i+" = "+ numero * i);
        }
    }
}
