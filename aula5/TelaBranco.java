/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import Ferramentas.CaixaDeDialogo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author vinicius.henicka
 */
public class TelaBranco extends javax.swing.JFrame {

    ContaBancaria objConta1;
    ContaBancaria objConta2;
    DefaultComboBoxModel modelContas;

    public TelaBranco() {
        initComponents();
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        objConta1 = new ContaBancaria();
        objConta1.setNomeTitular("Vinicius");
        objConta1.setNumero(111);
        objConta1.setSaldo(300);

        listaContas.add(objConta1);

        objConta2 = new ContaBancaria();
        objConta2.setNomeTitular("Joao");
        objConta2.setNumero(333);
        objConta2.setSaldo(1000);

        listaContas.add(objConta2);

        modelContas = new DefaultComboBoxModel();
        listaContas.forEach(objeto -> {
            modelContas.addElement(objeto);
        });

        modelContas = new DefaultComboBoxModel();
        listaContas.forEach(objeto -> {
            modelContas.addElement(objeto);
        });

    }

    private void atualizarSaldo() {
        txtValorConta1.setText("");
        txtValorConta2.setText("");
        lblSaldoConta1.setText("Saldo: " + objConta1.getSaldo());
        lblSaldoConta2.setText("Saldo: " + objConta2.getSaldo());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSacarConta = new javax.swing.JButton();
        btnDepositarConta = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        cmbContas1 = new javax.swing.JLabel();
        cmbContas2 = new javax.swing.JLabel();
        lblNomeConta1 = new javax.swing.JLabel();
        lblNumeroConta1 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblNomeConta2 = new javax.swing.JLabel();
        lblNumeroConta2 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        txtValorConta1 = new javax.swing.JTextField();
        btnDepositarConta2 = new javax.swing.JButton();
        btnTransferir2 = new javax.swing.JButton();
        txtValorConta2 = new javax.swing.JTextField();
        btnSacarConta2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblChequeEspecial = new javax.swing.JLabel();
        lblChequeEspecial2 = new javax.swing.JLabel();
        cbmContas = new javax.swing.JComboBox<>();
        cbmContas2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSacarConta.setText("Sacar");
        btnSacarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarContaActionPerformed(evt);
            }
        });

        btnDepositarConta.setText("Depositar");
        btnDepositarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarContaActionPerformed(evt);
            }
        });

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        cmbContas1.setText("           Conta1");

        cmbContas2.setText("             Conta2");

        lblNomeConta1.setText("Nome :");

        lblNumeroConta1.setText("Conta :");

        lblSaldoConta1.setText("Saldo : R$ ");

        lblNomeConta2.setText("Nome :");

        lblNumeroConta2.setText("Conta :");

        lblSaldoConta2.setText("Saldo : R$ ");

        txtValorConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorConta1ActionPerformed(evt);
            }
        });

        btnDepositarConta2.setText("Depositar");
        btnDepositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta2ActionPerformed(evt);
            }
        });

        btnTransferir2.setText("Transferir");
        btnTransferir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferir2ActionPerformed(evt);
            }
        });

        txtValorConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorConta2ActionPerformed(evt);
            }
        });

        btnSacarConta2.setText("Sacar");
        btnSacarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/a4d6283d1dd320878460299a5c3bd5c0_1.png"))); // NOI18N

        lblChequeEspecial.setText("ChequeE");

        lblChequeEspecial2.setText("ChequeE");

        cbmContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmContasActionPerformed(evt);
            }
        });

        cbmContas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmContas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbmContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbmContas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbContas1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnDepositarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSacarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorConta1))
                            .addComponent(lblChequeEspecial)
                            .addComponent(lblSaldoConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtValorConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSacarConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDepositarConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransferir2))
                        .addComponent(lblNumeroConta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSaldoConta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChequeEspecial2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(cmbContas2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbmContas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmContas2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbContas1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbContas2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNomeConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblChequeEspecial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSacarConta)
                        .addGap(11, 11, 11)
                        .addComponent(btnDepositarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTransferir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblNomeConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblChequeEspecial2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSacarConta2)
                        .addGap(11, 11, 11)
                        .addComponent(btnDepositarConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTransferir2)))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarContaActionPerformed

        try {
            double valorSaque = Double.parseDouble(txtValorConta1.getText());
            boolean resposta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Confirmação de saque no valor de : " + valorSaque + "?", "Confirmação", 'p');

            if (resposta == true) {

            }
            if (objConta1.sacar(valorSaque)) {

                atualizarSaldo();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso ", "i");
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente ", "e");
            }

        } catch (NumberFormatException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), "e");
        }


    }//GEN-LAST:event_btnSacarContaActionPerformed

    private void btnDepositarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarContaActionPerformed
        // TODO add your handling code here:

        double valorDeposito = Double.parseDouble(txtValorConta1.getText());
        objConta1.depositar(valorDeposito);
        atualizarSaldo();

    }//GEN-LAST:event_btnDepositarContaActionPerformed

    private void txtValorConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorConta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorConta1ActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
        double valorTransferencia = Double.parseDouble(txtValorConta1.getText());
        if (objConta2.transferir(valorTransferencia, objConta1)) {
            atualizarSaldo();

        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnDepositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta2ActionPerformed
        // TODO add your handling code here:
        double valorDeposito = Double.parseDouble(txtValorConta2.getText());
        objConta2.depositar(valorDeposito);
        atualizarSaldo();
    }//GEN-LAST:event_btnDepositarConta2ActionPerformed

    private void btnTransferir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferir2ActionPerformed
        // transferir da conta 1 pra conta 2
        double valorTransferencia = Double.parseDouble(txtValorConta2.getText());
        if (objConta1.transferir(valorTransferencia, objConta2)) {
            atualizarSaldo();
        }
    }//GEN-LAST:event_btnTransferir2ActionPerformed

    private void txtValorConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorConta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorConta2ActionPerformed

    private void btnSacarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta2ActionPerformed
        // TODO add your handling code here:
        try {
            double valorSaque = Double.parseDouble(txtValorConta2.getText());
            if (objConta2.sacar(valorSaque)) {

                atualizarSaldo();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso ", "i");
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente ", "e");
            }

        } catch (NumberFormatException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), "e");
        }

    }//GEN-LAST:event_btnSacarConta2ActionPerformed

    private void cbmContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmContasActionPerformed
        // TODO add your handling code here:
        objConta1 = (ContaBancaria) cbmContas.getSelectedItem();

        lblNomeConta1.setText("nome : " + objConta1.getNomeTitular());
        lblNumeroConta1.setText("Conta: " + objConta1.getNumero());
        lblSaldoConta1.setText("Saldo : R$ " + objConta1.getSaldo());
        txtValorConta1.setText("");

    }//GEN-LAST:event_cbmContasActionPerformed

    private void cbmContas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmContas2ActionPerformed
        // TODO add your handling code here:
        objConta1 = (ContaBancaria) cbmContas.getSelectedItem();

        lblNomeConta2.setText("nome : " + objConta2.getNomeTitular());
        lblNumeroConta2.setText("Conta: " + objConta2.getNumero());
        lblSaldoConta2.setText("Saldo : R$ " + objConta2.getSaldo());
        txtValorConta2.setText("");

    }//GEN-LAST:event_cbmContas2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBranco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBranco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBranco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBranco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaBranco().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta;
    private javax.swing.JButton btnDepositarConta2;
    private javax.swing.JButton btnSacarConta;
    private javax.swing.JButton btnSacarConta2;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnTransferir2;
    private javax.swing.JComboBox<String> cbmContas;
    private javax.swing.JComboBox<String> cbmContas2;
    private javax.swing.JLabel cmbContas1;
    private javax.swing.JLabel cmbContas2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblChequeEspecial;
    private javax.swing.JLabel lblChequeEspecial2;
    private javax.swing.JLabel lblNomeConta1;
    private javax.swing.JLabel lblNomeConta2;
    private javax.swing.JLabel lblNumeroConta1;
    private javax.swing.JLabel lblNumeroConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JTextField txtValorConta1;
    private javax.swing.JTextField txtValorConta2;
    // End of variables declaration//GEN-END:variables
}