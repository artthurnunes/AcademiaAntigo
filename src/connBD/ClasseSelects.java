
package connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ClasseSelects {
    
    Connection con = ClasseConnectionBD.getConnection();
    
    public boolean selectTruthPass(String login, String senha){
    
        con = ClasseConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM tb_senhas WHERE usuario = ? and senha = ?");
            stmt.setString(1,login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ClasseConnectionBD.closeConnection(con, stmt);
        }    
        
        return(check);
        
    }
    
     
    //metodo para retornar rs para exibir ArrayList
     public ResultSet executaSql(String sql){
         Statement stm = null;
         ResultSet rs = null;
         
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO AO EXECUTAR O SQL"+ex.getMessage());
       }
       
       return rs;
    }   
       
            
}
