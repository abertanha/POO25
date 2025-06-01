package fatec.poo.view;

import fatec.poo.control.DaoRecepcionista;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Recepcionista;
import javax.swing.JOptionPane;

/**
 * @author shenmue
 */
public class GuiRecepcionista extends javax.swing.JFrame {

    public GuiRecepcionista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTurno = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRegFunc = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdbManha = new javax.swing.JRadioButton();
        rdbTarde = new javax.swing.JRadioButton();
        rdbNoite = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Recepcionista");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Registro Funcional");
        jLabel1.setToolTipText("");

        jLabel2.setText("Telefone");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        grpTurno.add(rdbManha);
        rdbManha.setText("Manhã");

        grpTurno.add(rdbTarde);
        rdbTarde.setText("Tarde");

        grpTurno.add(rdbNoite);
        rdbNoite.setText("Noite");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbManha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbNoite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbManha)
                    .addComponent(rdbTarde)
                    .addComponent(rdbNoite))
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

        jLabel3.setText("Nome");
        jLabel3.setToolTipText("");

        jLabel4.setText("Endereço");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRegFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtEndereco))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
        int regFunc;
        try {
            if (txtRegFunc.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Registro Funcional deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                txtRegFunc.requestFocus();
                return;
            }
            regFunc = Integer.parseInt(txtRegFunc.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Registro Funcional inválido! Informe um valor numérico inteiro.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            txtRegFunc.requestFocus();
            return;
        }

        recepcionista = daoRecepcionista.consultar(regFunc);

        if (recepcionista != null) {
            txtNome.setText(recepcionista.getNome());
            txtEndereco.setText(recepcionista.getEndereco());
            txtTelefone.setText(recepcionista.getTelefone());
            
            String turno = recepcionista.getTurno();
            
            if (turno != null) {
                switch (turno) {
                    case "M":
                        rdbManha.setSelected(true);
                        break;
                    case "T":
                        rdbTarde.setSelected(true); 
                        break;
                    case "N":
                        rdbNoite.setSelected(true);
                        break;
                    default:
                        break;
                }
            }
            
            txtRegFunc.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            rdbManha.setEnabled(true);
            rdbTarde.setEnabled(true);
            rdbNoite.setEnabled(true); 

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            txtNome.requestFocus();
        } else { 
            JOptionPane.showMessageDialog(this, "Recepcionista não cadastrado(a). Prossiga com a inserção.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            rdbManha.setSelected(true);

            txtRegFunc.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            rdbManha.setEnabled(true);
            rdbTarde.setEnabled(true);
            rdbNoite.setEnabled(true); 

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
       daoRecepcionista = new DaoRecepcionista(prepCon.abrirConexao());
       
       txtRegFunc.setEnabled(true);
       txtNome.setEnabled(false);
       txtEndereco.setEnabled(false);
       txtTelefone.setEnabled(false);
       rdbManha.setEnabled(false);
       rdbTarde.setEnabled(false);
       rdbNoite.setEnabled(false);

       btnConsultar.setEnabled(btnConsultar.isEnabled());
       btnInserir.setEnabled(false);
       btnAlterar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnSair.setEnabled(true);
       
       rdbManha.setSelected(true);
       txtRegFunc.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); // fecha a gui
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        int regFunc = Integer.parseInt(txtRegFunc.getText());
        
        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome deve ser informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return;
        }
        // Será que devo fazer mais validações de campos?

        recepcionista = new Recepcionista(regFunc, txtNome.getText());
        recepcionista.setEndereco(txtEndereco.getText());
        recepcionista.setTelefone(txtTelefone.getText());
        
        if (rdbManha.isSelected()) {
            recepcionista.setTurno("M");
        } else if (rdbTarde.isSelected()) {
            recepcionista.setTurno("T");
        } else if (rdbNoite.isSelected()) {
            recepcionista.setTurno("N");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um turno.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        daoRecepcionista.inserir(recepcionista);
        JOptionPane.showMessageDialog(this, "Recepcionista inserido(a) com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        txtRegFunc.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        rdbManha.setSelected(true);

        txtRegFunc.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false); 

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegFunc.requestFocus();
        recepcionista = null;
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração dos Dados do Recepcionista?") == 0) {
            int regFuncOriginal = this.recepcionista.getRegFunc();
            String novoNome = txtNome.getText();
            String novoEndereco = txtEndereco.getText();
            String novoTelefone = txtTelefone.getText();
            String novoTurno;
            
            if (novoNome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "O nome não pode estar vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                txtNome.requestFocus();
                return;
            }

            if (rdbManha.isSelected()) novoTurno = "M";
            else if (rdbTarde.isSelected()) novoTurno = "T";
            else if (rdbNoite.isSelected()) novoTurno = "N";
            else {
                JOptionPane.showMessageDialog(this, "Selecione um turno.", "Atenção", JOptionPane.WARNING_MESSAGE);
                jPanel1.requestFocus();
                return;
            }
            
            Recepcionista recepcionistaAlterado = new Recepcionista(regFuncOriginal, novoNome);
            recepcionistaAlterado.setEndereco(novoEndereco);
            recepcionistaAlterado.setTelefone(novoTelefone);
            recepcionistaAlterado.setTurno(novoTurno);

            daoRecepcionista.alterar(recepcionistaAlterado);

            JOptionPane.showMessageDialog(this, "Dados do recepcionista alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }

        txtRegFunc.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        rdbManha.setSelected(true);

        txtRegFunc.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegFunc.requestFocus();
        recepcionista = null;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão do Recepcionista?") == 0) {
            daoRecepcionista.excluir(recepcionista);
            JOptionPane.showMessageDialog(this, "Recepcionista excluído(a) com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            txtRegFunc.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            rdbManha.setSelected(true);

            txtRegFunc.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            rdbManha.setEnabled(false);
            rdbTarde.setEnabled(false);
            rdbNoite.setEnabled(false); 

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtRegFunc.requestFocus();
            recepcionista = null;
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    private DaoRecepcionista daoRecepcionista;
    private Recepcionista recepcionista;
    private PreparaConexao prepCon;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup grpTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbManha;
    private javax.swing.JRadioButton rdbNoite;
    private javax.swing.JRadioButton rdbTarde;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegFunc;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}