/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import javax.swing.JOptionPane;

/**
 *
 * @author salmo
 */
public class JFrameInicio extends javax.swing.JFrame {
    Conta c1;
    ContaPoupanca c2;
    ContaEspecial c3;
    /**
     * Creates new form JFrameInicio
     * @param c1
     * @param c2
     * @param c3
     */
    public JFrameInicio(Conta c1, ContaPoupanca c2, ContaEspecial c3) {
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonSaque = new javax.swing.JButton();
        buttonDeposito = new javax.swing.JButton();
        buttonTransferencia = new javax.swing.JButton();
        buttonReajustar = new javax.swing.JButton();
        buttonVerSaldos = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setText("Selecione a operação desejada:");

        buttonSaque.setText("Saque");
        buttonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaqueActionPerformed(evt);
            }
        });

        buttonDeposito.setText("Depósito");
        buttonDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDepositoActionPerformed(evt);
            }
        });

        buttonTransferencia.setText("Transferência");
        buttonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferenciaActionPerformed(evt);
            }
        });

        buttonReajustar.setText("Reajustar");
        buttonReajustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReajustarActionPerformed(evt);
            }
        });

        buttonVerSaldos.setText("Ver saldos");
        buttonVerSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerSaldosActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonVerSaldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonReajustar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSair, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSaque)
                    .addComponent(buttonDeposito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTransferencia)
                    .addComponent(buttonReajustar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVerSaldos)
                    .addComponent(buttonSair))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaqueActionPerformed
        JFrameSaque saqueFrame = new JFrameSaque(this.c1,this.c2,this.c3);
        this.setVisible(false);
        saqueFrame.setVisible(true);
        
    }//GEN-LAST:event_buttonSaqueActionPerformed

    private void buttonDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDepositoActionPerformed
        JFrameDeposito depositoFrame = new JFrameDeposito(this.c1,this.c2,this.c3);
        this.setVisible(false);
        depositoFrame.setVisible(true);
        
    }//GEN-LAST:event_buttonDepositoActionPerformed

    private void buttonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferenciaActionPerformed
        JFrameTransferencia transferenciaFrame = new JFrameTransferencia(this.c1,this.c2,this.c3);
        this.setVisible(false);
        transferenciaFrame.setVisible(true);
    }//GEN-LAST:event_buttonTransferenciaActionPerformed

    private void buttonReajustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReajustarActionPerformed
        /*JFrameReajustar reajustarFrame = new JFrameReajustar(this.c1,this.c2,this.c3);
        this.setVisible(false);
        reajustarFrame.setVisible(true);*/
        double taxa=0;
        int numeroConta;
        
        numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta poupança (Ex: 6040):","Reajuste",JOptionPane.QUESTION_MESSAGE));
        
        try{
            taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de reajuste (Ex: 5%):","Reajuste",JOptionPane.QUESTION_MESSAGE));
            if(numeroConta == c2.getNumero()){
                c2.reajustar(taxa);
                JOptionPane.showMessageDialog(null,"Ajuste realizado com sucesso.","Reajuste",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Número de conta poupança inválido.","Reajuste",JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(java.lang.NumberFormatException e){
            if(numeroConta == c2.getNumero()){
                c2.reajustar();
                JOptionPane.showMessageDialog(null,"Ajuste realizado com sucesso.","Reajuste",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Número de conta poupança inválido.","Reajuste",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
        System.out.println(taxa);
        
        
    }//GEN-LAST:event_buttonReajustarActionPerformed

    private void buttonVerSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerSaldosActionPerformed
        JFrameVerSaldos verSaldoFrame = new JFrameVerSaldos(this.c1,this.c2,this.c3);
        this.setVisible(false);
        verSaldoFrame.setVisible(true);
    }//GEN-LAST:event_buttonVerSaldosActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeposito;
    private javax.swing.JButton buttonReajustar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSaque;
    private javax.swing.JButton buttonTransferencia;
    private javax.swing.JButton buttonVerSaldos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}