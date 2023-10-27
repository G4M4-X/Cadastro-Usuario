
package projetocadastro.DAO;

import projetocadastro.core.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import projetocadastro.conexao.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
     public void inserir(Usuario usuario){
        
             Connection conn;
        
        String sql = "INSERT INTO usuario (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";       
        PreparedStatement ps;
        
        try{
           ps = ConexaoBD.getConexao().prepareStatement(sql);
           ps.setString(1, usuario.getNome());
           ps.setString(2, usuario.getLogin());
           ps.setString(3, usuario.getSenha());
           ps.setString(4, usuario.getEmail());
           
           ps.execute();
           
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco");
        }
       
    }
}