import java.util.Scanner;

public class exAcademia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nomeAluno;
        String tipoPlano;
        double mensalidadePlano = 0;
        int mesesContrato = 0;

        System.out.println("Nome do aluno:");
        nomeAluno = sc.nextLine();
        System.out.println("Plano contratado:");
        tipoPlano = sc.nextLine();
        System.out.println("Valor da mensalidade em RS$:");
        mensalidadePlano = sc.nextDouble();
        System.out.println("Duração de contrato:");
        mesesContrato = sc.nextInt();

        double valorTotal = (mensalidadePlano * mesesContrato);
        double desconto = (valorTotal * 0.05);
        double taxaAdm = (valorTotal * 0.02);
        double valorFinal = (valorTotal - desconto + taxaAdm);

        System.out.println("Aluno: "+ nomeAluno);
        System.out.println("Plano: "+ tipoPlano);
        System.out.println("Valor da mensalidade: R$"+ mensalidadePlano);
        System.out.println("Valor total: R$"+ valorTotal);
        System.out.println("Desconto(5%): "+ desconto);
        System.out.println("Taxa administrativa(2%): "+ taxaAdm);
        System.out.println("Valor final: R$"+ valorFinal);
    }
}
