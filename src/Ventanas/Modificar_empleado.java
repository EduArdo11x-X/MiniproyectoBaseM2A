/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import Clases.Empleado;
import Clases.Validaciones;
import javax.swing.JOptionPane;
public class Modificar_empleado extends javax.swing.JFrame {

    String Ced_empleado = "";
    String Id_Empleado = "";
    String Area_Empleado = "";
    int hora_inicio = 0;
    int min_inicio = 0;
    int hora_fin = 0;
    int min_fin = 0;
    String horas_sem = "";
    String Horario_inicio = "";
    String Horario_fin = "";
    
    public Modificar_empleado() {
        initComponents();
        jBguardar3.setEnabled(false);
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
        jSiniciohoras = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSiniciominutos = new javax.swing.JSpinner();
        jSiniciohoras1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSiniciominutos1 = new javax.swing.JSpinner();
        jBguardar3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jLabel10.setText("MODIFICAR UN EMPLEADO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 20, 380, 40));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel1.setText("Cedula Empleado:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 166, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel2.setText("Id Empleado:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 166, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel3.setText("Area de empleado:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 165, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel4.setText("Hora de entrada:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel5.setText("Hora de salida:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 11)); // NOI18N
        jLabel6.setText("Horas a la semana:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 165, -1));

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
        jPanel4.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 30, 30));

        jSiniciohoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel4.add(jSiniciohoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText(":");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jSiniciominutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel4.add(jSiniciominutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jSiniciohoras1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel4.add(jSiniciohoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText(":");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jSiniciominutos1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel4.add(jSiniciominutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        jBguardar3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jBguardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jBguardar3.setText("MODIFICAR");
        jBguardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar3ActionPerformed(evt);
            }
        });
        jPanel4.add(jBguardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 273, 160, 40));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/deshacer.png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 273, 140, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

     ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jBguardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar3ActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Modificar_empleado(BaseD);
        Cerrar_BD(BaseD);
        jTextField1.setEditable(true);
    }//GEN-LAST:event_jBguardar3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Inicio vsar1 = new Inicio();
        vsar1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
     
    
    public void buscar(ObjectContainer basep) {//cargardatos

        jBguardar3.setEnabled(false);
        String CODIGOAux;
        CODIGOAux = jTextField1.getText();

        Registrar_Empleado EAux = new Registrar_Empleado();

        if (jTextField1.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese la cedula del empleado");
        } else {

            if (EAux.Comprobar_Empleado(basep, CODIGOAux) == 0) {
                
                JOptionPane.showMessageDialog(null, "El empleado no existe en la base de datos");
                LimpiarCampos();
                
            } else {
                
                Empleado Ebuscar = new Empleado(CODIGOAux, null, null, 0, 0, 0, 0, null, null, null);

                ObjectSet result = basep.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Empleado miE = new Empleado();

                    miE = (Empleado) result.get(i);
                    
                    jTextField1.setText(miE.getCed_empleado());
                    jTextField2.setText(miE.getId_Empleado());
                    jTextField3.setText(miE.getArea_Empleado());
                    jTextField6.setText(miE.getHoras_sem());
                    jSiniciohoras1.setValue(miE.getHora_inicio());
                    jSiniciominutos1.setValue(miE.getMin_inicio());
                    jSiniciohoras.setValue(miE.getHora_fin());
                    jSiniciominutos.setValue(miE.getMin_fin());
                    }

                    if (validarCampos(basep)) {
                    jBguardar3.setEnabled(true);
                }
                    
              
                jTextField1.setEditable(false);
            }

        }
    }
    
 public void asignarVariables(ObjectContainer basep) {
        Ced_empleado = jTextField1.getText();
        Id_Empleado = jTextField2.getText();
        Area_Empleado = jTextField3.getText();
        hora_inicio = (Integer) jSiniciohoras1.getValue();
        min_inicio = (Integer) jSiniciominutos1.getValue();
        hora_fin = (Integer) jSiniciohoras.getValue();
        min_fin = (Integer) jSiniciominutos.getValue();
        horas_sem = jTextField6.getText();
        String Ihora = String.valueOf(hora_inicio);
        String Imin = String.valueOf(min_inicio);
        String Fhora = String.valueOf(hora_fin);
        String Fmin = String.valueOf(min_fin);
        if (String.valueOf(hora_inicio).length() == 1) {
            Ihora="0"+Ihora;
        }
        if (String.valueOf(min_inicio).length() == 1) {
            Imin="0"+Imin;
        }
        
        if (String.valueOf(hora_fin).length() == 1) {
            Fhora="0"+Fhora;
        }
        if (String.valueOf(min_fin).length() == 1) {
            Fmin="0"+Fmin;
        }
        Horario_inicio = Ihora+":" + Imin;
        Horario_fin = Fhora + ":" + Fmin;
    }
 
 public static int Comprobar_Peliculas(ObjectContainer basep, String Ced_empleado) {

        Empleado Ebuscar = new Empleado(Ced_empleado, null, null, 0, 0, 0, 0, null, null, null);

        ObjectSet result = basep.get(Ebuscar);

        return result.size();
    }
       
 
 public boolean validarCampos(ObjectContainer basep) {
        Validaciones miValidaciones = new Validaciones();
        asignarVariables(basep);
        boolean ban_confirmar = true;

        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cedula");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarCedula(Ced_empleado)) {
                JOptionPane.showMessageDialog(this, "Cedula Invalida");
                ban_confirmar = false;
            }
        }

        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarid(Id_Empleado)) {
                JOptionPane.showMessageDialog(this, "ID invalido");
                ban_confirmar = false;
            }
        }
        
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el area en la que esta el empleado del cine");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(Area_Empleado)) {
                JOptionPane.showMessageDialog(this, "Area de empleado invalido");
                ban_confirmar = false;
            }
        }
        
        if (jTextField6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese horas a la semana");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(horas_sem)) {
                JOptionPane.showMessageDialog(this, "Horas a la semana invalido");
                ban_confirmar = false;
            }
        }
        
        return ban_confirmar;
    }
    
  
    
  public void Modificar_empleado(ObjectContainer basep) {
        if (!validarCampos(basep)) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
            //LimpiarCamposdeTexto();

        } else {
            if (validarCampos(basep)) {
            Empleado Emodi = new Empleado(jTextField1.getText(), null, null, 0, 0, 0, 0, null, null, null);
            ObjectSet result = basep.get(Emodi);
            Empleado emodificar = (Empleado) result.next();
            
            emodificar.setArea_Empleado(jTextField3.getText());
            emodificar.setHoras_sem(jTextField6.getText());
            emodificar.setHora_inicio((int) jSiniciohoras1.getValue());
            emodificar.setMin_inicio((int) jSiniciominutos1.getValue());
            emodificar.setHora_fin((int) jSiniciohoras.getValue());
            emodificar.setMin_fin((int) jSiniciominutos.getValue());

           

            basep.set(emodificar);
            JOptionPane.showMessageDialog(null, "El Empleado fue modificado exitosamente");
            LimpiarCampos();
        }
            

    }
  }
    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }

    public void LimpiarCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
         jSiniciohoras1.setValue(0);
        jSiniciominutos.setValue(0);
        jSiniciominutos1.setValue(0);
        jSiniciohoras.setValue(0);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton jBguardar3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
