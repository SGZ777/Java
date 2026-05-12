import javax.swing.JOptionPane;

public class mediaOptionPane {
    public static void main(String[] args) {
        String nome;
        String situacaoAluno;
        String alunoMaiorNota = "";
        double mediaGeral = 0;
        double somaMedias = 0;
        double n1;
        double n2;
        double maiorMedia = 0;
        int opcao = 0;
        int qtdAlunos = 0;

        while (opcao != 1){
            JOptionPane.showMessageDialog(null, "Calculo de média", "Calculo de média", JOptionPane.INFORMATION_MESSAGE);
            nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            n1 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
            n2 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
            double media = (n1 + n2) / 2;
            qtdAlunos++;
            somaMedias += media;
            mediaGeral = somaMedias / qtdAlunos;

            if (media > maiorNota){
                maiorMedia = media;
                alunoMaiorNota = nome;
            }
            if (media >= 50){
                situacaoAluno = "Aprovado";
            }
            else {
                situacaoAluno = "Reprovado";
            }
            JOptionPane.showMessageDialog(null,"Aluno: " + nome + "\nMédia: " + media + " - " + situacaoAluno);
            JOptionPane.showMessageDialog(null, "Média geral: " + mediaGeral + "\nMaior média: " + maiorMedia + " tirada por " + alunoMaiorNota);
            opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir mais alunos?", "Pergunta", JOptionPane.YES_NO_OPTION);
            switch (opcao){
                case 0:
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Até mais :)");
                    break;
            }
        }
    }
}
