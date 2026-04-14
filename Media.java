import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media = 0;
        double frequencia = 0;
        int i;
        for(i = 1; i<=10; i++){
            System.out.println("Aluno numero: " + i);
            System.out.println("Digite a primeira nota:");
            n1 = sc.nextDouble();
            System.out.println("Digite a segunda nota:");
            n2 = sc.nextDouble();
            System.out.println("Digite a terceira nota:");
            n3 = sc.nextDouble();
            media = (n1+n2+n2) / 3;
            System.out.println("Digite a frequência:");
            frequencia = sc.nextDouble();

            if (media >= 50 && frequencia >= 75){
                System.out.println("Parabéns, vc está aprovado!\n");
            }
            else {
                System.out.println("Vc reprovou kkkkkkkkkk\n");
            }
        }

    }
}
