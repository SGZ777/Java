import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("1. Agendar Exames");
            System.out.println("2. Re-agendar Exames");
            System.out.println("3. Cancelar Exames");
            System.out.println("4. Resultados de Exames");
            System.out.println("5. Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Exame Agendado com sucesso!");
                    break;
                case 2:
                    System.out.println("Exame re-agendado com sucesso!");
                    break;
                case 3:
                    System.out.println("Exame cancelado!");
                    break;
                case 4:
                    System.out.println("Exame de sangue: bom");
                    break;
                case 5:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        while (opcao !=5);
    }
}
