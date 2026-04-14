import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int i;
        for(i = 1; i <= 5; i++){
            System.out.println("Número " + i);
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0){
                System.out.println("O número é par.\n");
            }
            else {
                System.out.println("O número é impar.\n");
            }
        }
    }
}
