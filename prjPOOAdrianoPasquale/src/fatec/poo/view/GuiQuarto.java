package fatec.poo.view;

import fatec.poo.control.DaoQuarto;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Quarto;
import javax.swing.JOptionPane;

/**
 * @author shenmue
 */
public class GuiQuarto extends javax.swing.JFrame {

    public GuiQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoQuarto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoQuarto = new javax.swing.JTextField();
        txtValDiaria = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdbSolteiro = new javax.swing.JRadioButton();
        rdbCasal = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("N° Quarto");
        jLabel1.setToolTipText("");

        jLabel2.setText("Valor Diária");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        grpTipoQuarto.add(rdbSolteiro);
        rdbSolteiro.setText("Solteiro");

        grpTipoQuarto.add(rdbCasal);
        rdbCasal.setText("Casal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbSolteiro)
                    .addComponent(rdbCasal))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbCasal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNoQuarto)
                                .addComponent(txtValDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int numQuarto;
        try {
            if (txtNoQuarto.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Número do Quarto deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtNoQuarto.requestFocus();
                return;
            }
            numQuarto = Integer.parseInt(txtNoQuarto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número do Quarto inválido! Informe um valor numérico inteiro.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            txtNoQuarto.requestFocus();
            return;
        }

        quarto = daoQuarto.consultar(numQuarto);

        if (quarto != null) {
            txtValDiaria.setText(String.valueOf(quarto.getValorDiaria()));
            if (quarto.getTipo().equals("S")) {
                rdbSolteiro.setSelected(true);
            } else {
                rdbCasal.setSelected(true);
            }
            
            txtNoQuarto.setEnabled(false);
            txtValDiaria.setEnabled(true);
            rdbSolteiro.setEnabled(true);
            rdbCasal.setEnabled(true);
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            
            txtValDiaria.requestFocus(); 
        } else {
            JOptionPane.showMessageDialog(this, "Quarto não cadastrado. Prossiga com a inserção.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtValDiaria.setText("");
            rdbSolteiro.setSelected(true);

            
            txtNoQuarto.setEnabled(false);
            txtValDiaria.setEnabled(true);
            rdbSolteiro.setEnabled(true);
            rdbCasal.setEnabled(true);
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            txtValDiaria.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       prepCon = new PreparaConexao("BD2321026","BD2321026");
       prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
       prepCon.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");      
       daoQuarto = new DaoQuarto(prepCon.abrirConexao());
       
       txtNoQuarto.setEnabled(true);
       txtValDiaria.setEnabled(false);
       rdbSolteiro.setEnabled(false);
       rdbCasal.setEnabled(false);
       
       btnConsultar.setEnabled(true);
       btnInserir.setEnabled(false);
       btnAlterar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnSair.setEnabled(true);
       
       rdbSolteiro.setSelected(true);
       txtNoQuarto.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); // fecha a gui
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        int numQuarto = Integer.parseInt(txtNoQuarto.getText());
        double valDiaria;
        String tipoQuarto;

        try {
            if (txtValDiaria.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Valor da diária deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtValDiaria.requestFocus();
                return;
            }
            valDiaria = Double.parseDouble(txtValDiaria.getText().replace(",", "."));
            if (valDiaria <= 0) {
                JOptionPane.showMessageDialog(this, "Valor da diária deve ser positivo.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtValDiaria.requestFocus();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor da diária inválido!", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            txtValDiaria.requestFocus();
            return;
        }

        if (rdbSolteiro.isSelected()) {
            tipoQuarto = "S";
        } else {
            tipoQuarto = "C";
        }

        quarto = new Quarto(numQuarto, tipoQuarto, valDiaria);
        
        daoQuarto.inserir(quarto);
        JOptionPane.showMessageDialog(this, "Quarto inserido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        txtNoQuarto.setText("");
        txtValDiaria.setText("");
        rdbSolteiro.setSelected(true);
        
        txtNoQuarto.setEnabled(true);
        txtValDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNoQuarto.requestFocus();
        
        quarto = null;
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       if (JOptionPane.showConfirmDialog(null, "Confirma Alteração dos Dados do Quarto?") == 0) {
            double valDiaria;
            String tipoQuarto;

            try {
                if (txtValDiaria.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Valor da diária deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                    txtValDiaria.requestFocus();
                    return;
                }
                valDiaria = Double.parseDouble(txtValDiaria.getText().replace(",", "."));
                 if (valDiaria <= 0) {
                    JOptionPane.showMessageDialog(this, "Valor da diária deve ser positivo.", "Atenção", JOptionPane.WARNING_MESSAGE);
                    txtValDiaria.requestFocus();
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor da diária inválido!", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                txtValDiaria.requestFocus();
                return;
            }

            if (rdbSolteiro.isSelected()) {
                tipoQuarto = "S";
            } else {
                tipoQuarto = "C";
            }

            quarto.setTipo(tipoQuarto);
            quarto.setValorDiaria(valDiaria);
            quarto.setSituacao(quarto.getSituacao()); 
            quarto.setTotalFaturado(quarto.getTotalFaturado());

            daoQuarto.alterar(quarto);

            JOptionPane.showMessageDialog(this, "Dados do quarto alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }

        txtNoQuarto.setText("");
        txtValDiaria.setText("");
        rdbSolteiro.setSelected(true);
        
        txtNoQuarto.setEnabled(true);
        txtValDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNoQuarto.requestFocus();
        
        quarto = null;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma a exclusão dos dados do Quarto?") == 0) {
            daoQuarto.excluir(quarto);
            JOptionPane.showMessageDialog(this, "Quarto excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            txtNoQuarto.setText("");
            txtValDiaria.setText("");
            rdbSolteiro.setSelected(true);

            txtNoQuarto.setEnabled(true);
            txtValDiaria.setEnabled(false);
            rdbSolteiro.setEnabled(false);
            rdbCasal.setEnabled(false);
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtNoQuarto.requestFocus();
            
            quarto = null;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private DaoQuarto daoQuarto;
    private Quarto quarto;
    private PreparaConexao prepCon;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup grpTipoQuarto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbCasal;
    private javax.swing.JRadioButton rdbSolteiro;
    private javax.swing.JTextField txtNoQuarto;
    private javax.swing.JTextField txtValDiaria;
    // End of variables declaration//GEN-END:variables
}
