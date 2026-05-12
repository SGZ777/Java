import javax.swing.JOptionPane;

public class mediaOptionPane {
    static void main(String[] args) {
        String nome;
        String situacaoAluno;
        double n1;
        double n2;
        int opcao = 0;

        while (opcao != 1){
        JOptionPane.showMessageDialog(null, "Calculo de média", "Calculo de média", JOptionPane.INFORMATION_MESSAGE);
            nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            n1 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
            n2 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
            double media = (n1 + n2) / 2;
            if (media >= 50){
                situacaoAluno = "Aprovado";
            }
            else {
                situacaoAluno = "Reprovado";
            }
            JOptionPane.showMessageDialog(null,"Aluno: " + nome + "\nMédia: " + media + " - " + situacaoAluno);
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
