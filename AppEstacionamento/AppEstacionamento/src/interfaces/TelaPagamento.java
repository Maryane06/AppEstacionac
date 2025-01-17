/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author beatriz.lreis
 */
public class TelaPagamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaPagamento
     */
    public TelaPagamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ckDebito = new javax.swing.JCheckBox();
        ckCredito = new javax.swing.JCheckBox();
        ckDinheiro = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        ckPix = new javax.swing.JCheckBox();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(ckDebito);
        ckDebito.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ckDebito.setForeground(new java.awt.Color(255, 153, 0));
        ckDebito.setText("D�bito");
        ckDebito.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        ckDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckDebitoActionPerformed(evt);
            }
        });

        buttonGroup1.add(ckCredito);
        ckCredito.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ckCredito.setForeground(new java.awt.Color(255, 153, 0));
        ckCredito.setText("Cr�dito");
        ckCredito.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        buttonGroup1.add(ckDinheiro);
        ckDinheiro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ckDinheiro.setForeground(new java.awt.Color(255, 153, 0));
        ckDinheiro.setText("Dinheiro");
        ckDinheiro.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("ESCOLHA SUA FORMA DE PAGAMENTO:");

        buttonGroup1.add(ckPix);
        ckPix.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ckPix.setForeground(new java.awt.Color(255, 153, 0));
        ckPix.setText("PIX");

        btConfirmar.setBackground(new java.awt.Color(255, 153, 0));
        btConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btConfirmar.setText("CONFIRMAR");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckDebito)
                                    .addComponent(ckDinheiro))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckPix)
                                    .addComponent(ckCredito)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btConfirmar)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckDebito)
                    .addComponent(ckCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckDinheiro)
                    .addComponent(ckPix))
                .addGap(34, 34, 34)
                .addComponent(btConfirmar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckDebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckDebitoActionPerformed
    private void pagamento(){
        String texto ="";
        if(ckDebito.isSelected()){
            texto += "Debito\n";
        }
        if(ckCredito.isSelected()){
            texto += "Credito\n";
        }
        if(ckDinheiro.isSelected()){
            texto += "Dinheiro\n";
        }
        if(ckPix.isSelected()){
            texto += "Pix\n";
        }
        JOptionPane.showMessageDialog(null,"Pagamento Escolhido:\n" + texto);
    }
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        pagamento();
    }//GEN-LAST:event_btConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckCredito;
    private javax.swing.JCheckBox ckDebito;
    private javax.swing.JCheckBox ckDinheiro;
    private javax.swing.JCheckBox ckPix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
