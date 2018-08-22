package telas;

import telas.classe.ClasseEscolhaCad;

public class TelaEscolhaCad extends javax.swing.JFrame {
    ClasseEscolhaCad botoes = new ClasseEscolhaCad();
    
    
    public TelaEscolhaCad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JLabel();
        lblAluno = new javax.swing.JButton();
        lblProfessor = new javax.swing.JButton();
        lblAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tela de escolha de cadastro");

        txt.setText("Qual cadastro desejado ?");

        lblAluno.setText("Aluno");
        lblAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAlunoActionPerformed(evt);
            }
        });

        lblProfessor.setText("Professor");
        lblProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblProfessorActionPerformed(evt);
            }
        });

        lblAdm.setText("Administrativo");
        lblAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAlunoActionPerformed
        botoes.botaoEscolha();
        this.dispose(); //new TelaEscolhaCad().setVisible(false);
    }//GEN-LAST:event_lblAlunoActionPerformed

    private void lblProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblProfessorActionPerformed
        botoes.botaoEscolha(1);
        this.dispose(); //new TelaEscolhaCad().setVisible(false);
    }//GEN-LAST:event_lblProfessorActionPerformed

    private void lblAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAdmActionPerformed
        botoes.botaoEscolha(" ");
        this.dispose(); //new TelaEscolhaCad().setVisible(false);
    }//GEN-LAST:event_lblAdmActionPerformed

    /*---------------TESTE SEM AS CLASSES PRINCIPAIS----------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*----------------------------------------------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    /*------------------------------------------------------------------------------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhaCad().setVisible(true);
            }
        });
    }
-------------------------TESTE SEM AS CLASSES PRINCIPAIS--------------------------------------------------------*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lblAdm;
    private javax.swing.JButton lblAluno;
    private javax.swing.JButton lblProfessor;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
