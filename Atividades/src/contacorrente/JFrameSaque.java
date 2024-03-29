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
public class JFrameSaque extends javax.swing.JFrame {
    Conta c1;
    ContaPoupanca c2;
    ContaEspecial c3;
    /**
     * Creates new form JFrameSaque
     * @param c1
     * @param c2
     * @param c3
     */
    public JFrameSaque(Conta c1, ContaPoupanca c2, ContaEspecial c3) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNConta = new javax.swing.JTextField();
        textValor = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setText("Saque:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nº da conta:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Valor R$:");

        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(buttonOk, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textValor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(buttonMenu)
                            .addComponent(textNConta))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOk)
                    .addComponent(buttonMenu))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        //FLAG PARA VERIFICAR SE USUÁRIO SEGUIU COM A OPERAÇÃO OU NÃO (SIM/NÃO)
        int flag;
            //VERIFICA SE O NUMERO DA CONTA DIGITADO É IGUAL AO CADASTRADO NO SISTEMA DA CONTA 1.
        if( Integer.parseInt(textNConta.getText()) == c1.getNumero() ){
            //FLAG RECEBE O VALOR ESCOLHIDO PELO USURÁIO (SIM/NÃO).
            flag = JOptionPane.showConfirmDialog(null,c1.getNome() + ", você confirma essa operação ?","Saque",JOptionPane.YES_NO_OPTION);
            //O USUÁRIO CONFIRMA A OPERAÇÃO.
            if(flag == JOptionPane.YES_OPTION){
                JFrameInicio inicio = new JFrameInicio(this.c1, this.c2, this.c3);
                //VERIRICA SE SALDO É MENOR QUE VALOR DE SAQUE SOLICITADO.
                if(c1.getSaldo() < Double.parseDouble(textValor.getText())){
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente.","Saque",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    c1.sacar(Double.parseDouble(textValor.getText()));
                    JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso.","Saque",JOptionPane.INFORMATION_MESSAGE);
                }
                //FECHA TELA DE SAQUE E VOLTA AO MENU PRINCIPAL.
                this.setVisible(false);
                inicio.setVisible(true);
            }
            else{//MUDOU DE IDEIA, NÃO DESEJA EFETUAR A OPERAÇÃO.
                    JOptionPane.showMessageDialog(null,"Operação cancelada.","Saque",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        else//VERIFICA SE O NUMERO DA CONTA DIGITADO É IGUAL AO CADASTRADO NO SISTEMA DA CONTA 2.
        if( Integer.parseInt(textNConta.getText()) == c2.getNumero() ){
                flag = JOptionPane.showConfirmDialog(null,c2.getNome() + ", você confirma essa operação ?","Saque",JOptionPane.YES_NO_OPTION);
                if(flag == JOptionPane.YES_OPTION){
                    JFrameInicio inicio = new JFrameInicio(this.c1, c2, this.c3);
                    
                    if(c2.getSaldo() < Double.parseDouble(textValor.getText())){
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente.","Saque",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        c2.sacar(Double.parseDouble(textValor.getText()));
                        JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso.","Saque",JOptionPane.INFORMATION_MESSAGE);
                    }
                    this.setVisible(false);
                    inicio.setVisible(true);
                }
                else{
                       JOptionPane.showMessageDialog(null,"Operação cancelada.","Saque",JOptionPane.INFORMATION_MESSAGE);
                }
                
        }
        else//VERIFICA SE O NUMERO DA CONTA DIGITADO É IGUAL AO CADASTRADO NO SISTEMA DA CONTA 3.
        if( Integer.parseInt(textNConta.getText()) == c3.getNumero() ){
            flag = JOptionPane.showConfirmDialog(null,c3.getNome() + ", você confirma essa operação ?","Saque",JOptionPane.YES_NO_OPTION);
            if(flag == JOptionPane.YES_OPTION){
                JFrameInicio inicio = new JFrameInicio(this.c1, this.c2, this.c3);
                if( c3.getSaldo() < Double.parseDouble(textValor.getText()) ){
                    //VERIFICA SE SALDO+LIMITE É >= AO VALOR DE SAQUE SOLICITADO.
                    if( (c3.getSaldo() + c3.getLimite()) >= Double.parseDouble(textValor.getText()) ){  
                        c3.sacar(Double.parseDouble(textValor.getText()));//SACA O VALOR DESEJADO
                        c3.descontar(c3.getMulta());//APLICA O VALOR DA MULTA EM CIMA DO NOVO SALDO.
                        JOptionPane.showMessageDialog(null,"Saque efetuado usando cheque especial.","Saque",JOptionPane.INFORMATION_MESSAGE);
                    }else//SE NEM COM CHEQUE ESPECIAL O SAQUE PODE SER EFETUADO, ENTÃO NÃO HÁ SALDO.
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente.","Saque",JOptionPane.INFORMATION_MESSAGE);
                }  
                else{//SE O SALDO NÃO É MENOR, ENTÃO SAQUE PODE SER EFETUADO. 
                    c3.sacar(Double.parseDouble(textValor.getText()));
                    JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso.","Saque",JOptionPane.INFORMATION_MESSAGE);
                }    
                this.setVisible(false);
                inicio.setVisible(true);
            }
            else{
                    JOptionPane.showMessageDialog(null,"Operação cancelada.","Saque",JOptionPane.INFORMATION_MESSAGE);
                }     
        }
        else{//O NUMERO DA CONTA NÃO CORRESPONDE A NENHUMA CADASTRADA NO SISTEMA.
            JOptionPane.showMessageDialog(null,"Número da conta inválido.","Warning",JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_buttonOkActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        JFrameInicio inicio = new JFrameInicio(this.c1,this.c2,this.c3);
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_buttonMenuActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textNConta;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
