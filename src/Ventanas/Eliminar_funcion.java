/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cliente;
import Clases.Funcion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Eliminar_funcion extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar_funcion
     */
    public Eliminar_funcion() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaf = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablaf.setBackground(new java.awt.Color(247, 247, 247));
        Tablaf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Tablaf.setForeground(new java.awt.Color(0, 51, 153));
        Tablaf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Funcion", "Fecha Funcion", "Formato", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tablaf);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 680, 240));

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("SELECCIONE UN CAMPO PARA BUSCAR UNA FUNCION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 360, 60));

        jLabel14.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("ID DE FUNCION A ELIMINAR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 190, 40));

        jTextField2.setText(" ");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, 30));

        jLabel12.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel12.setText("ID :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 30));

        Eliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 0, 255));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        Eliminar.setToolTipText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.setBorderPainted(false);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 30, 30));

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
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 30, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un campo:", "Ver todos", "ID Funcion", "Formato" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel13.setText("Filtro:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/deshacer.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Eliminar_Funcion(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Buscar_Funcion(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.dispose();
        Inicio ef = new Inicio();
        ef.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
if (jComboBox1.getSelectedIndex() == 0) {
            //deshabilitarParametros();
        } else {
            if (jComboBox1.getSelectedIndex() == 1) {
               // deshabilitarParametros();
            } else {
                if (jComboBox1.getSelectedIndex() == 2) {
                   // deshabilitarParametros();
                } else {
                    if (jComboBox1.getSelectedIndex() == 3) {
                       // habilitarParametros();
                    }
                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void Buscar_Funcion(ObjectContainer basep) {

        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");

        } else {
            if (jComboBox1.getSelectedIndex() == 1) {

        Funcion Fbuscar = new Funcion(null, null, null, null);

                ObjectSet result = basep.get(Fbuscar);
                MostrarDatos(result);
            } else {
                if (jComboBox1.getSelectedIndex() == 2) {

                    String IDAux = JOptionPane.showInputDialog("Ingrese la Cedula a consultar");

        Funcion Fbuscar = new Funcion(null, null, null, null);

                    ObjectSet result = basep.get(Fbuscar);
                    MostrarDatos(result);

                } else {
                    if (jComboBox1.getSelectedIndex() == 3) {
//                        habilitarParametros();
                       // BuscarParametros(basep);

                    }
                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        jComboBox1.setSelectedIndex(0);
    }
    public void MostrarDatos(ObjectSet result) {
        String matrizfuncion[][] = new String[result.size()][7];

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "La pelicula no se encuentra en la base de datos");
        } else {
            for (int i = 0; i < result.size(); i++) {

                Funcion miF = new Funcion();

                miF = (Funcion) result.get(i);
                matrizfuncion[i][0] = miF.getId_funcion();
                matrizfuncion[i][1] = miF.getFecha_funcion();
                matrizfuncion[i][2] = miF.getFormato();
                matrizfuncion[i][3] = miF.getHora();
               

                Tablaf.setModel(new javax.swing.table.DefaultTableModel(matrizfuncion, new String[]{"Cedula", "Nombre", "Direccion", "Edad", "Correo Electronico", "Telefono","Fecha Nacimiento","Membresia"}));

            }
        }

    }
    
    public void Eliminar_Funcion(ObjectContainer basep) {

        Registrar_funcion Finterfaz = new Registrar_funcion();//Crear un objeto de la clase Estudiantes para traer el metodo Comprobar_Estudiantes

        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Codigo no valido");
        } else {

            String IDE = jTextField2.getText();
        Funcion Feliminar = new Funcion(null, null, null, null);
            ObjectSet result = basep.get(Feliminar);

            if (Finterfaz.Comprobar_Funcion(basep, IDE) == 0) {

                JOptionPane.showMessageDialog(null, "La funcion no existe en la base de datos");

            } else {
                Funcion Funcioneliminar = (Funcion) result.next();

                basep.delete(Funcioneliminar);
                JOptionPane.showMessageDialog(null, "La funcion fue eliminado de la base de datos exitosamente");
            }

        }

        //Borrar el campo de texto
        jTextField2.setText("");
    }

    public void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
            
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable Tablaf;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
