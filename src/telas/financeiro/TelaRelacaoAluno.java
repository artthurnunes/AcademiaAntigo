
package telas.financeiro;

import connBD.ClasseConnectionBD;
import connBD.ClasseSelects;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class TelaRelacaoAluno extends javax.swing.JFrame { 

   
   public TelaRelacaoAluno(){
       initComponents();
       //chama o método preencher tabela com o parametro select
       preencherTabela("select * from tb_cadalunos where s_status = true order by nome");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        checkInativos = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTAlunos);

        jLabel1.setText("RELAÇÃO DE ALUNOS CADASTRADOS");

        checkInativos.setText("Ver alunos inativos");
        checkInativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInativosActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkInativos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(checkInativos)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkInativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInativosActionPerformed
        if(checkInativos.isSelected()){
            preencherTabela("select * from tb_cadalunos order by nome");
        }else{
            preencherTabela("select * from tb_cadalunos where s_status = true order by nome");
        }
        
        
                
    }//GEN-LAST:event_checkInativosActionPerformed

    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "NOME", "STATUS"};
        Connection con = ClasseConnectionBD.getConnection();
        ResultSet rs = new ClasseSelects().executaSql(Sql);
        //se funcionar tentar passar o status boolean

        try{
            rs.first();
            do{
                dados.add(new Object[]{rs.getInt("cod_aluno"),rs.getString("nome"),rs.getBoolean("s_status")});
            }while(rs.next());
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER O ARRAYLIST"+ex);
        }        
        
        ClassejTableSelect modelo = new ClassejTableSelect(dados, colunas);
        
        jTAlunos.setModel(modelo);
        jTAlunos.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTAlunos.getColumnModel().getColumn(0).setResizable(false);
        jTAlunos.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTAlunos.getColumnModel().getColumn(1).setResizable(false);
        jTAlunos.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTAlunos.getColumnModel().getColumn(2).setResizable(false);
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
    private javax.swing.JCheckBox checkInativos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlunos;
    // End of variables declaration//GEN-END:variables
}
