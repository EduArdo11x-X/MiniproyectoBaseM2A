/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
//Import Clases.Boleto;
public class Boleto extends javax.swing.JFrame {

    /**
     * Creates new form Boleto
     */
    public Boleto() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        boleto = new javax.swing.JTextField();
        cedclientboleto = new javax.swing.JTextField();
        cedemplboleto = new javax.swing.JTextField();
        peliculaboleto = new javax.swing.JTextField();
        boletofc = new javax.swing.JTextField();
        boletohc = new javax.swing.JTextField();
        funcionidboleto = new javax.swing.JTextField();
        salaboleto = new javax.swing.JTextField();
        horafunboleto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 73, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CINE CINEMANIA ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 42, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boleto ID : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 165, 97, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cédula Cliente : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cédula Empleado : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 254, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Función ID : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 127, 96, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Compra  : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 297, -1, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Título Pelicula :  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 165, -1, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Genero : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 210, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 363, -1, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hora Función  : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 340, -1, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 427, -1, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora Compra : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sala  ID  : ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 254, -1, -1));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número de butaca  : ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 297, -1, -1));

        boleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boletoActionPerformed(evt);
            }
        });
        jPanel1.add(boleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 162, 160, -1));
        jPanel1.add(cedclientboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 207, 160, -1));
        jPanel1.add(cedemplboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 251, 160, -1));

        peliculaboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculaboletoActionPerformed(evt);
            }
        });
        jPanel1.add(peliculaboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 162, 227, -1));
        jPanel1.add(boletofc, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 294, 160, -1));
        jPanel1.add(boletohc, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 337, 160, -1));

        funcionidboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionidboletoActionPerformed(evt);
            }
        });
        jPanel1.add(funcionidboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 124, 160, -1));
        jPanel1.add(salaboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 251, 160, -1));
        jPanel1.add(horafunboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 337, 160, -1));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 42, -1, -1));

        jButton3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton3.setText("GUARDAR");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 99, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-guardar-40.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Comedia", "Acción", "Drama", "Aventura", "Ciencia Ficción", "Fantasia", "Suspenso" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 160, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 294, 160, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-palomitas-40.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 34, -1, -1));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 820, 480));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peliculaboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculaboletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peliculaboletoActionPerformed

    private void boletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boletoActionPerformed

    private void funcionidboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionidboletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionidboletoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Inicio ini = new Inicio ();
        ini.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boleto;
    private javax.swing.JTextField boletofc;
    private javax.swing.JTextField boletohc;
    private javax.swing.JTextField cedclientboleto;
    private javax.swing.JTextField cedemplboleto;
    private javax.swing.JTextField funcionidboleto;
    private javax.swing.JTextField horafunboleto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField peliculaboleto;
    private javax.swing.JTextField salaboleto;
    // End of variables declaration//GEN-END:variables
}
