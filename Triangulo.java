import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l1,l2,l3 = 0;
        System.out.println("Medida do primeiro lado do triângulo: ");
        l1 = sc.nextInt();
        System.out.println("Medida do segundo lado do triângulo: ");
        l2 = sc.nextInt();
        System.out.println("Medida do terceiro lado do triângulo: ");
        l3 = sc.nextInt();

        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l2 > l1)){
            System.out.println("Forma um triângulo");
        }
        else {
            System.out.println("Não forma um triângulo");
        }
    }

}
