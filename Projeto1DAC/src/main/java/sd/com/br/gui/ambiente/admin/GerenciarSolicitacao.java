/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.gui.ambiente.admin;

import javax.swing.JOptionPane;
import sd.com.br.beans.Prefeitura;
import sd.com.br.dao.Dao;
import sd.com.br.dao.DaoPrefeitura;

/**
 *
 * @author SergioD
 */
public class GerenciarSolicitacao extends javax.swing.JPanel {

    /**
     * Creates new form AprovarSolicitacao
     */
    private int codigo;
    
    public GerenciarSolicitacao() {
        initComponents();
        init();
    }
    
    public void init(){
        jLMsgErro.setVisible(false);
        jPTodosOsCampos.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLMsgErro = new javax.swing.JLabel();
        jPTodosOsCampos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTUF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCSituacao = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Gerenciar Estado das Prefeitura");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Codigo");

        jTCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLMsgErro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMsgErro.setForeground(new java.awt.Color(255, 51, 51));
        jLMsgErro.setText("Solicitação não encontrada.");

        jPTodosOsCampos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome");

        jTNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cidade");

        jTCidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("UF");

        jTUF.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Email");

        jTEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.setSelected(true);
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Situação");

        jCSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inativo", "Ativo" }));

        javax.swing.GroupLayout jPTodosOsCamposLayout = new javax.swing.GroupLayout(jPTodosOsCampos);
        jPTodosOsCampos.setLayout(jPTodosOsCamposLayout);
        jPTodosOsCamposLayout.setHorizontalGroup(
            jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNome, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jTCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTEmail)
                                    .addComponent(jTUF, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(268, 268, 268)
                                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                        .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTodosOsCamposLayout.setVerticalGroup(
            jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTodosOsCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTUF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPTodosOsCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPTodosOsCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLMsgErro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMsgErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTodosOsCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
        
        String item = (String) jCSituacao.getSelectedItem();
        boolean situacao;
        
        if(item == "Inativo"){
            situacao = false;
        }else{
            situacao = true;
        }
        
        DaoPrefeitura dp = new DaoPrefeitura();
        String resultado = dp.atualizarSituacao(dp.pesquisarPorCodigo(codigo), situacao);
         JOptionPane.showMessageDialog(jPanel1, resultado);
        
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // TODO add your handling code here:
        
        if(jTCodigo.getText().length() > 0){
                       
            
            DaoPrefeitura dp = new DaoPrefeitura();
            
            int codaux = -1;
            
            try {
                codaux = Integer.parseInt(jTCodigo.getText());                
            } catch (Exception e) {}             
            
            Prefeitura p = dp.pesquisarPorCodigo(codaux);
            
            if(p != null){
                jLMsgErro.setVisible(false);
                jPTodosOsCampos.setVisible(true);                
                codigo = p.getId();
                
                jTNome.setText(p.getNome());
                jTEmail.setText(p.getEmail());
                jTCidade.setText(p.getCidade().getCidadePK().getNomeCidade());
                jTUF.setText(p.getCidade().getCidadePK().getSiglaEstado());
                
                jTNome.setEditable(false);
                jTEmail.setEditable(false);
                jTCidade.setEditable(false);
                jTUF.setEditable(false);
                
                if(p.isAtivo() == false){
                    jCSituacao.setSelectedIndex(0);
                } else{
                    jCSituacao.setSelectedIndex(1);
                }
                
                
            } else{
                jLMsgErro.setVisible(true);
                jPTodosOsCampos.setVisible(false);
            }
             
        } else {
            
        }
        
        
        revalidate();
        repaint();
        
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        
        
        try {
            
            DaoPrefeitura dp = new DaoPrefeitura();
            String resultado = dp.excluir(dp.pesquisarPorCodigo(codigo));
            JOptionPane.showMessageDialog(jPanel1, "Ecluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanel1, "ERRO!");
        }
        
        
    }//GEN-LAST:event_jBExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox jCSituacao;
    private javax.swing.JLabel jLMsgErro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPTodosOsCampos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTUF;
    // End of variables declaration//GEN-END:variables
}