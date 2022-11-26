/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Yasmine.if
 */
public class cadastroFrame extends javax.swing.JFrame {

    /**
     * Creates new form cadastroFrame
     */
    public cadastroFrame() {
        initComponents();
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
        ComboBoxUf = new javax.swing.JComboBox<>();
        fone = new javax.swing.JLabel();
        caixaFone = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        caixaEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        complemento = new javax.swing.JLabel();
        caixaComplemento = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        feminino = new javax.swing.JRadioButton();
        Cadastrar = new javax.swing.JButton();
        masculino = new javax.swing.JRadioButton();
        Senha = new javax.swing.JLabel();
        naoINFORMAR = new javax.swing.JRadioButton();
        caixaComfirmSenha = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        confirmsenha = new javax.swing.JLabel();
        caixaEndereco = new javax.swing.JTextField();
        fone1 = new javax.swing.JLabel();
        numeroCasa = new javax.swing.JLabel();
        caixaFone1 = new javax.swing.JTextField();
        caixaNumeroCasa = new javax.swing.JTextField();
        caixasenha1 = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        caixaBairro = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        CadastroUsuário = new javax.swing.JLabel();
        NomeCompleto = new javax.swing.JLabel();
        caixaNome = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        caixaCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caixaRG = new javax.swing.JTextField();
        Sexo = new javax.swing.JLabel();
        caixacidade = new javax.swing.JTextField();
        UF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        ComboBoxUf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ComboBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        ComboBoxUf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fone.setText("Fone:");

        caixaFone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        caixaFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaFoneActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        email.setText("Email:");

        caixaEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Data de nascimento:");

        jTextField10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        complemento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        complemento.setText("Complemento:");

        caixaComplemento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        Voltar.setBackground(new java.awt.Color(0, 204, 204));
        Voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        feminino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        feminino.setText("Feminino ");

        Cadastrar.setBackground(new java.awt.Color(0, 204, 204));
        Cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        masculino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        masculino.setText("Masculino");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });

        Senha.setText("Senha:");

        naoINFORMAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        naoINFORMAR.setText("Prefiro não informar");

        caixaComfirmSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        endereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        endereco.setText("Endereço:");

        confirmsenha.setText("Comfirmação de senha:");

        caixaEndereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        caixaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaEnderecoActionPerformed(evt);
            }
        });

        fone1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fone1.setText("Telefone:");

        numeroCasa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroCasa.setText("N°:");

        caixaFone1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        caixaFone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaFone1ActionPerformed(evt);
            }
        });

        caixaNumeroCasa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        caixasenha1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bairro.setText("Bairro:");

        caixaBairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cidade.setText("Cidade:");

        CadastroUsuário.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CadastroUsuário.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastroUsuário.setText("Cadastro AirJava");

        NomeCompleto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NomeCompleto.setText("Nome completo:");

        caixaNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        CPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CPF.setText("CPF:");

        caixaCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        caixaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCPFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("RG:");

        caixaRG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        Sexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Sexo.setText("Sexo:");

        caixacidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        UF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UF.setText("UF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(endereco)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(feminino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(masculino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(naoINFORMAR))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(caixaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numeroCasa)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(caixaNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(complemento)
                                            .addGap(4, 4, 4)
                                            .addComponent(caixaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NomeCompleto)
                                .addComponent(CPF)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(caixaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caixaRG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Senha)
                                        .addComponent(email)
                                        .addComponent(confirmsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(caixaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(caixaComfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(caixasenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caixaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caixacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(UF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(fone)
                                        .addGap(11, 11, 11)
                                        .addComponent(caixaFone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fone1)
                                        .addGap(9, 9, 9)
                                        .addComponent(caixaFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(207, 207, 207)
                            .addComponent(CadastroUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(CadastroUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCompleto)
                    .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(caixaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(caixaRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sexo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(feminino)
                        .addComponent(masculino)
                        .addComponent(naoINFORMAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(endereco)
                        .addComponent(caixaNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroCasa)
                        .addComponent(complemento)
                        .addComponent(caixaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro)
                    .addComponent(caixaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade)
                    .addComponent(caixacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fone1)
                        .addComponent(caixaFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fone)
                        .addComponent(caixaFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(caixaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(caixasenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmsenha)
                    .addComponent(caixaComfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caixaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaCPFActionPerformed

    private void caixaFone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaFone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaFone1ActionPerformed

    private void caixaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaEnderecoActionPerformed

    private void masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masculinoActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        loginFrame lF = new loginFrame();
        lF.setVisible(true);
        dispose();

    }//GEN-LAST:event_CadastrarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        loginFrame lF = new loginFrame();
        lF.setVisible(true);
        dispose();

    }//GEN-LAST:event_VoltarActionPerformed

    private void caixaFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaFoneActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel CadastroUsuário;
    private javax.swing.JComboBox<String> ComboBoxUf;
    private javax.swing.JLabel NomeCompleto;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel UF;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel bairro;
    private javax.swing.JTextField caixaBairro;
    private javax.swing.JTextField caixaCPF;
    private javax.swing.JTextField caixaComfirmSenha;
    private javax.swing.JTextField caixaComplemento;
    private javax.swing.JTextField caixaEmail;
    private javax.swing.JTextField caixaEndereco;
    private javax.swing.JTextField caixaFone;
    private javax.swing.JTextField caixaFone1;
    private javax.swing.JTextField caixaNome;
    private javax.swing.JTextField caixaNumeroCasa;
    private javax.swing.JTextField caixaRG;
    private javax.swing.JTextField caixacidade;
    private javax.swing.JTextField caixasenha1;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel complemento;
    private javax.swing.JLabel confirmsenha;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JLabel fone;
    private javax.swing.JLabel fone1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton naoINFORMAR;
    private javax.swing.JLabel numeroCasa;
    // End of variables declaration//GEN-END:variables
}
