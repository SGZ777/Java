import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double total = 0;
        int qtdItens = 0;
        boolean desconto = false;
        int pedido = 1;

        while (opcao != 5){
            System.out.println("\n MENU DA LANCHONETE .NET");
            System.out.println("1. Hamburguer - R$10,00");
            System.out.println("2. Mini Pizza - R$15,00");
            System.out.println("3. Refrigerante - R$5,00");
            System.out.println("4. Ver total");
            System.out.println("5. Novo Pedido");
            System.out.println("6. Sair");
            System.out.println("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Hamburguer adicionado ao pedido!");
                    qtdItens++;
                    total += 10;
                    break;
                case 2:
                    System.out.println("Mini pizza adicionado ao pedido!");
                    qtdItens++;
                    total += 15;
                    break;
                case 3:
                    System.out.println("Refrigerante adicionado ao pedido!");
                    qtdItens++;
                    total += 5;
                    break;
                case 4:
                    System.out.println("Pedido número: "+pedido);
                    if (total >= 30 && desconto == false){
                        System.out.println("Desconto de R$5,00 aplicado!");
                        total -= 5;
                        desconto = true;
                    }
                    System.out.println("=========== Total pedido: R$"+total+" ===========");
                    System.out.println("Quantidade de itens no pedido: "+qtdItens);
                    break;
                case 5:
                    pedido += 1;
                    total = 0;
                    qtdItens = 0;
                    desconto = false;
                    break;
                case 6:
                    System.out.println("Pedido encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
