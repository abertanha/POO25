package fatec.poo.view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author shenmue
 */
public class GuiHotel extends javax.swing.JFrame {

    public GuiHotel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemQuarto = new javax.swing.JMenuItem();
        jMenuItemRecepcionista = new javax.swing.JMenuItem();
        jMenuItemHospede = new javax.swing.JMenuItem();
        jMenuItemServQuarto = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel POO");

        jMenuCadastro.setText("Cadastro");

        jMenuItemQuarto.setText("Quarto");
        jMenuItemQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemQuarto);

        jMenuItemRecepcionista.setText("Recepcionista");
        jMenuItemRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecepcionistaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemRecepcionista);

        jMenuItemHospede.setText("Hospede");
        jMenuItemHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHospedeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemHospede);

        jMenuItemServQuarto.setText("Serviço de Quarto");
        jMenuItemServQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemServQuarto);

        jMenuBar1.add(jMenuCadastro);

        jMenuRegistro.setText("Registro");

        jMenuItemRegistro.setText("Reservar/Liberar");
        jMenuItemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRegistro);

        jMenuBar1.add(jMenuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuartoActionPerformed
       GuiQuarto guiQuarto;
       
       guiQuarto = new GuiQuarto();
       
       guiQuarto.setVisible(true);
    }//GEN-LAST:event_jMenuItemQuartoActionPerformed

    private void jMenuItemRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecepcionistaActionPerformed
       GuiRecepcionista guiRecepcionista;
       
       guiRecepcionista = new GuiRecepcionista();
       
       guiRecepcionista.setVisible(true);
    }//GEN-LAST:event_jMenuItemRecepcionistaActionPerformed

    private void jMenuItemHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHospedeActionPerformed
        GuiHospede guiHospede;
        try{      
            guiHospede = new GuiHospede();
            guiHospede.setVisible(true);
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, 
                                         "Erro ao inicializar o formulário de cadastro de hóspede:\n" + ex.getMessage(), 
                                         "Erro de Inicialização", 
                                         JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jMenuItemHospedeActionPerformed

    private void jMenuItemServQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServQuartoActionPerformed
       GuiServicoQuarto guiServicoQuarto;
       
       guiServicoQuarto = new GuiServicoQuarto();
       
       guiServicoQuarto.setVisible(true);
    }//GEN-LAST:event_jMenuItemServQuartoActionPerformed

    private void jMenuItemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroActionPerformed
        GuiRegistro guiRegistro;
       
        try {
            guiRegistro = new GuiRegistro();
            guiRegistro.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(GuiHotel.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jMenuItemRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(GuiHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemHospede;
    private javax.swing.JMenuItem jMenuItemQuarto;
    private javax.swing.JMenuItem jMenuItemRecepcionista;
    private javax.swing.JMenuItem jMenuItemRegistro;
    private javax.swing.JMenuItem jMenuItemServQuarto;
    private javax.swing.JMenu jMenuRegistro;
    // End of variables declaration//GEN-END:variables
}