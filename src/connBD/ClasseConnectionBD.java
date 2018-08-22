/* onde parei
* Cadastrar mais alunos e equipamentos

---- pendencias não importantes para a apresentação FAZER DEPOIS PARA ESTUDO -------
* pensar em alguma coisa para parte de treinos avançados
* Fazer um cancelar na tela de escolha de cadastro
* Fazer parte para ativar aluno novamente
* criar um botão e um método para limpar todos os campos QUANDO JÁ ESTIVER PRONTO SE DER
* fazer as outras 2 abas de cadastro de aluno QUANDO JÁ ESTIVER PRONTO SE DER
* Tentar centralizar os campos da tabela de relação de nomes QUANDO JÁ ESTIVER PRONTO SE DER
* Melhorar a mensagem quando tentar inserir equipamento/aluno com mesmo nome QUANDO JÁ ESTIVER PRONTO SE DER
* Fazer metodos que pegam todos os campos para não repetir mais de uma vez Ex: no botão salvar e no alterar QUANDO JÁ ESTIVER PRONTO SE DER
* Fazer mais telas na parte financeira
*/
package connBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClasseConnectionBD {
    
    //globais
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/academia";
    private static final String USER = "root";
    private static final String PASS = "";
    //apagar se a tabela n'ao funcionar
    public ResultSet rs;
    
    
    //conecta no banco
    public static Connection getConnection(){
        
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex){
            throw new RuntimeException("ERRO NA CONEXAO: ",ex);
        }        
    }
    
    //fecha conexão
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ClasseConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    //fecha conexão
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ClasseConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //fecha conexão
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con,stmt);
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ClasseConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    /*------------ TESTE SEPARANDO NOS PACOTES MAIS ORGANIZADOS
    //insere dados no BD
    public void insereBD(ClasseNovaSenha dados){
        
        Connection con = ClasseConnectionBD.getConnection();
        PreparedStatement stmt = null;

        
        try{
            stmt = con.prepareStatement("INSERT INTO tb_senhas (nome,usuario,senha) VALUES (?,?,?)");
            stmt.setString(1,dados.getNome());
            stmt.setString(2, dados.getUsuario());
            stmt.setString(3, dados.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>SALVO COM SUCESSO !<br>Seu usuario já pode ser utilizado</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ClasseConnectionBD.closeConnection(con, stmt);
        }        
    }
    
  
    public void alteraBD(ClasseAltSenha dados){
        
        Connection con = ClasseConnectionBD.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE tb_senhas SET senha =(?) WHERE usuario =(?)");
            stmt.setString(1,dados.getNovaSenha());
            stmt.setString(2, dados.getUsuario());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>SALVO COM SUCESSO !<br>Sua senha foi alterada.</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ClasseConnectionBD.closeConnection(con, stmt);
        }  
    }  --------*/
    
       
}
