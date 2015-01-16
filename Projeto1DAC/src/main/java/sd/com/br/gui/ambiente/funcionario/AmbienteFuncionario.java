/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.gui.ambiente.funcionario;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import sd.com.br.beans.Cidade;
import sd.com.br.beans.Funcionario;
import sd.com.br.dao.DaoCidade;
import sd.com.br.gui.Inicio;

/**
 *
 * @author SergioD
 */
public class AmbienteFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form AmbienteFuncionario
     */
    private Cidade cidade;
    private Funcionario funcionario;
    
    public AmbienteFuncionario(Funcionario funcionario, Cidade cidade) {
        this.funcionario = funcionario;
        this.cidade = cidade;
        initComponents();
        iniciarBotoes();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void iniciarBotoes(){
        
        Icon iconAcompanhar = new ImageIcon("src/main/java/sd/com/br/gui/img/acompanharDenuncia.jpg");
        Icon iconAtualizar = new ImageIcon("src/main/java/sd/com/br/gui/img/atualizarDenuncia.jpg");
        Icon iconDenunciar = new ImageIcon("src/main/java/sd/com/br/gui/img/denunciarDenuncia.jpg");
        Icon iconSair = new ImageIcon("src/main/java/sd/com/br/gui/img/sair.jpg");
        Icon iconConfig = new ImageIcon("src/main/java/sd/com/br/gui/img/configuracoes.jpg");
        
        
        jBAcompanharDenuncias.setIcon(iconAcompanhar);
        jBAtualizarSituacao.setIcon(iconAtualizar);
        jBDenunciarDenuncia.setIcon(iconDenunciar);
        jBConfigurar.setIcon(iconConfig);
        jBSair.setIcon(iconSair); 
        
    }
    
    public void atualizarCidade(){
        DaoCidade dc = new DaoCidade();
        cidade = dc.atualizarObjCidade(cidade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPAreaMenu = new javax.swing.JPanel();
        jBAcompanharDenuncias = new javax.swing.JButton();
        jBAtualizarSituacao = new javax.swing.JButton();
        jBDenunciarDenuncia = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBConfigurar = new javax.swing.JButton();
        jPareaTroca = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPAreaMenu.setBackground(new java.awt.Color(255, 255, 255));

        jBAcompanharDenuncias.setToolTipText("Acompanhar Denuncias");
        jBAcompanharDenuncias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAcompanharDenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcompanharDenunciasActionPerformed(evt);
            }
        });

        jBAtualizarSituacao.setToolTipText("Atualizar Estado da Denuncia");
        jBAtualizarSituacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAtualizarSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarSituacaoActionPerformed(evt);
            }
        });

        jBDenunciarDenuncia.setToolTipText("Denuncia Conteudo Improprio em Denuncia");
        jBDenunciarDenuncia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDenunciarDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDenunciarDenunciaActionPerformed(evt);
            }
        });

        jBSair.setToolTipText("Sair");
        jBSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBConfigurar.setToolTipText("Denuncia Conteudo Improprio em Denuncia");
        jBConfigurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfigurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAreaMenuLayout = new javax.swing.GroupLayout(jPAreaMenu);
        jPAreaMenu.setLayout(jPAreaMenuLayout);
        jPAreaMenuLayout.setHorizontalGroup(
            jPAreaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAreaMenuLayout.createSequentialGroup()
                .addComponent(jBAcompanharDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAtualizarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBDenunciarDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPAreaMenuLayout.setVerticalGroup(
            jPAreaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBAcompanharDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBAtualizarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBDenunciarDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPareaTroca.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPareaTrocaLayout = new javax.swing.GroupLayout(jPareaTroca);
        jPareaTroca.setLayout(jPareaTrocaLayout);
        jPareaTrocaLayout.setHorizontalGroup(
            jPareaTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPareaTrocaLayout.setVerticalGroup(
            jPareaTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAreaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPareaTroca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPAreaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPareaTroca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jBAcompanharDenunciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcompanharDenunciasActionPerformed
        // TODO add your handling code here:
        atualizarCidade();
        jPareaTroca.removeAll();
        AcompanharDenuncia ad = new AcompanharDenuncia(cidade);
        ad.setVisible(true);
        ad.setBounds(0,0,1366,600);
        jPareaTroca.add(ad);
        revalidate();
        repaint();

    }//GEN-LAST:event_jBAcompanharDenunciasActionPerformed

    private void jBAtualizarSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarSituacaoActionPerformed
        // TODO add your handling code here:
        
        jPareaTroca.removeAll();
        AtualizarDenuncia ad = new AtualizarDenuncia(cidade);
        ad.setVisible(true);
        ad.setBounds(0,0,1366,600);
        jPareaTroca.add(ad);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_jBAtualizarSituacaoActionPerformed

    private void jBDenunciarDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDenunciarDenunciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDenunciarDenunciaActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Inicio().setVisible(true);        
        
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfigurarActionPerformed
        // TODO add your handling code here:
        
        jPareaTroca.removeAll();
        ConfiguracoesFuncionario cf = new ConfiguracoesFuncionario(funcionario, this);
        cf.setVisible(true);
        cf.setBounds(0,0,1366,600);
        jPareaTroca.add(cf);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_jBConfigurarActionPerformed

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
            java.util.logging.Logger.getLogger(AmbienteFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbienteFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbienteFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbienteFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmbienteFuncionario(new Funcionario(), new Cidade()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcompanharDenuncias;
    private javax.swing.JButton jBAtualizarSituacao;
    private javax.swing.JButton jBConfigurar;
    private javax.swing.JButton jBDenunciarDenuncia;
    private javax.swing.JButton jBSair;
    private javax.swing.JPanel jPAreaMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPareaTroca;
    // End of variables declaration//GEN-END:variables
}
