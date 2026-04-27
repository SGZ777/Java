import java.util.Scanner;

public class For {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade;
        int qtdMaior = 0, qtdMenores = 0;
        int somaIdades = 0;
        double media = 0;
        int qtdAlunos = 5;

        for (int i=1; i<=qtdAlunos; i++){
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            if (idade >= 18){
                System.out.println("Maior de idade");
                qtdMaior++;
            }
            else {
                System.out.println("Menor de idade");
                qtdMenores++;
            }
            somaIdades = somaIdades + idade;
            media = (somaIdades / qtdAlunos);
        }
        System.out.println("Quantidade de maiores de idade: " + qtdMaior);
        System.out.println("Quantidade de menores de idade: " + qtdMenores);
        System.out.println("Média: "+media);
    }
}
