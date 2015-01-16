/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.gui.ambiente.usuario;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sd.com.br.beans.Usuario;
import sd.com.br.gui.Inicio;

/**
 *
 * @author Sergiod
 */
public class AmbienteUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AmbienteUsuario
     */
    
    private Usuario usuario;
    
    public AmbienteUsuario(Usuario usuario) {
        
        this.usuario = usuario;
        
       
        initComponents();
        iniciarBotoes();
        
        this.setExtendedState(MAXIMIZED_BOTH);

        
       JOptionPane.showMessageDialog(rootPane, "Bem-Vindo!"); 
    }

    
    public void iniciarBotoes(){
        Icon iconEscrever = new ImageIcon("src/main/java/sd/com/br/gui/img/escrever.jpg");
        Icon iconPesquisar = new ImageIcon("src/main/java/sd/com/br/gui/img/pesquisar.jpg");
        Icon iconRealizadas = new ImageIcon("src/main/java/sd/com/br/gui/img/realizadas.jpg");
        Icon iconSair = new ImageIcon("src/main/java/sd/com/br/gui/img/sair.jpg");
        Icon iconConfig = new ImageIcon("src/main/java/sd/com/br/gui/img/configuracoes.jpg");
        
        jBNovaDenuncia.setIcon(iconEscrever);
        jBPesquisarCidade.setIcon(iconPesquisar);
        jBDenunciasRealizadas.setIcon(iconRealizadas);
        jBConfiguracoes.setIcon(iconConfig);
        jBSair.setIcon(iconSair);        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPConteiner = new javax.swing.JPanel();
        jPAreaTroca = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jBNovaDenuncia = new javax.swing.JButton();
        jBPesquisarCidade = new javax.swing.JButton();
        jBDenunciasRealizadas = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBConfiguracoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPConteiner.setBackground(new java.awt.Color(255, 255, 255));
        jPConteiner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPAreaTroca.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPAreaTrocaLayout = new javax.swing.GroupLayout(jPAreaTroca);
        jPAreaTroca.setLayout(jPAreaTrocaLayout);
        jPAreaTrocaLayout.setHorizontalGroup(
            jPAreaTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPAreaTrocaLayout.setVerticalGroup(
            jPAreaTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        jBNovaDenuncia.setToolTipText("Nova Denuncia");
        jBNovaDenuncia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBNovaDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovaDenunciaActionPerformed(evt);
            }
        });

        jBPesquisarCidade.setToolTipText("Pesquisar Cidade");
        jBPesquisarCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBPesquisarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarCidadeActionPerformed(evt);
            }
        });

        jBDenunciasRealizadas.setToolTipText("Denuncias Realizadas");
        jBDenunciasRealizadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBDenunciasRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDenunciasRealizadasActionPerformed(evt);
            }
        });

        jBSair.setToolTipText("Sair");
        jBSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBConfiguracoes.setToolTipText("Denuncias Realizadas");
        jBConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfiguracoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConteinerLayout = new javax.swing.GroupLayout(jPConteiner);
        jPConteiner.setLayout(jPConteinerLayout);
        jPConteinerLayout.setHorizontalGroup(
            jPConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConteinerLayout.createSequentialGroup()
                        .addComponent(jBNovaDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBDenunciasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPAreaTroca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPConteinerLayout.setVerticalGroup(
            jPConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNovaDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDenunciasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPAreaTroca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPConteiner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPConteiner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:

        dispose();
        new Inicio().setVisible(true);

    }//GEN-LAST:event_jBSairActionPerformed

    private void jBNovaDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovaDenunciaActionPerformed
        // TODO add your handling code here:

        jPAreaTroca.removeAll();
        NovaDenuncia nd = new NovaDenuncia(usuario);
        nd.setVisible(true);
        nd.setBounds(0,0,1366,600);
        jPAreaTroca.add(nd);
        revalidate();
        repaint();

    }//GEN-LAST:event_jBNovaDenunciaActionPerformed

    private void jBPesquisarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarCidadeActionPerformed
        // TODO add your handling code here:
        
        jPAreaTroca.removeAll();
        PesquisarCidade pc = new PesquisarCidade();
        pc.setVisible(true);
        pc.setBounds(0,0,1366,600);
        jPAreaTroca.add(pc);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_jBPesquisarCidadeActionPerformed

    private void jBDenunciasRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDenunciasRealizadasActionPerformed
        // TODO add your handling code here:
        
        jPAreaTroca.removeAll();
        DenunciasRealizadas dr = new DenunciasRealizadas(usuario.getEmail());
        dr.setVisible(true);
        dr.setBounds(0,0,1366,600);
        jPAreaTroca.add(dr);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_jBDenunciasRealizadasActionPerformed

    private void jBConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfiguracoesActionPerformed
        // TODO add your handling code here:
        
        jPAreaTroca.removeAll();
        ConfiguracoesUsuario conf = new ConfiguracoesUsuario(usuario, this);
        conf.setVisible(true);
        conf.setBounds(0,0,1366,600);
        jPAreaTroca.add(conf);
        revalidate();
        repaint();        
        
    }//GEN-LAST:event_jBConfiguracoesActionPerformed

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
            java.util.logging.Logger.getLogger(AmbienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbienteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmbienteUsuario(new Usuario()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfiguracoes;
    private javax.swing.JButton jBDenunciasRealizadas;
    private javax.swing.JButton jBNovaDenuncia;
    private javax.swing.JButton jBPesquisarCidade;
    private javax.swing.JButton jBSair;
    private javax.swing.JPanel jPAreaTroca;
    private javax.swing.JPanel jPConteiner;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
