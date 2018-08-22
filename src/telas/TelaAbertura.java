
package telas;

import java.awt.Color;
import telas.classe.ClasseTeAbertura;

public class TelaAbertura extends javax.swing.JFrame {

    ClasseTeAbertura botoes = new ClasseTeAbertura();   
    
    
    public TelaAbertura() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); //para programa abrir em tela inteira
        btnAlteraSenha.setBackground(new Color(0,0,0,0)); //deixa o botão transparente 
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JLabel();
        lblSenha = new javax.swing.JPasswordField();
        btnConfirmaSenha = new javax.swing.JButton();
        btnCancelaSenha = new javax.swing.JButton();
        btnAlteraSenha = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TELA DE ABERTURA");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("USUÁRIO :");

        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setText("SENHA :");

        btnConfirmaSenha.setText("Confirma");
        btnConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaSenhaActionPerformed(evt);
            }
        });

        btnCancelaSenha.setText("Cancela");
        btnCancelaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaSenhaActionPerformed(evt);
            }
        });

        btnAlteraSenha.setBackground(new java.awt.Color(255, 255, 255));
        btnAlteraSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnAlteraSenha.setText("Alterar ou criar senha");
        btnAlteraSenha.setBorder(null);
        btnAlteraSenha.setBorderPainted(false);
        btnAlteraSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlteraSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmaSenha))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSenha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnCancelaSenha)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAlteraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmaSenha)
                    .addComponent(btnCancelaSenha))
                .addGap(18, 18, 18)
                .addComponent(btnAlteraSenha)
                .addContainerGap(546, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-academia.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(lblLogo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlteraSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraSenhaActionPerformed
        botoes.altSenha();      
        
    }//GEN-LAST:event_btnAlteraSenhaActionPerformed

    private void btnConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaSenhaActionPerformed
        botoes.setUsuario(lblUsuario.getText());
        botoes.setSenha(lblSenha.getText());
        //if para fechar a tela de senha caso senha esteja correta
        if(botoes.confSenha() == 1){
            this.dispose();
        }         
        lblUsuario.setText(""); //limpa o visor se estiver errado
        lblSenha.setText(""); //limpa o visto se estiver errado
        
    }//GEN-LAST:event_btnConfirmaSenhaActionPerformed

    private void btnCancelaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaSenhaActionPerformed
        botoes.cancelaFechaTela();
    }//GEN-LAST:event_btnCancelaSenhaActionPerformed
    /*-----------------------------------------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*-------------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    /*--------------------------------------------------------------------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAbertura().setVisible(true);
            }
        });
    }
   ----------------------------------------------------------------------------------------*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlteraSenha;
    private javax.swing.JButton btnCancelaSenha;
    private javax.swing.JButton btnConfirmaSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField lblSenha;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
