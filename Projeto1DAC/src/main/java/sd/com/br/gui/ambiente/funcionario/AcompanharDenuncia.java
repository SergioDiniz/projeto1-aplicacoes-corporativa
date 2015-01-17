/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.com.br.gui.ambiente.funcionario;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sd.com.br.beans.Cidade;
import sd.com.br.dao.DaoCidade;
import sd.com.br.gui.ModeloTabela;

/**
 *
 * @author SergioD
 */
public class AcompanharDenuncia extends javax.swing.JPanel {

    /**
     * Creates new form acompanharDenuncia
     */
    private Cidade cidade;
    
    public AcompanharDenuncia(Cidade cidade) {
        this.cidade = cidade;
        initComponents();
        init();
//        atualizarCidade();
    }
    
//    public void atualizarCidade(){
//        DaoCidade dc = new DaoCidade();
//        cidade = dc.atualizarObjCidade(cidade);
//    }    
    
    
    public void init(){
        
        
        if(cidade.getDenuncias() != null && cidade.getDenuncias().size() > 0){
            
            ArrayList dados = new ArrayList();
            String[] colunas = new String[]{"Descrição", "Endereço", "Acompanhamento", "Codigo"};
            
            for(int i = 0 ; i < cidade.getDenuncias().size() ; i++){
                dados.add(new Object[]{
                                        cidade.getDenuncias().get(i).getDescricao(),
                                        cidade.getDenuncias().get(i).getEnderecoDenuncia().getRua() + ", " + cidade.getDenuncias().get(i).getEnderecoDenuncia().getNumero() + ", " + cidade.getDenuncias().get(i).getEnderecoDenuncia().getBairro(),
                                        cidade.getDenuncias().get(i).getEstadoDeAcompanhamento(),
                                        cidade.getDenuncias().get(i).getId()
                                      });
            }
            
            
            ModeloTabela tabela = new ModeloTabela(dados, colunas);
            jTDenuncias.setModel(tabela);
            jTDenuncias.setRowHeight(40);
            jTDenuncias.getTableHeader().setReorderingAllowed(false);
            
            
        } else {
            
            jPAreaDenuncias.setVisible(false);
            JOptionPane.showMessageDialog(jPanel1, "Nenhuma denuncia para sua cidade");
            
        }
        
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
        jPAreaDenuncias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDenuncias = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Denuncias para sua cidade");

        jPAreaDenuncias.setBackground(new java.awt.Color(255, 255, 255));

        jTDenuncias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTDenuncias);

        javax.swing.GroupLayout jPAreaDenunciasLayout = new javax.swing.GroupLayout(jPAreaDenuncias);
        jPAreaDenuncias.setLayout(jPAreaDenunciasLayout);
        jPAreaDenunciasLayout.setHorizontalGroup(
            jPAreaDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAreaDenunciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPAreaDenunciasLayout.setVerticalGroup(
            jPAreaDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAreaDenunciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPAreaDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPAreaDenuncias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPAreaDenuncias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTDenuncias;
    // End of variables declaration//GEN-END:variables
}
