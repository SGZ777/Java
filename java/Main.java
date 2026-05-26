import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = Conexao.conectar();
        int opcao = 0;

        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conectado!");
            while(opcao != 3){
                String menu = """
                        SISTEMA DE CADASTRO
                       1. Cadastrar usuários
                       2. Listar usuários
                       3. Sair
                       Digite uma opção:
                        """;
                String entrada = JOptionPane.showInputDialog(menu);
                opcao = Integer.parseInt(entrada);
                switch (opcao){
                    case 1:
                        cadastrarUsuarios();
                        break;
                    case 2:
                        listarUsuarios();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Até logo");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Erro na conexão!");
        }
    }
    public static void cadastrarUsuarios() throws SQLException {
        Connection conn = Conexao.conectar();
        JOptionPane.showMessageDialog(null, "Cadastrar usuários");
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String senha = JOptionPane.showInputDialog("Digite a senha: ");
        String sql = "INSERT INTO usuario (nome,senha) VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, senha);
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
        conn.close();
    }

    public static void listarUsuarios() throws SQLException {
        Connection conn = Conexao.conectar();
        JOptionPane.showMessageDialog(null, "Listar usuários");
        //SELECT DOS USUÁRIOS
        String sqlSelect = "SELECT * FROM usuario";
        PreparedStatement stmtSelect = conn.prepareStatement(sqlSelect);
        ResultSet rs = stmtSelect.executeQuery();
        String lista = "Usuários Cadastrados\n\n";
        while (rs.next()){
            lista+="ID: "+rs.getInt("id")
                    +"\nNome: "+rs.getString("nome")
                    +"\nSenha: "+rs.getString("senha")
                    +"\n\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
