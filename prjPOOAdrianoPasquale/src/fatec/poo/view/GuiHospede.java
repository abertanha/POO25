package fatec.poo.view;

import fatec.poo.control.DaoHospede;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Hospede;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 * @author shenmue
 */
public class GuiHospede extends javax.swing.JFrame {

    public GuiHospede() throws ParseException {
        initComponents();
        MaskFormatter maskData = new MaskFormatter("###.###.###-##");
        maskData.install(ftfCPF);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTaxaDesconto = new javax.swing.JTextField();
        ftfCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Hospede");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("CPF");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nome");

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

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("Taxa de desconto (%)");

        ftfCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfCPF.setText("   .   .   -");
        ftfCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(txtTelefone))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
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
        String cpfFormatado = ftfCPF.getText();
        String cpfNumeros = cpfFormatado.replaceAll("[^0-9]", "");
        
        hospede = daoHospede.consultar(cpfNumeros);

        if (hospede != null) { 
            txtNome.setText(hospede.getNome());
            txtEndereco.setText(hospede.getEndereco());
            txtTelefone.setText(hospede.getTelefone());
            txtTaxaDesconto.setText(String.valueOf(hospede.getTaxaDesconto()));


            ftfCPF.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtTaxaDesconto.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false); 
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

            txtNome.requestFocus(); 
        } else { 
            JOptionPane.showMessageDialog(this, "Hóspede não cadastrado. Prossiga com a inserção de dados.", "Informação", JOptionPane.INFORMATION_MESSAGE);

            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtTaxaDesconto.setText("");

            ftfCPF.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtTaxaDesconto.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       prepCon = new PreparaConexao("BD2321026","BD2321026");
       prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
       prepCon.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");       
       daoHospede = new DaoHospede(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); // fecha a gui
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String cpfNumeros = ftfCPF.getText().replaceAll("[^0-9]", "");
        if(!hospede.validarCPF(cpfNumeros)){
            JOptionPane.showMessageDialog(this,"CPF inválido!","Erro de Validação", JOptionPane.ERROR_MESSAGE);
            
            ftfCPF.setEnabled(true);
            //ftfCPF.setText(cpfNumeros); DUVIDA// manter o cpf digitado errado no campo para possível correção
            ftfCPF.requestFocus();
                    
            return;
        }
        
        hospede = new Hospede(cpfNumeros, txtNome.getText());
        hospede.setEndereco(txtEndereco.getText());
        hospede.setTelefone(txtTelefone.getText());
        hospede.setTaxaDesconto(Double.parseDouble(txtTaxaDesconto.getText().replace(",",".")));
        
        daoHospede.inserir(hospede);
        JOptionPane.showMessageDialog(this, "Hóspede inserido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        ftfCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtTaxaDesconto.setText("");
        
        ftfCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        ftfCPF.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Alteração dos Dados do Hóspede?") == 0) {
            String cpfOriginal = this.hospede.getCpf();
            String novoNome = txtNome.getText();
            String novoEndereco = txtEndereco.getText();
            String novoTelefone = txtTelefone.getText();
            double taxaDescontoGUI;
            
            if (novoNome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "O nome não pode estar vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                txtNome.requestFocus();
                return;
            }

            try {
                if (txtTaxaDesconto.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Taxa de desconto não pode estar vazia.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    txtTaxaDesconto.requestFocus();
                    return;
                }
                taxaDescontoGUI = Double.parseDouble(txtTaxaDesconto.getText().replace(",", "."));
                if (taxaDescontoGUI < 0) {
                    JOptionPane.showMessageDialog(this, "Taxa de desconto não pode ser negativa.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    txtTaxaDesconto.requestFocus();
                    return;
                }
                hospede.setTaxaDesconto(taxaDescontoGUI);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para Taxa de Desconto. Use números.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                txtTaxaDesconto.requestFocus();
                return;
            }
            
            hospede.setNome(novoNome);
            hospede.setEndereco(novoEndereco);
            hospede.setTelefone(novoTelefone);
            hospede.setTaxaDesconto(taxaDescontoGUI);

            daoHospede.alterar(hospede); 
            JOptionPane.showMessageDialog(this, "Dados do hóspede alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }

 
        ftfCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtTaxaDesconto.setText("");

        ftfCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        ftfCPF.requestFocus();

        hospede = null;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão dos dados do Hóspede?") == 0) {
            
            daoHospede.excluir(hospede);
            
            JOptionPane.showMessageDialog(this, "Hóspede excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
            ftfCPF.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtTaxaDesconto.setText("");

            
            ftfCPF.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtTaxaDesconto.setEnabled(false);

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            ftfCPF.requestFocus();

            hospede = null;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private PreparaConexao prepCon;
    private DaoHospede daoHospede;
    private Hospede hospede;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTaxaDesconto;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
