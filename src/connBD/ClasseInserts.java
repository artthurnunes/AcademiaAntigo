
package connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import telas.classe.ClasseCadAluno;
import telas.classe.ClasseNovaSenha;
import telas.classe.ClasseTeEquipamentos;

public class ClasseInserts {
    
    public void insertNewPass(ClasseNovaSenha dados){
        
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
    
    public void insertCadAluno(ClasseCadAluno dados){
        
        Connection con = ClasseConnectionBD.getConnection();
        PreparedStatement stmt = null;

        
        try{
            stmt = con.prepareStatement("INSERT INTO tb_cadalunos (nome,nascimento,sexo,estadoCivil,profissao,"
                    + "cpf,rg,rg_uf,telefone,endereco,numeroCasa,complemento,bairro,cidade,cep,endereco_uf,"
                    + "professor,bebe,fuma,treinou,pergunta1,pergunta2,pergunta3,checkHipertrofia,checkAero,"
                    + "checkNatacao,checkBox,checkZumba,checkDanca,checkBale,checkFisio,checkCross,checkIoga,"
                    + "checkTenis,checkBasquete,checkFuncional,checkIntenso,checkVolei,checkBallet) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, dados.getNome());
            stmt.setString(2, dados.getDataNascimento());
            stmt.setInt(3, dados.getSexo());
            stmt.setInt(4, dados.getEstadoCivil());
            stmt.setString(5, dados.getProfissao());
            stmt.setString(6,dados.getCpf());
            stmt.setString(7, dados.getRg());
            stmt.setInt(8, dados.getufRg());
            stmt.setString(9, dados.getTelefone());
            stmt.setString(10, dados.getEndereco());
            stmt.setString(11,dados.getEnderecoNumero());
            stmt.setString(12, dados.getEnderecoComplemento());
            stmt.setString(13, dados.getBairro());
            stmt.setString(14, dados.getCidade());
            stmt.setString(15, dados.getCep());
            stmt.setInt(16,dados.getEnderecoUf());
            stmt.setString(17, dados.getProfResposavel());
            stmt.setInt(18, dados.getBebe());
            stmt.setInt(19, dados.getFuma());
            stmt.setInt(20, dados.getTreinou());
            stmt.setString(21,dados.getPergunta1());
            stmt.setString(22, dados.getPergunta2());
            stmt.setString(23, dados.getPergunta3());
            stmt.setBoolean(24, dados.getCheckHipertrofia());
            stmt.setBoolean(25, dados.getCheckAero());
            stmt.setBoolean(26, dados.getCheckNatacao());
            stmt.setBoolean(27, dados.getCheckBox());
            stmt.setBoolean(28, dados.getCheckZumba());
            stmt.setBoolean(29, dados.getCheckDanca());
            stmt.setBoolean(30, dados.getCheckBale());
            stmt.setBoolean(31, dados.getCheckFisio());
            stmt.setBoolean(32, dados.getCheckCross());
            stmt.setBoolean(33, dados.getCheckIoga());
            stmt.setBoolean(34, dados.getCheckTenis());
            stmt.setBoolean(35, dados.getCheckBasquete());
            stmt.setBoolean(36, dados.getCheckFuncional());
            stmt.setBoolean(37, dados.getCheckIntenso());
            stmt.setBoolean(38, dados.getCheckVolei());
            stmt.setBoolean(39, dados.getCheckBallet()); 
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"SALVO COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ClasseConnectionBD.closeConnection(con, stmt);
        }        
    }
    
    public void insertEquipamentos(ClasseTeEquipamentos dados){
        
        Connection con = ClasseConnectionBD.getConnection();
        PreparedStatement stmt = null;

        
        try{
            stmt = con.prepareStatement("INSERT INTO tb_equipamentos (nome,data_compra,fornecedor,nf,valor,garantia,"
                    + "data_man,empresa_man,garantia_man,proxima_man,p_empresa_man) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, dados.getNome());
            stmt.setString(2, dados.getData_compra());
            stmt.setString(3, dados.getFornecedor());
            stmt.setString(4, dados.getNf());
            stmt.setString(5, dados.getValor());
            stmt.setString(6,dados.getGarantia());
            stmt.setString(7, dados.getData_man());
            stmt.setString(8, dados.getEmpresa_man());
            stmt.setString(9, dados.getGarantia_man());
            stmt.setString(10, dados.getProxima_man());
            stmt.setString(11,dados.getP_empresa_man());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"SALVO COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ClasseConnectionBD.closeConnection(con, stmt);
        }        
    }
}
