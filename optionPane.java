import javax.swing.JOptionPane;

public class optionPane {
   public static void main(String[] args) {
      String nome;
       int idade;
       double altura;
       int opcao;
       nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
       idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade: "));
       altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura: "));
       JOptionPane.showMessageDialog(null, "Olá, " + nome + "!\n" + "Você tem " + idade + " anos.\n" + "Sua altura é " + altura + "cm.");

       JOptionPane.showMessageDialog(null, "Hoje está frio", "Informação", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
       JOptionPane.showMessageDialog(null, "Você está prestes a formatar seu computador!", "Aviso", JOptionPane.WARNING_MESSAGE);
       JOptionPane.showMessageDialog(null, "Deseja encerrar?", "Pergunta", JOptionPane.QUESTION_MESSAGE);

       opcao = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?");
       System.out.println(opcao);

       if (opcao == 0){
           JOptionPane.showMessageDialog(null, "Até logo.");
       }
       else if(opcao == 1){
           JOptionPane.showMessageDialog(null, ":)");
       }
    }
}
