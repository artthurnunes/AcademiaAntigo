
package telas;

import telas.financeiro.*;
import connBD.ClasseConnectionBD;
import connBD.ClasseSelects;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import telas.classe.ClasseCarregarPesquisa;

public class TelaAjudaEscolhaAluno extends javax.swing.JFrame { 
   int[] codAluno_linha = new int[100]; //vetor para armazenar codigos de alunos com mesmo nome para listar
   int contador_linhas=0; //contagem de linhas da lista de contagem de nomes iguais
   int linha_selecionada=0;   
    
  
   public TelaAjudaEscolhaAluno(String pesquisa){
       initComponents();
       //chama o método preencher tabela com o parametro select
       //select sem os cadastros desativados
       preencherTabela("select * from tb_cadalunos where nome like '"+pesquisa+"%'and s_status != false");
   }
   
   public void selectLinhaSelecionada(int codigo) throws SQLException{
       //criando objeto load da Classe para setar os atributos na classe com o select
       ClasseCarregarPesquisa load = new ClasseCarregarPesquisa();
       //ja setando o atributo codigo da classe
       load.setCodigo(codigo);
       
       Connection con = ClasseConnectionBD.getConnection();
       Statement stmt = con.createStatement();
       
       String sql = "SELECT * FROM tb_cadalunos where cod_aluno = "+codigo+"";    
        
       ResultSet rs = stmt.executeQuery(sql);
              
       while(rs.next()){
           int status = rs.getInt("s_status");
                if(status == 1){
                    load.setStatus("ATIVO");
                }else{
                    load.setStatus("INATIVO");
                }         
           //o resultset ja retorna string mas não estava aparecendo
           //por isso a coversao de String novamente para forçar ser String
           load.setNome(String.valueOf(rs.getString(("nome"))));
           load.setNascimento(String.valueOf(rs.getString(("nascimento"))));
           load.setSexo(rs.getInt("sexo"));
           load.setEstadoCivil(rs.getInt("estadoCivil"));
           load.setProfissao(String.valueOf(rs.getString(("profissao"))));
           load.setCpf(String.valueOf(rs.getString(("cpf"))));
           load.setRg(String.valueOf(rs.getString(("rg"))));
           load.setRg_uf(rs.getInt(("rg_uf")));
           load.setTelefone(String.valueOf(rs.getString(("telefone"))));
           load.setEndereco(String.valueOf(rs.getString(("endereco"))));
           load.setNumeroCasa(String.valueOf(rs.getString("numeroCasa")));
           load.setComplemento(String.valueOf(rs.getString("complemento")));
           load.setBairro(String.valueOf(rs.getString("bairro")));
           load.setCidade(String.valueOf(rs.getString("cidade")));
           load.setCep(String.valueOf(rs.getString("cep")));
           load.setEndereco_uf(rs.getInt(("endereco_uf")));
           //sem forçar a conversão para testar
           load.setProfessor(rs.getString(("professor")));
           load.setBebe(rs.getInt(("bebe")));
           load.setFuma(rs.getInt(("fuma")));
           load.setTreinou(rs.getInt(("treinou")));
           load.setPergunta1(rs.getString("pergunta1"));
           load.setPergunta2(rs.getString("pergunta2"));
           load.setPergunta3(rs.getString("pergunta3"));
           load.setHipertrofia(rs.getBoolean("checkHipertrofia"));
           load.setAero(rs.getBoolean("checkAero"));
           load.setNatacao(rs.getBoolean("checkNatacao"));
           load.setBox(rs.getBoolean("checkBox"));
           load.setZumba(rs.getBoolean("checkZumba"));
           load.setDanca(rs.getBoolean("checkDanca"));
           load.setBale(rs.getBoolean("checkBale"));
           load.setFisio(rs.getBoolean("checkFisio"));
           load.setCross(rs.getBoolean("checkCross"));
           load.setIoga(rs.getBoolean("checkIoga"));
           load.setTenis(rs.getBoolean("checkTenis"));
           load.setBasquete(rs.getBoolean("checkBasquete"));
           load.setFuncional(rs.getBoolean("checkFuncional"));
           load.setIntenso(rs.getBoolean("checkIntenso"));
           load.setVolei(rs.getBoolean("checkVolei"));
           load.setBallet(rs.getBoolean("checkBallet"));
       }     
   }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("RELAÇÃO DE ALUNOS");

        jTAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTAlunos);

        jLabel1.setText("Existe mais de uma pessoa com este mesmo nome");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new TelaCadAluno().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int linha = jTAlunos.getSelectedRow();
        linha_selecionada = codAluno_linha[linha];        
        
       try {
           this.selectLinhaSelecionada(linha_selecionada);
       } catch (SQLException ex) {
           Logger.getLogger(TelaAjudaEscolhaAluno.class.getName()).log(Level.SEVERE, null, ex);
       }
        new TelaCadAluno().setVisible(true);
        this.dispose();             
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void jTAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlunosMouseClicked

    }//GEN-LAST:event_jTAlunosMouseClicked
   
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"CODIGO","NOME"};
        Connection con = ClasseConnectionBD.getConnection();
        ResultSet rs = new ClasseSelects().executaSql(Sql);        

        try{
            rs.first();
            do{
                dados.add(new Object[]{rs.getInt("cod_aluno"),rs.getString("nome")});
                codAluno_linha[contador_linhas] = rs.getInt("cod_aluno"); //armazena o codigo do aluno na linha especifica para seleção
                contador_linhas++;
            }while(rs.next());
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER O ARRAYLIST"+ex);
        }        
        
        ClassejTableSelect modelo = new ClassejTableSelect(dados, colunas);
        
        jTAlunos.setModel(modelo);
        jTAlunos.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTAlunos.getColumnModel().getColumn(0).setResizable(false);
        jTAlunos.getColumnModel().getColumn(1).setPreferredWidth(330);
        jTAlunos.getColumnModel().getColumn(1).setResizable(false);
        jTAlunos.getTableHeader().setReorderingAllowed(false);
        jTAlunos.setAutoResizeMode(jTAlunos.AUTO_RESIZE_OFF);
        jTAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
        

    }
    
    /*-------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*----------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*---------------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelacaoAluno().setVisible(true);
            }
        });
    }-------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlunos;
    // End of variables declaration//GEN-END:variables
}
