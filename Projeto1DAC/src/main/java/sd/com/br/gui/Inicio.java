/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.gui;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import sd.com.br.gui.Cadastros.CadastroUsuario;
import sd.com.br.gui.Cadastros.CadastroPrefeitura;
import sd.com.br.gui.Cadastros.CadastroFuncionario;
import sd.com.br.gui.Cadastros.CadastroCidade;
import javax.swing.JDialog;
import sd.com.br.gui.login.LoginAdmin;
import sd.com.br.gui.login.LoginFuncionario;
import sd.com.br.gui.login.LoginPrefeitura;
import sd.com.br.gui.login.LoginUsuario;

/**
 *
 * @author Sergiod
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        jPCentral.setBackground(Color.WHITE);
        Icon icon = new ImageIcon("src/main/java/sd/com/br/gui/img/wallpaper02.png");
        jLBackground.setIcon(icon);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCentral = new javax.swing.JPanel();
        jLBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jMCadastroUsuario = new javax.swing.JMenuItem();
        jMCadastroCidade = new javax.swing.JMenuItem();
        jMCadastroPrefeitura = new javax.swing.JMenuItem();
        jMCadsatroFuncionario = new javax.swing.JMenuItem();
        jMLogin = new javax.swing.JMenu();
        jMLoginUsuario = new javax.swing.JMenuItem();
        jMLoginPrefeitura = new javax.swing.JMenuItem();
        jMLoginFuncionario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPCentralLayout = new javax.swing.GroupLayout(jPCentral);
        jPCentral.setLayout(jPCentralLayout);
        jPCentralLayout.setHorizontalGroup(
            jPCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        jPCentralLayout.setVerticalGroup(
            jPCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(94, 25));

        jMCadastro.setText("Cadastro");

        jMCadastroUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMCadastroUsuario.setText("Usuario");
        jMCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastroUsuarioActionPerformed(evt);
            }
        });
        jMCadastroUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMCadastroUsuarioKeyPressed(evt);
            }
        });
        jMCadastro.add(jMCadastroUsuario);

        jMCadastroCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMCadastroCidade.setText("Cidade");
        jMCadastroCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastroCidadeActionPerformed(evt);
            }
        });
        jMCadastro.add(jMCadastroCidade);

        jMCadastroPrefeitura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMCadastroPrefeitura.setText("Prefeitura");
        jMCadastroPrefeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastroPrefeituraActionPerformed(evt);
            }
        });
        jMCadastro.add(jMCadastroPrefeitura);

        jMCadsatroFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMCadsatroFuncionario.setText("Funcionario");
        jMCadsatroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadsatroFuncionarioActionPerformed(evt);
            }
        });
        jMCadastro.add(jMCadsatroFuncionario);

        jMenuBar1.add(jMCadastro);

        jMLogin.setText("Login");

        jMLoginUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMLoginUsuario.setText("Usuario");
        jMLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLoginUsuarioActionPerformed(evt);
            }
        });
        jMLogin.add(jMLoginUsuario);

        jMLoginPrefeitura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMLoginPrefeitura.setText("Prefeitura");
        jMLoginPrefeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLoginPrefeituraActionPerformed(evt);
            }
        });
        jMLogin.add(jMLoginPrefeitura);

        jMLoginFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMLoginFuncionario.setText("Funcionario");
        jMLoginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLoginFuncionarioActionPerformed(evt);
            }
        });
        jMLogin.add(jMLoginFuncionario);

        jMenuItem1.setText("Administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMLogin.add(jMenuItem1);

        jMenuBar1.add(jMLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMCadastroUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMCadastroUsuarioKeyPressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jMCadastroUsuarioKeyPressed

    private void jMCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastroUsuarioActionPerformed
        // TODO add your handling code here:
        
        CadastroUsuario  cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        cadastroUsuario.setResizable(false);
        cadastroUsuario.setLocationRelativeTo(null);
        cadastroUsuario.setVisible(true);
        
    }//GEN-LAST:event_jMCadastroUsuarioActionPerformed

    private void jMCadsatroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadsatroFuncionarioActionPerformed
        // TODO add your handling code here:

        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        cadastroFuncionario.setResizable(false);
        cadastroFuncionario.setLocationRelativeTo(null);
        cadastroFuncionario.setVisible(true);
        
    }//GEN-LAST:event_jMCadsatroFuncionarioActionPerformed

    private void jMCadastroCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastroCidadeActionPerformed
        // TODO add your handling code here:
        
        CadastroCidade cadastroCidade = new CadastroCidade();
        cadastroCidade.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        cadastroCidade.setResizable(false);
        cadastroCidade.setLocationRelativeTo(null);
        cadastroCidade.setVisible(true);
        
    }//GEN-LAST:event_jMCadastroCidadeActionPerformed

    private void jMCadastroPrefeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastroPrefeituraActionPerformed
        // TODO add your handling code here:
        
        CadastroPrefeitura cadastroPrefeitura = new CadastroPrefeitura();
        cadastroPrefeitura.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        cadastroPrefeitura.setResizable(false);
        cadastroPrefeitura.setLocationRelativeTo(null);
        cadastroPrefeitura.setVisible(true);
        
    }//GEN-LAST:event_jMCadastroPrefeituraActionPerformed

    private void jMLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLoginUsuarioActionPerformed
        // TODO add your handling code here:
        
        LoginUsuario loginUsuario = new LoginUsuario(this);
        loginUsuario.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        loginUsuario.setResizable(false);
        loginUsuario.setLocationRelativeTo(null);
        loginUsuario.setVisible(true);
        
    }//GEN-LAST:event_jMLoginUsuarioActionPerformed

    private void jMLoginPrefeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLoginPrefeituraActionPerformed
        // TODO add your handling code here:
        
        LoginPrefeitura loginPrefeitura = new LoginPrefeitura(this);
        loginPrefeitura.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        loginPrefeitura.setResizable(false);
        loginPrefeitura.setLocationRelativeTo(null);
        loginPrefeitura.setVisible(true);
        
    }//GEN-LAST:event_jMLoginPrefeituraActionPerformed

    private void jMLoginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLoginFuncionarioActionPerformed
        // TODO add your handling code here:
        
        LoginFuncionario loginFuncionario = new LoginFuncionario(this);
        loginFuncionario.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        loginFuncionario.setResizable(false);
        loginFuncionario.setLocationRelativeTo(null);
        loginFuncionario.setVisible(true);
        
    }//GEN-LAST:event_jMLoginFuncionarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        LoginAdmin loginAdmin = new LoginAdmin(this);
        loginAdmin.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        loginAdmin.setResizable(false);
        loginAdmin.setLocationRelativeTo(null);
        loginAdmin.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBackground;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenuItem jMCadastroCidade;
    private javax.swing.JMenuItem jMCadastroPrefeitura;
    private javax.swing.JMenuItem jMCadastroUsuario;
    private javax.swing.JMenuItem jMCadsatroFuncionario;
    private javax.swing.JMenu jMLogin;
    private javax.swing.JMenuItem jMLoginFuncionario;
    private javax.swing.JMenuItem jMLoginPrefeitura;
    private javax.swing.JMenuItem jMLoginUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPCentral;
    // End of variables declaration//GEN-END:variables
}
