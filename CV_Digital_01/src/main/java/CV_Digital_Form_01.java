
import cv_digital_01.GerirPessoas;
import cv_digital_01.Pessoa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joaoc
 */
public class CV_Digital_Form_01 extends javax.swing.JFrame {

    /**
     * Creates new form CV_Digital_Form_01
     */
    public CV_Digital_Form_01() {
        initComponents();
    }
    
    private GerirPessoas gerirPessoas = new GerirPessoas();  // Instância global para gerir as pessoas
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomePessoaField = new javax.swing.JTextField();
        addPessoaButton = new javax.swing.JButton();
        listPessoasButton = new javax.swing.JButton();
        verCVButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        eventosField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailPessoaField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        nomePessoaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePessoaFieldActionPerformed(evt);
            }
        });

        addPessoaButton.setText("Add Pessoa");
        addPessoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPessoaButtonActionPerformed(evt);
            }
        });

        listPessoasButton.setText("Listar Pessoas");
        listPessoasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPessoasButtonActionPerformed(evt);
            }
        });

        verCVButton.setText("Ver CV");
        verCVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCVButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Eventos");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("CV Digital");

        jLabel4.setText("Email");

        emailPessoaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailPessoaFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomePessoaField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addPessoaButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(listPessoasButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(verCVButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eventosField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(335, 335, 335)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emailPessoaField)
                                    .addGap(232, 232, 232))))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomePessoaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailPessoaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(eventosField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPessoaButton)
                    .addComponent(listPessoasButton)
                    .addComponent(verCVButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomePessoaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePessoaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePessoaFieldActionPerformed

    private void addPessoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPessoaButtonActionPerformed
        String nome = nomePessoaField.getText();
        String email = emailPessoaField.getText();
        String eventos = eventosField.getText();

        Pessoa pessoaExistente = gerirPessoas.procurarPessoaPorEmail(email);

        if (pessoaExistente != null) {
            JOptionPane.showMessageDialog(this, "O email já existe no sistema!");
        } else {
            Pessoa novaPessoa = new Pessoa(nome, email, eventos);
            gerirPessoas.addPessoa(novaPessoa);
            JOptionPane.showMessageDialog(this, "Pessoa adicionada com sucesso!");
        }
    }//GEN-LAST:event_addPessoaButtonActionPerformed

    private void listPessoasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPessoasButtonActionPerformed
        LinkedList<Pessoa> lista = gerirPessoas.listarPessoas();
        StringBuilder pessoasList = new StringBuilder();

        for (Pessoa pessoa : lista) {
            pessoasList.append(pessoa.getNome()).append("\n");
        }

        jTextArea1.setText(pessoasList.toString());
    }//GEN-LAST:event_listPessoasButtonActionPerformed

    private void verCVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCVButtonActionPerformed
        String email = emailPessoaField.getText();
        Pessoa pessoa = gerirPessoas.procurarPessoaPorEmail(email);

        if (pessoa != null) {
            StringBuilder cv = new StringBuilder();
            cv.append("Nome: ").append(pessoa.getNome()).append("\n");
            cv.append("Email: ").append(pessoa.getEmail()).append("\n");
            cv.append("Eventos: ").append(pessoa.getEventos()).append("\n");
            jTextArea1.setText(cv.toString());
        } else {
            JOptionPane.showMessageDialog(this, "CV não encontrado!");
        }
    }//GEN-LAST:event_verCVButtonActionPerformed

    private void emailPessoaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailPessoaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailPessoaFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CV_Digital_Form_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CV_Digital_Form_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CV_Digital_Form_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CV_Digital_Form_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CV_Digital_Form_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPessoaButton;
    private javax.swing.JTextField emailPessoaField;
    private javax.swing.JTextField eventosField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton listPessoasButton;
    private javax.swing.JTextField nomePessoaField;
    private javax.swing.JButton verCVButton;
    // End of variables declaration//GEN-END:variables
}
