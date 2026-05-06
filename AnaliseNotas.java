import java.util.Scanner;

public class AnaliseNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int qtdAlunos, qtdAprovados = 0;
        System.out.println("Quantos alunos existem?");
        qtdAlunos = sc.nextInt();
        double[] notaAlunos = new double[qtdAlunos];
        double soma = 0;
        for (int i = 0; i < qtdAlunos; i++){
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notaAlunos[i] = sc.nextDouble();
            soma += notaAlunos[i];
            if (notaAlunos[i] >= 7){
                qtdAprovados++;
            }
        }
        double media = soma / qtdAlunos;
        double maior = notaAlunos[0];
        double menor = notaAlunos[0];
        for (int i = 1; i < qtdAlunos; i++) {
            if (notaAlunos[i] > maior) {
                maior = notaAlunos[i];
            }
            if (notaAlunos[i] < menor) {
                menor = notaAlunos[i];
            }
        }
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Quantidade de aprovados: " + qtdAprovados);
        sc.close();
    }
}