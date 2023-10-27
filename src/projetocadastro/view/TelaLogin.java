package projetocadastro.view;

import projetocadastro.core.entity.Usuario;
import projetocadastro.conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

     ConexaoBD conn = new ConexaoBD();
    
    public TelaLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LablelSenha1 = new javax.swing.JLabel();
        ButtonEntrar1 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        LabelLogin = new javax.swing.JLabel();
        LablelSenha = new javax.swing.JLabel();
        ButtonEntrar4 = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonEntrar2 = new javax.swing.JButton();
        LabelLogin1 = new javax.swing.JLabel();
        campoLogin1 = new javax.swing.JTextField();
        LablelSenha2 = new javax.swing.JLabel();
        campoSenha1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ButtonEntrar = new javax.swing.JButton();
        ButtonLogin1 = new javax.swing.JButton();

        LablelSenha1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LablelSenha1.setText("Senha:");

        ButtonEntrar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEntrar1.setText("Entrar");
        ButtonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrar1ActionPerformed(evt);
            }
        });

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Tela de Login");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });

        LabelLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelLogin.setText("Login:");

        LablelSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LablelSenha.setText("Senha:");

        ButtonEntrar4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEntrar4.setText("Entrar");
        ButtonEntrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrar4ActionPerformed(evt);
            }
        });

        ButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCadastrar.setText("Criar conta");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login de Usuário ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(ButtonEntrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelLogin)
                                    .addComponent(LablelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLogin)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LablelSenha))
                .addGap(50, 50, 50)
                .addComponent(ButtonEntrar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCadastrar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ButtonEntrar2.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEntrar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEntrar2.setText("Entrar");
        ButtonEntrar2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ButtonEntrar2.setContentAreaFilled(false);
        ButtonEntrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrar2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelLogin1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        LabelLogin1.setText("Login:");

        campoLogin1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEtchedBorder()));
        campoLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLogin1ActionPerformed(evt);
            }
        });

        LablelSenha2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        LablelSenha2.setText("Senha:");

        campoSenha1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEtchedBorder()));
        campoSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenha1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login de Usuário ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        ButtonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setBorder(null);
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });

        ButtonLogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonLogin1.setText("Criar conta");
        ButtonLogin1.setBorder(null);
        ButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelLogin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LablelSenha2)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSenha1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campoLogin1))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLogin1)
                    .addComponent(campoLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LablelSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(ButtonEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLogin1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLogin1ActionPerformed

    private void ButtonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEntrar1ActionPerformed

    private void ButtonEntrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEntrar2ActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoginActionPerformed

    private void ButtonEntrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrar4ActionPerformed

    }//GEN-LAST:event_ButtonEntrar4ActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        TelaCadastro cad = new TelaCadastro();
        cad.setVisible(true);
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
      
        String txtName;     
        
        try {
            
            String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
            
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.setString(1, campoLogin1.getText() );
            ps.setString(2, campoSenha1.getText() );
            
            ResultSet rs = ps.executeQuery();


            if(rs.next()){
                txtName = (rs.getString("nome"));
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(null, "Seja bem vindo, " + txtName + "!");
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido.");
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
       

    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void ButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogin1ActionPerformed
        TelaCadastro cad = new TelaCadastro();
        cad.setVisible(true);
    }//GEN-LAST:event_ButtonLogin1ActionPerformed

    private void campoSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenha1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JButton ButtonEntrar1;
    private javax.swing.JButton ButtonEntrar2;
    private javax.swing.JButton ButtonEntrar4;
    private javax.swing.JButton ButtonLogin1;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelLogin1;
    private javax.swing.JLabel LablelSenha;
    private javax.swing.JLabel LablelSenha1;
    private javax.swing.JLabel LablelSenha2;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoLogin1;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPasswordField campoSenha1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
