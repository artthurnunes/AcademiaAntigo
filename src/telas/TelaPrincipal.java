package telas;

import static java.lang.System.exit;
import telas.classe.ClasseTePrincipal;



public class TelaPrincipal extends javax.swing.JFrame {
    ClasseTePrincipal botoes = new ClasseTePrincipal();
    
    
    public TelaPrincipal() {
        initComponents();
        btnCadAluno.setToolTipText("Cadastrar novo aluno"); //Exibe mensagem quando o mouse fica em cima
        btnVisitante.setToolTipText("Cadastrar novo visitante");
        btnEquipa.setToolTipText("Equipamentos");
        btnTreinos.setToolTipText("Treinos");
        btnFinan.setToolTipText("Financeiro");
        btnExit.setToolTipText("Sair");
        this.setExtendedState(MAXIMIZED_BOTH); //para programa abrir em tela inteira
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadAluno = new javax.swing.JButton();
        btnVisitante = new javax.swing.JButton();
        btnEquipa = new javax.swing.JButton();
        btnTreinos = new javax.swing.JButton();
        btnFinan = new javax.swing.JButton();
        btnFundo = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtCadastro = new javax.swing.JLabel();
        txtVisitante = new javax.swing.JLabel();
        txtEquipament = new javax.swing.JLabel();
        txtTreinos = new javax.swing.JLabel();
        txtFinanceiro = new javax.swing.JLabel();
        txtSair = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU DA ACADEMIA");

        btnCadAluno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunoteste.jpg"))); // NOI18N
        btnCadAluno.setToolTipText("");
        btnCadAluno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAlunoActionPerformed(evt);
            }
        });

        btnVisitante.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnVisitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visitante.jpg"))); // NOI18N
        btnVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitanteActionPerformed(evt);
            }
        });

        btnEquipa.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnEquipa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equipamentos.jpg"))); // NOI18N
        btnEquipa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipaActionPerformed(evt);
            }
        });

        btnTreinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alimentação-m.jpg"))); // NOI18N
        btnTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinosActionPerformed(evt);
            }
        });

        btnFinan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnFinan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/financeiro.jpg"))); // NOI18N
        btnFinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanActionPerformed(evt);
            }
        });

        btnFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-academia.png"))); // NOI18N
        btnFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair_menor.jpg"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtCadastro.setText("Cadastro/Pesquisa");

        txtVisitante.setText("Cadastro Visitante");

        txtEquipament.setText("Equipamentos");

        txtTreinos.setText("Treinos");

        txtFinanceiro.setText("Financeiro");

        txtSair.setText("Sair");

        txtMensagem.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        txtMensagem.setText("NO PAIN NO GAIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCadastro)
                            .addComponent(btnCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVisitante)
                            .addComponent(btnVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipament)
                            .addComponent(btnEquipa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTreinos)
                            .addComponent(btnTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFinanceiro)
                            .addComponent(btnFinan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSair)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtTreinos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                        .addComponent(txtVisitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEquipament, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(txtFinanceiro, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEquipa)
                                    .addComponent(btnVisitante)
                                    .addComponent(btnCadAluno)
                                    .addComponent(btnFinan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtMensagem)
                        .addGap(20, 20, 20)))
                .addComponent(btnFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAlunoActionPerformed
        botoes.botaoCadastro();
    }//GEN-LAST:event_btnCadAlunoActionPerformed

    private void btnVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitanteActionPerformed
        botoes.botaoCadastro("visitante");
    }//GEN-LAST:event_btnVisitanteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEquipaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipaActionPerformed
        botoes.botaoEquip();
    }//GEN-LAST:event_btnEquipaActionPerformed

    private void btnFinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanActionPerformed
        new TelaFinanceiro().setVisible(true);
    }//GEN-LAST:event_btnFinanActionPerformed

    private void btnTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinosActionPerformed
        botoes.botaoTreinos();
    }//GEN-LAST:event_btnTreinosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(false); //false para não abrir a tela principal
                TelaAbertura frame = new TelaAbertura();
                frame.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAluno;
    private javax.swing.JButton btnEquipa;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinan;
    private javax.swing.JButton btnFundo;
    private javax.swing.JButton btnTreinos;
    private javax.swing.JButton btnVisitante;
    private javax.swing.JLabel txtCadastro;
    private javax.swing.JLabel txtEquipament;
    private javax.swing.JLabel txtFinanceiro;
    private javax.swing.JLabel txtMensagem;
    private javax.swing.JLabel txtSair;
    private javax.swing.JLabel txtTreinos;
    private javax.swing.JLabel txtVisitante;
    // End of variables declaration//GEN-END:variables
}
