/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Empleado;
import Clases.Pelicula;
import static Ventanas.Registrar_pelicula.Cerrar_BD;
import static Ventanas.Registrar_pelicula.Comprobar_Peliculas;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Registrar_Empleado extends javax.swing.JFrame {
    
    String Ced_empleado = "";
    String Id_Empleado = "";
    String Area_Empleado = "";
    String Hora_Entrada = "";
    String Hora_salida= "";
    String horas_sem = "";

    /**
     * Creates new form Registrar_Empleado
     */
    public Registrar_Empleado() {
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
        jButton1 = new javax.swing.JButton();
        jSiniciohoras = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSiniciominutos = new javax.swing.JSpinner();
        jSiniciohoras1 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSiniciominutos1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/claqueta.png"))); // NOI18N
        jLabel10.setText("INGRESE UN EMPLEADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 20, 330, 40));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel1.setText("Cedula Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 97, 120, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 91, 166, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel2.setText("Id Empleado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 131, 166, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel3.setText("Area de empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 179, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 173, 165, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel4.setText("Hora de entrada");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 97, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel5.setText("Hora de salida");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 137, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel6.setText("Horas a la semana");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 179, -1, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 165, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar-datos.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jSiniciohoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel1.add(jSiniciohoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(":");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jSiniciominutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(jSiniciominutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jSiniciohoras1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel1.add(jSiniciohoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText(":");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jSiniciominutos1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(jSiniciominutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);

        Crear_E(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Inicio vsar1 = new Inicio();
        vsar1.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    public void asignarVariables(ObjectContainer basep) {
        Ced_empleado = jTextField1.getText();
        Id_Empleado = jTextField2.getText();
        Area_Empleado = jTextField3.getText();
        horas_sem = jTextField6.getText();
    }
    
     public void Crear_E(ObjectContainer basep) {
        
        

             Empleado Enuevo = new Empleado(Ced_empleado, Id_Empleado, Area_Empleado, Hora_Entrada, Hora_salida, horas_sem);

            if (Comprobar_Peliculas(basep, Ced_empleado) == 0) {
                basep.set(Enuevo);
                JOptionPane.showMessageDialog(null, "El Empleado se guardo correctamente");
                LimpiarCampos();
            } else {

                JOptionPane.showMessageDialog(null, "El Empleado ya existe");
            }

           jTextField1.setText("");

        
    }
     
      public static int Comprobar_Empleado(ObjectContainer basep, String Ced_empleado) {

        Empleado Ebuscar = new Empleado(Ced_empleado, null, null, null, null, null);

        ObjectSet result = basep.get(Ebuscar);

        return result.size();
    }
      
      public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
      
       public void LimpiarCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
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
