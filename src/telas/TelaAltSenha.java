
package telas;

import connBD.ClasseSelects;
import java.awt.Color;
import javax.swing.JOptionPane;
import telas.classe.ClasseAltSenha;
import connBD.ClasseUpdates;

public class TelaAltSenha extends javax.swing.JDialog {

    ClasseAltSenha botoes = new ClasseAltSenha();
    ClasseUpdates update = new ClasseUpdates();
    ClasseSelects select = new ClasseSelects();
    
    public TelaAltSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnNovaSenha.setBackground(new Color(0,0,0,0)); //deixa o botão transparente
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNovaSenha2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblSenhaAntiga = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblSenhaNova = new javax.swing.JPasswordField();
        btnNovaSenha = new javax.swing.JButton();
        lblSenhaNova2 = new javax.swing.JPasswordField();
        txtCabecalho = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtSenhaAntiga = new javax.swing.JLabel();
        txtNovaSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TELA ALTERAÇÃO DE SENHA");

        txtNovaSenha2.setText("Digite novamente a nova senha :");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-academia-menor.png"))); // NOI18N

        btnNovaSenha.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnNovaSenha.setText("Nova senha");
        btnNovaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaSenhaActionPerformed(evt);
            }
        });

        txtCabecalho.setText("Alteração de senha");

        txtUsuario.setText("Usuario : ");

        txtSenhaAntiga.setText("Senha antiga : ");

        txtNovaSenha.setText("Nova senha :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNovaSenha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSenhaNova2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtUsuario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtSenhaAntiga)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNovaSenha)
                                .addGap(13, 13, 13)
                                .addComponent(lblSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnSalvar)
                .addGap(26, 26, 26)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaAntiga)
                    .addComponent(lblSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaSenha)
                    .addComponent(lblSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaSenha2)
                    .addComponent(lblSenhaNova2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovaSenha)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //seta usuario e senha na classe
        botoes.setUsuario(lblUsuario.getText());
        botoes.setSenhaAntiga(lblSenhaAntiga.getText());
        
        //se usuario e senha nao conferir nao altera
        if(select.selectTruthPass(botoes.getUsuario(), botoes.getSenhaAntiga())){
            botoes.setNovaSenha(lblSenhaNova.getText());
            botoes.setNovaSenhaVer(lblSenhaNova2.getText());
            //se a verificacao das 2 senhas nao estiverem corretas nao altera
            if(botoes.getNovaSenha() == null ? botoes.getNovaSenhaVer() == null : botoes.getNovaSenha().equals(botoes.getNovaSenhaVer())){
                update.updatePassword(botoes);
            }else{
                JOptionPane.showMessageDialog(null, "Novas senhas não conferem", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha antiga não confere", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Nova senha não foi salva com sucesso !", "Erro", JOptionPane.ERROR_MESSAGE);
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaSenhaActionPerformed
        botoes.novaSenha();
    }//GEN-LAST:event_btnNovaSenhaActionPerformed

    /*------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*---------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAltSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAltSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAltSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAltSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*-------------------------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAltSenha dialog = new TelaAltSenha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        }); 
    } -------------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovaSenha;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField lblSenhaAntiga;
    private javax.swing.JPasswordField lblSenhaNova;
    private javax.swing.JPasswordField lblSenhaNova2;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JLabel txtCabecalho;
    private javax.swing.JLabel txtNovaSenha;
    private javax.swing.JLabel txtNovaSenha2;
    private javax.swing.JLabel txtSenhaAntiga;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
