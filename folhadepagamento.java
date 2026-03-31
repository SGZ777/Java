import java.util.Scanner;

public class folhadepagamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nomeFunc;
        double horasTrabalhadas = 0;
        double valorHora = 0;
        double valorComissoes = 0;
        double salarioBase = 0, DSR = 0, totalProventos = 0;
        double INSS = 0, IR = 0, VT = 0, totalDescontos = 0;
        double salarioLiquido = 0;

        System.out.println("Nome do funcionario: ");
        nomeFunc = sc.nextLine();
        System.out.println("Horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Valor da hora trabalhada em R$: ");
        valorHora = sc.nextDouble();
        System.out.println("Valor de comissôes em R$: ");
        valorComissoes = sc.nextDouble();

        salarioBase = (horasTrabalhadas * valorHora);
        DSR = (salarioBase * 0.10);
        totalProventos = (salarioBase + DSR + valorComissoes);
        INSS = (salarioBase * 0.08);
        IR = (salarioBase * 0.05);
        VT = (salarioBase * 0.06);
        totalDescontos = (INSS + IR + VT);
        salarioLiquido = (totalProventos - totalDescontos);

        System.out.println("\n================================");
        System.out.println("Funcionário: " + nomeFunc);
        System.out.println("================================");
        System.out.printf("Salário base: %.2f\n", salarioBase);
        System.out.printf("DSR (10%%): %.2f\n", DSR);
        System.out.printf("Comissões: %.2f\n", valorComissoes);
        System.out.printf("\nTotal de proventos: %.2f\n", totalProventos);
        System.out.printf("\nINSS (8%%): %.2f\n", INSS);
        System.out.printf("IR (5%%): %.2f\n", IR);
        System.out.printf("Vale transporte (6%%): %.2f\n", VT);
        System.out.printf("\nTotal de descontos: %.2f\n", totalDescontos);
        System.out.printf("\nSalário líquido: %.2f\n", salarioLiquido);
    }
}
