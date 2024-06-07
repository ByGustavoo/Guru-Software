/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Old.TelaMateriaOld2;

/**
 *
 * @author gustavo
 */
public class TelaGradeCurricular extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialTeste
     */
    public TelaGradeCurricular() {
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

        PainelPrincipal = new javax.swing.JPanel();
        PainelTela = new javax.swing.JPanel();
        PainelRoxoParteCima = new javax.swing.JPanel();
        imagemLogoBrancaTelaInicial = new javax.swing.JLabel();
        subtituloEmpresaTelaInicial = new javax.swing.JLabel();
        botaoSairTelaInicial = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JLabel();
        textoNomeEmpresaTelaInicial1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaGradeCurricular = new javax.swing.JTable();
        textoNomeEmpresaTelaInicial = new javax.swing.JLabel();
        BotaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelTela.setBackground(new java.awt.Color(255, 255, 255));

        PainelRoxoParteCima.setBackground(new java.awt.Color(153, 51, 255));

        imagemLogoBrancaTelaInicial.setBackground(new java.awt.Color(255, 255, 255));
        imagemLogoBrancaTelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        imagemLogoBrancaTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagemLogoBranca.png"))); // NOI18N

        subtituloEmpresaTelaInicial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subtituloEmpresaTelaInicial.setForeground(new java.awt.Color(204, 204, 204));
        subtituloEmpresaTelaInicial.setText("Construindo pontes para o futuro digital");

        botaoSairTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImagemBotaoFechar.png"))); // NOI18N
        botaoSairTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSairTelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairTelaInicialMouseClicked(evt);
            }
        });

        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BotaoVoltarBranco.png"))); // NOI18N
        BotaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseClicked(evt);
            }
        });

        textoNomeEmpresaTelaInicial1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoNomeEmpresaTelaInicial1.setForeground(new java.awt.Color(255, 255, 255));
        textoNomeEmpresaTelaInicial1.setText("Cloud Minds Technologies");

        javax.swing.GroupLayout PainelRoxoParteCimaLayout = new javax.swing.GroupLayout(PainelRoxoParteCima);
        PainelRoxoParteCima.setLayout(PainelRoxoParteCimaLayout);
        PainelRoxoParteCimaLayout.setHorizontalGroup(
            PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoVoltar)
                .addGap(41, 41, 41)
                .addComponent(imagemLogoBrancaTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSairTelaInicial))
                    .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtituloEmpresaTelaInicial)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(textoNomeEmpresaTelaInicial1)
                    .addContainerGap(812, Short.MAX_VALUE)))
        );
        PainelRoxoParteCimaLayout.setVerticalGroup(
            PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                .addGroup(PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(imagemLogoBrancaTelaInicial))
                    .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoVoltar)
                            .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                                .addComponent(botaoSairTelaInicial)
                                .addGap(56, 56, 56)
                                .addComponent(subtituloEmpresaTelaInicial)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(PainelRoxoParteCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelRoxoParteCimaLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(textoNomeEmpresaTelaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        TabelaGradeCurricular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Curso", "Matéria", "Período", "Carga Horária", "Hora Início", "Hora Fim", "Semestre", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaGradeCurricular);
        if (TabelaGradeCurricular.getColumnModel().getColumnCount() > 0) {
            TabelaGradeCurricular.getColumnModel().getColumn(0).setMinWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(0).setPreferredWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(0).setMaxWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(8).setMinWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(8).setPreferredWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(8).setMaxWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(9).setMinWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(9).setPreferredWidth(80);
            TabelaGradeCurricular.getColumnModel().getColumn(9).setMaxWidth(80);
        }

        textoNomeEmpresaTelaInicial.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoNomeEmpresaTelaInicial.setForeground(new java.awt.Color(153, 51, 255));
        textoNomeEmpresaTelaInicial.setText("Grade Curricular");

        BotaoSalvar.setBackground(new java.awt.Color(153, 51, 255));
        BotaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoSalvar.setForeground(new java.awt.Color(153, 51, 255));
        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagemBotaoSalvar.png"))); // NOI18N
        BotaoSalvar.setText("Exportar");
        BotaoSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));
        BotaoSalvar.setContentAreaFilled(false);
        BotaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PainelTelaLayout = new javax.swing.GroupLayout(PainelTela);
        PainelTela.setLayout(PainelTelaLayout);
        PainelTelaLayout.setHorizontalGroup(
            PainelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelRoxoParteCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelTelaLayout.createSequentialGroup()
                .addGroup(PainelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelTelaLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelTelaLayout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(textoNomeEmpresaTelaInicial)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(541, 541, 541))
        );
        PainelTelaLayout.setVerticalGroup(
            PainelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTelaLayout.createSequentialGroup()
                .addComponent(PainelRoxoParteCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoNomeEmpresaTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        PainelPrincipal.add(PainelTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 670));

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

    private void botaoSairTelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairTelaInicialMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botaoSairTelaInicialMouseClicked

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

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
            java.util.logging.Logger.getLogger(TelaGradeCurricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGradeCurricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGradeCurricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGradeCurricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGradeCurricular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JLabel BotaoVoltar;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelRoxoParteCima;
    private javax.swing.JPanel PainelTela;
    private javax.swing.JTable TabelaGradeCurricular;
    private javax.swing.JLabel botaoSairTelaInicial;
    private javax.swing.JLabel imagemLogoBrancaTelaInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel subtituloEmpresaTelaInicial;
    private javax.swing.JLabel textoNomeEmpresaTelaInicial;
    private javax.swing.JLabel textoNomeEmpresaTelaInicial1;
    // End of variables declaration//GEN-END:variables
}