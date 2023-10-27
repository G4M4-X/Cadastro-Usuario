
package projetocadastro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
public class ConexaoBD {
    private static final String url = "jdbc:mysql://localhost:3306/mapa";
    private static final String user = "root";
    private static final String password = "root";
    
    public static Connection conn;
    
    public static Connection getConexao(){
        try{
            if(conn == null){
               conn = DriverManager.getConnection(url, user, password);
               return conn;
            }else{
                return conn;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Houve um erro ao conectar no banco de dados");
            return null;
        }
    }
}
