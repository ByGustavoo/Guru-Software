/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginTeste
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        PainelPrincipal = new javax.swing.JPanel();
        PainelEsquerda = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ImagemLogoTelaLogin = new javax.swing.JLabel();
        TituloTelaLogin = new javax.swing.JLabel();
        ImagemBotaoSairTelaLogin = new javax.swing.JLabel();
        SubTituloTelaLogin = new javax.swing.JLabel();
        SegundoSubTituloTelaLogin = new javax.swing.JLabel();
        ImagemTresBotoesTelaLogin = new javax.swing.JLabel();
        PainelDireita = new javax.swing.JPanel();
        TextoEsquerdaTelaLogin = new javax.swing.JLabel();
        TextoTelaLogin = new javax.swing.JLabel();
        CampoUsuarioTelaLogin = new javax.swing.JTextField();
        TextoUsuarioTelaLogin = new javax.swing.JLabel();
        TextoSenhaTelaLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        CampoSenhaTelaLogin = new javax.swing.JPasswordField();
        BotaoEntrarTelaLogin = new javax.swing.JButton();
        BotaoRoboTelaLogin = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 525));

        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelEsquerda.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        ImagemLogoTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImagemLogoTelaLogin.png"))); // NOI18N

        TituloTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TituloTelaLogin.setForeground(new java.awt.Color(153, 153, 153));
        TituloTelaLogin.setText("Unindo mestres, o portal do saber!");

        ImagemBotaoSairTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImagemBotaoFecharTelaLogin.png"))); // NOI18N
        ImagemBotaoSairTelaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImagemBotaoSairTelaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagemBotaoSairTelaLoginMouseClicked(evt);
            }
        });

        SubTituloTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SubTituloTelaLogin.setForeground(new java.awt.Color(153, 153, 153));
        SubTituloTelaLogin.setText("Conectando mentes brilhantes ao mundo do ensino, ");

        SegundoSubTituloTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SegundoSubTituloTelaLogin.setForeground(new java.awt.Color(153, 153, 153));
        SegundoSubTituloTelaLogin.setText("sua jornada começa com um clique!!");

        ImagemTresBotoesTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImagemTresBotaoTelaLogin.png"))); // NOI18N

        javax.swing.GroupLayout PainelEsquerdaLayout = new javax.swing.GroupLayout(PainelEsquerda);
        PainelEsquerda.setLayout(PainelEsquerdaLayout);
        PainelEsquerdaLayout.setHorizontalGroup(
            PainelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEsquerdaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagemBotaoSairTelaLogin)
                .addGap(72, 72, 72))
            .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                        .addComponent(SubTituloTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addGap(61, 61, 61))))
            .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                .addGroup(PainelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(SegundoSubTituloTelaLogin))
                    .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(ImagemTresBotoesTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PainelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEsquerdaLayout.createSequentialGroup()
                                .addComponent(ImagemLogoTelaLogin)
                                .addGap(105, 105, 105))
                            .addComponent(TituloTelaLogin))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelEsquerdaLayout.setVerticalGroup(
            PainelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEsquerdaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ImagemBotaoSairTelaLogin)
                .addGap(78, 78, 78)
                .addComponent(ImagemLogoTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloTelaLogin)
                .addGap(41, 41, 41)
                .addComponent(SubTituloTelaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SegundoSubTituloTelaLogin)
                .addGap(86, 86, 86)
                .addComponent(ImagemTresBotoesTelaLogin)
                .addGap(491, 491, 491)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelPrincipal.add(PainelEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 460, 540));

        PainelDireita.setBackground(new java.awt.Color(153, 51, 255));

        TextoEsquerdaTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoEsquerdaTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextoEsquerdaTelaLogin.setText("Conectando educadores ao poder do ensino");

        TextoTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextoTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextoTelaLogin.setText("Entre com os seus dados");

        CampoUsuarioTelaLogin.setBackground(new java.awt.Color(153, 51, 255));
        CampoUsuarioTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoUsuarioTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        CampoUsuarioTelaLogin.setBorder(null);

        TextoUsuarioTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextoUsuarioTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextoUsuarioTelaLogin.setText("Usuário");

        TextoSenhaTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextoSenhaTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextoSenhaTelaLogin.setText("Senha");

        CampoSenhaTelaLogin.setBackground(new java.awt.Color(153, 51, 255));
        CampoSenhaTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CampoSenhaTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        CampoSenhaTelaLogin.setBorder(null);

        BotaoEntrarTelaLogin.setBackground(new java.awt.Color(153, 51, 255));
        BotaoEntrarTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoEntrarTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrarTelaLogin.setText("Entrar");
        BotaoEntrarTelaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotaoEntrarTelaLogin.setContentAreaFilled(false);
        BotaoEntrarTelaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoEntrarTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarTelaLoginActionPerformed(evt);
            }
        });

        BotaoRoboTelaLogin.setBackground(new java.awt.Color(153, 51, 255));
        BotaoRoboTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotaoRoboTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        BotaoRoboTelaLogin.setText("Eu não sou um robô");

        javax.swing.GroupLayout PainelDireitaLayout = new javax.swing.GroupLayout(PainelDireita);
        PainelDireita.setLayout(PainelDireitaLayout);
        PainelDireitaLayout.setHorizontalGroup(
            PainelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDireitaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PainelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoRoboTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CampoSenhaTelaLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CampoUsuarioTelaLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextoTelaLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextoUsuarioTelaLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextoSenhaTelaLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3)
                        .addComponent(BotaoEntrarTelaLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TextoEsquerdaTelaLogin))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        PainelDireitaLayout.setVerticalGroup(
            PainelDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDireitaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(TextoEsquerdaTelaLogin)
                .addGap(18, 18, 18)
                .addComponent(TextoTelaLogin)
                .addGap(32, 32, 32)
                .addComponent(TextoUsuarioTelaLogin)
                .addGap(18, 18, 18)
                .addComponent(CampoUsuarioTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(TextoSenhaTelaLogin)
                .addGap(19, 19, 19)
                .addComponent(CampoSenhaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BotaoRoboTelaLogin)
                .addGap(47, 47, 47)
                .addComponent(BotaoEntrarTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        PainelPrincipal.add(PainelDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagemBotaoSairTelaLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagemBotaoSairTelaLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ImagemBotaoSairTelaLoginMouseClicked

    private void BotaoEntrarTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarTelaLoginActionPerformed
        if (CampoUsuarioTelaLogin.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite seu usuário!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else if (String.valueOf(CampoSenhaTelaLogin.getPassword()).equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite sua senha!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else if (!BotaoRoboTelaLogin.isSelected()) {
            JOptionPane.showMessageDialog(null, "Por favor, confirme que você não é um robô!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
            new TelaInicial().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BotaoEntrarTelaLoginActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrarTelaLogin;
    private javax.swing.JCheckBox BotaoRoboTelaLogin;
    private javax.swing.JPasswordField CampoSenhaTelaLogin;
    private javax.swing.JTextField CampoUsuarioTelaLogin;
    private javax.swing.JLabel ImagemBotaoSairTelaLogin;
    private javax.swing.JLabel ImagemLogoTelaLogin;
    private javax.swing.JLabel ImagemTresBotoesTelaLogin;
    private javax.swing.JPanel PainelDireita;
    private javax.swing.JPanel PainelEsquerda;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JLabel SegundoSubTituloTelaLogin;
    private javax.swing.JLabel SubTituloTelaLogin;
    private javax.swing.JLabel TextoEsquerdaTelaLogin;
    private javax.swing.JLabel TextoSenhaTelaLogin;
    private javax.swing.JLabel TextoTelaLogin;
    private javax.swing.JLabel TextoUsuarioTelaLogin;
    private javax.swing.JLabel TituloTelaLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
