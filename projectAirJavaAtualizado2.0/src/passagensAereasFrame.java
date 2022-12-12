
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Luigi_IF
 */
public class passagensAereasFrame extends javax.swing.JFrame {
        public static String ORIGEM;
        public static String DESTINO;
        public static String DIAIDA;
        public static String DIAVOLTA;
        public static String MESIDA;
        public static String MESVOLTA;
        public static String ANOIDA;
        public static String ANOVOLTA;
        public static String ESCOLHADOSASSENTOS;
        
    /**
     * Creates new form passagensAereasFrame
     */
    public passagensAereasFrame() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        EscolhaOrigem = new javax.swing.JComboBox<>();
        EscolhaDestino = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DiaIda = new javax.swing.JComboBox<>();
        MesIda = new javax.swing.JComboBox<>();
        AnoIda = new javax.swing.JComboBox<>();
        DiaVolta = new javax.swing.JComboBox<>();
        MesVolta = new javax.swing.JComboBox<>();
        AnoVolta = new javax.swing.JComboBox<>();
        voltar = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        EscolhaOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscolhaOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rio Branco-AC ", "Maceió-AL", "Macapá-AP", "Manaus-AM", "Salvador-BA", "Fortaleza-CE", "Vitória-ES", "Goiânia-GO", "São Luís-MA", "Cuiabá-MT", "Campo Grande-MS", "Belo Horizonte-MG", "Belém=-PA", "João Pessoa-PB", "Curitiba-PR", "Recife-PE", "Teresinha-PI", "Rio de Janeiro-RJ", "Natal-RN", "Porto Alegre-RS", "Porto Velho-RO", "Boa Vista-RR", "Florianópolis-SC", "São Paulo-SP", "Aracaju-SE", "Palmas-TO", "Distrito Federal-DF" }));
        EscolhaOrigem.setBorder(null);
        EscolhaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolhaOrigemActionPerformed(evt);
            }
        });

        EscolhaDestino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscolhaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rio Branco-AC ", "Maceió-AL", "Macapá-AP", "Manaus-AM", "Salvador-BA", "Fortaleza-CE", "Vitória-ES", "Goiânia-GO", "São Luís-MA", "Cuiabá-MT", "Campo Grande-MS", "Belo Horizonte-MG", "Belém=-PA", "João Pessoa-PB", "Curitiba-PR", "Recife-PE", "Teresinha-PI", "Rio de Janeiro-RJ", "Natal-RN", "Porto Alegre-RS", "Porto Velho-RO", "Boa Vista-RR", "Florianópolis-SC", "São Paulo-SP", "Aracaju-SE", "Palmas-TO", "Distrito Federal-DF" }));
        EscolhaDestino.setBorder(null);
        EscolhaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolhaDestinoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setText("Air Java");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Escolha o destino");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Escolha a origem");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Data de ida");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Data de volta");

        DiaIda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiaIda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DiaIda.setBorder(null);

        MesIda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MesIda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));

        AnoIda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AnoIda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));

        DiaVolta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiaVolta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        MesVolta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MesVolta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        MesVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesVoltaActionPerformed(evt);
            }
        });

        AnoVolta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AnoVolta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));
        AnoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoVoltaActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(102, 102, 255));
        voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(new javax.swing.border.MatteBorder(null));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        Comprar.setBackground(new java.awt.Color(102, 102, 255));
        Comprar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Comprar.setText("comprar");
        Comprar.setBorder(new javax.swing.border.MatteBorder(null));
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Número do Assento:");

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1  ", "2  ", "3  ", "4  ", "5", "6  ", "7  ", "8  ", "9", "10", "11  ", "12  ", "13  ", "14", "15", "16", "17  ", "18  ", "19  ", "20  ", "21  ", "22  ", "23  ", "24  ", "25  ", "26", "27", "28  ", "29", "30  ", "31  ", "32", "33", "34", "35  ", "36", "37  ", "38  ", "39  ", "40  ", "41", "42  ", "43  ", "44", "45", "46  ", "47  ", "48  ", "49  ", "50  " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(4, 4, 4)
                                        .addComponent(DiaIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MesIda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AnoIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EscolhaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EscolhaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(30, 30, 30)
                                        .addComponent(DiaVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MesVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AnoVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EscolhaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(EscolhaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DiaIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(DiaVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
            String emailPassagens = cadastroFrame.EMAIL;

            ORIGEM = (String) EscolhaOrigem.getSelectedItem();
            DESTINO = (String) EscolhaDestino.getSelectedItem();
            DIAIDA = (String) DiaIda.getSelectedItem();
            int diaIdaInt = Integer.parseInt(DIAIDA);
            DIAVOLTA = (String) DiaVolta.getSelectedItem();
            int diaVoltaInt = Integer.parseInt(DIAVOLTA);
            MESIDA = (String) MesIda.getSelectedItem();
            MESVOLTA = (String) MesVolta.getSelectedItem();
            ANOIDA = (String) AnoIda.getSelectedItem();
            int anoIdaInt = Integer.parseInt(ANOIDA);
            ANOVOLTA = (String) AnoVolta.getSelectedItem();
            int anoVoltaInt = Integer.parseInt(ANOVOLTA);
            ESCOLHADOSASSENTOS = (String) jComboBox2.getSelectedItem();

        if(ORIGEM.equals(DESTINO) ){
            JOptionPane.showMessageDialog(rootPane, "Origem não pode ser iqual ao destino.");
        }else if(anoIdaInt > anoVoltaInt || anoVoltaInt < anoIdaInt){
            JOptionPane.showMessageDialog(rootPane, "Não é possível viajar no tempo.");
        }
        //data de ida
        else if(MESIDA.equals("fevereiro") && diaIdaInt == 29 || diaIdaInt == 30 || diaIdaInt == 31){
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESIDA.equals("abril")&& diaIdaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESIDA.equals("junho")&& diaIdaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESIDA.equals("setembro")&& diaIdaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESIDA.equals("novembro")&& diaIdaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }
        //Data de volta
        else if(MESVOLTA.equals("fevereiro") && diaVoltaInt == 29 || diaVoltaInt == 30 || diaVoltaInt == 31){
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESVOLTA.equals("abril")&& diaVoltaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESVOLTA.equals("junho")&& diaVoltaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESVOLTA.equals("setembro")&& diaVoltaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else if (MESVOLTA.equals("novembro")&& diaVoltaInt == 31 ) {
            JOptionPane.showMessageDialog(rootPane, "Dia não correspondente com o mês.");
        }else{
            try{
            minhasPassagens MP = new minhasPassagens();
            MP.setVisible(true);
            dispose();
   
            String reservaPassagens = "Usuário: " + emailPassagens + "\n" +"Origem: " + ORIGEM + "\n" + "Destino: " + DESTINO
            +"\n" + "diaIda: " + DIAIDA + "\n" + "diaVolta: " + DIAVOLTA +
            "\n" + "mesIda: " + MESIDA + "\n" + "mesVolta" + MESVOLTA + "\n" +
            "anoIda: " + ANOIDA + "\n" + "anoVolta: " + ANOVOLTA + "\n" +
            "QuantidadeAssento: " + ESCOLHADOSASSENTOS + "\n\n";

            String caminho =
            "C:\\Users\\Yasmine.if\\Documents\\NetBeansProjects\\projectAirJava4\\projectAirJavaAtualizado2.0\\src\\bancoDadosPassagens";

            File bancoDadosPassagens = new File(caminho);
            try (FileWriter wr = new FileWriter(bancoDadosPassagens, true)) {
                wr.write(reservaPassagens);
            }
            }catch (IOException ex) {
            Logger.getLogger(passagensAereasFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
    }//GEN-LAST:event_ComprarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        paginaPrincipalFrame PPF = new paginaPrincipalFrame();
        PPF.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void AnoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoVoltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoVoltaActionPerformed

    private void MesVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesVoltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesVoltaActionPerformed

    private void EscolhaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolhaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscolhaDestinoActionPerformed

    private void EscolhaOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolhaOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscolhaOrigemActionPerformed

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
            java.util.logging.Logger.getLogger(passagensAereasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passagensAereasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passagensAereasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passagensAereasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passagensAereasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnoIda;
    private javax.swing.JComboBox<String> AnoVolta;
    private javax.swing.JButton Comprar;
    private javax.swing.JComboBox<String> DiaIda;
    private javax.swing.JComboBox<String> DiaVolta;
    private javax.swing.JComboBox<String> EscolhaDestino;
    private javax.swing.JComboBox<String> EscolhaOrigem;
    private javax.swing.JComboBox<String> MesIda;
    private javax.swing.JComboBox<String> MesVolta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
