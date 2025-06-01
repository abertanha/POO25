package fatec.poo.view;

import fatec.poo.control.DaoServicoQuarto;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.ServicoQuarto;
import javax.swing.JOptionPane;

/**
 * @author shenmue
 */
public class GuiServicoQuarto extends javax.swing.JFrame {

    public GuiServicoQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoQuarto = new javax.swing.JTextField();
        txtValDiaria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxDescricao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Serviço de Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Código");
        jLabel1.setToolTipText("");

        jLabel2.setText("Valor");

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

        jLabel3.setText("Descrição");
        jLabel3.setToolTipText("");

        cbxDescricao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Água", "Doce", "Lanche", "Refrigerante", "Salgado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoQuarto)
                            .addComponent(txtValDiaria)
                            .addComponent(cbxDescricao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
        int codigo;
        try {
            if (txtNoQuarto.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Código do Serviço deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtNoQuarto.requestFocus();
                return;
            }
            codigo = Integer.parseInt(txtNoQuarto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código do Serviço inválido! Informe um valor numérico inteiro.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            txtNoQuarto.requestFocus();
            return;
        }

        servicoQuarto = daoServicoQuarto.consultar(codigo);

        if (servicoQuarto != null) {
            cbxDescricao.setSelectedItem(servicoQuarto.getDescricao());
            txtValDiaria.setText(String.valueOf(servicoQuarto.getValor()));
            
            txtNoQuarto.setEnabled(false);
            cbxDescricao.setEnabled(true);
            txtValDiaria.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            
            cbxDescricao.requestFocus();
        } else { 
            JOptionPane.showMessageDialog(this, "Serviço de Quarto não cadastrado. Prossiga com a inserção.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            cbxDescricao.setSelectedIndex(0);
            txtValDiaria.setText("");

            txtNoQuarto.setEnabled(false);
            cbxDescricao.setEnabled(true);
            txtValDiaria.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            cbxDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       prepCon = new PreparaConexao("BD2321026","BD2321026");
       prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
       prepCon.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");       
       daoServicoQuarto = new DaoServicoQuarto(prepCon.abrirConexao());
       
       txtNoQuarto.setEnabled(true);
       cbxDescricao.setEnabled(false);
       txtValDiaria.setEnabled(false);

       btnConsultar.setEnabled(btnConsultar.isEnabled());
       btnInserir.setEnabled(false);
       btnAlterar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnSair.setEnabled(true);
       
       txtNoQuarto.requestFocus();
       cbxDescricao.setSelectedIndex(0);
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        int codigo = Integer.parseInt(txtNoQuarto.getText()); 
        String descricao = (String) cbxDescricao.getSelectedItem();
        double valor;

        try {
            if (txtValDiaria.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Valor do serviço deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtValDiaria.requestFocus();
                return;
            }
            valor = Double.parseDouble(txtValDiaria.getText().replace(",", "."));
            if (valor < 0) {
                 JOptionPane.showMessageDialog(this, "Valor do serviço não pode ser negativo.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtValDiaria.requestFocus();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor do serviço inválido!", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            txtValDiaria.requestFocus();
            return;
        }
        
        servicoQuarto = new ServicoQuarto(codigo, descricao);
        servicoQuarto.setValor(valor);
        
        daoServicoQuarto.inserir(servicoQuarto);
        JOptionPane.showMessageDialog(this, "Serviço de Quarto inserido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        txtNoQuarto.setText("");
        cbxDescricao.setSelectedIndex(0);
        txtValDiaria.setText("");
        
        txtNoQuarto.setEnabled(true);
        cbxDescricao.setEnabled(false);
        txtValDiaria.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtNoQuarto.requestFocus();
        
        servicoQuarto = null;
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração dos Dados do Serviço de Quarto?") == 0) {
            String novaDescricao = (String) cbxDescricao.getSelectedItem();
            double novoValor;

            try {
                if (txtValDiaria.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Valor do serviço deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                    txtValDiaria.requestFocus();
                    return;
                }
                novoValor = Double.parseDouble(txtValDiaria.getText().replace(",", "."));
                if (novoValor < 0) {
                    JOptionPane.showMessageDialog(this, "Valor do serviço não pode ser negativo.", "Atenção", JOptionPane.WARNING_MESSAGE);
                    txtValDiaria.requestFocus();
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor do serviço inválido!", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                txtValDiaria.requestFocus();
                return;
            }
            
            ServicoQuarto servicoAtualizado = new ServicoQuarto(servicoQuarto.getCodigo(), novaDescricao);
            servicoAtualizado.setValor(novoValor);
            
            daoServicoQuarto.alterar(servicoAtualizado);
            JOptionPane.showMessageDialog(this, "Serviço de Quarto alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        txtNoQuarto.setText("");
        cbxDescricao.setSelectedIndex(0);
        txtValDiaria.setText("");
        
        txtNoQuarto.setEnabled(true);
        cbxDescricao.setEnabled(false);
        txtValDiaria.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNoQuarto.requestFocus();
        servicoQuarto = null;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão do Serviço de Quarto?") == 0) {
            daoServicoQuarto.excluir(servicoQuarto);
            JOptionPane.showMessageDialog(this, "Serviço de Quarto excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            txtNoQuarto.setText("");
            cbxDescricao.setSelectedIndex(0);
            txtValDiaria.setText("");

            txtNoQuarto.setEnabled(true);
            cbxDescricao.setEnabled(false);
            txtValDiaria.setEnabled(false);
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtNoQuarto.requestFocus();
            servicoQuarto = null;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private DaoServicoQuarto daoServicoQuarto;
    private ServicoQuarto servicoQuarto;
    private PreparaConexao prepCon;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNoQuarto;
    private javax.swing.JTextField txtValDiaria;
    // End of variables declaration//GEN-END:variables
}
