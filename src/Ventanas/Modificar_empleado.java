/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author EDU
 */
public class Modificar_empleado extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_empleado
     */
    public Modificar_empleado() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSiniciohoras = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSiniciominutos = new javax.swing.JSpinner();
        jSiniciohoras1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSiniciominutos1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jLabel10.setText("MODIFICAR UN EMPLEADO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 20, 380, 40));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel1.setText("Cedula Empleado");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 97, 120, -1));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 91, 166, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel2.setText("Id Empleado");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, -1, -1));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 131, 166, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel3.setText("Area de empleado");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 179, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 173, 165, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel4.setText("Hora de entrada");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel5.setText("Hora de salida");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 137, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel6.setText("Horas a la semana");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 179, -1, -1));
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 165, -1));

        Buscar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(0, 0, 255));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        Buscar.setToolTipText("Buscar");
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel4.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 30, 30));

        jBguardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(0, 0, 255));
        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/girar.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jPanel4.add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 30, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel7.setText("MODIFICAR");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, 20));

        jSiniciohoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel4.add(jSiniciohoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText(":");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jSiniciominutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel4.add(jSiniciominutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jSiniciohoras1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel4.add(jSiniciohoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText(":");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jSiniciominutos1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel4.add(jSiniciominutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

     //   ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
       // buscar(BaseD);
        //errar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed

        //ObjectContainer BaseD = Db4o.openFile(Principal.direccionBD);

        //Crear_E(BaseD);
        //Cerrar_BD(BaseD);
    }//GEN-LAST:event_jBguardarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSiniciohoras;
    private javax.swing.JSpinner jSiniciohoras1;
    private javax.swing.JSpinner jSiniciominutos;
    private javax.swing.JSpinner jSiniciominutos1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}