/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import Clases.Pelicula;
import javax.swing.JOptionPane;


public class Eliminar_pelicula extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar_pelicula
     */
    public Eliminar_pelicula() {
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
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setText(" ");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 110, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("SELECCIONE UN CAMPO PARA BUSCAR UNA PELICULA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 360, 60));

        jLabel12.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel12.setText("ID :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, 30));

        jLabel14.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("ID DE PELICULA A ELIMINAR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 190, 40));

        jLabel13.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel13.setText("Filtro:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un campo:", "Ver todos", "ID", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, 30));

        Tabla.setBackground(new java.awt.Color(247, 247, 247));
        Tabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(0, 51, 153));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Actores", "Clasificacion", "Año Estreno", "Idioma", "Directores", "Duración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 700, 260));

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
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 30, 30));

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
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 30, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/deshacer.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

      ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Buscar_EstudianteID(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Eliminar_Estudiante(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_EliminarActionPerformed

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
        }
                         
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        Inicio v = new Inicio();
            v.setVisible(true); 
            
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void Buscar_EstudianteID(ObjectContainer basep) {

        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");

        } else {
            if (jComboBox1.getSelectedIndex() == 1) {

                Pelicula Ebuscar = new Pelicula(null, null, null, null, null, null, null , null, null);

                ObjectSet result = basep.get(Ebuscar);
                MostrarDatos(result);
            } else {
                if (jComboBox1.getSelectedIndex() == 2) {

                    String IDAux = JOptionPane.showInputDialog("Ingrese el ID a consultar");

                    Pelicula Ebuscar = new Pelicula(null, null, null, null, null, null, null , null, null);

                    ObjectSet result = basep.get(Ebuscar);
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
        String matrizpelicula[][] = new String[result.size()][7];

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "La pelicula no se encuentra en la base de datos");
        } else {
            for (int i = 0; i < result.size(); i++) {

                Pelicula miE = new Pelicula();

                miE = (Pelicula) result.get(i);
                matrizpelicula[i][0] = miE.getCod_Pelicula();
                matrizpelicula[i][1] = miE.getTitulo_pelicula();
                matrizpelicula[i][2] = miE.getActores();
                matrizpelicula[i][3] = miE.getClasificacion();
                matrizpelicula[i][4] = miE.getAnio_estreno();
                matrizpelicula[i][5] = miE.getIdioma();
                matrizpelicula[i][6] = miE.getDirectores();
                matrizpelicula[i][7] = miE.getDuracion();

                Tabla.setModel(new javax.swing.table.DefaultTableModel(matrizpelicula, new String[]{"Codigo", "Titulo", "Actores", "Clasificacion", "Año Estreno", "Idioms","Directores","Duracion"}));

            }
        }

    }
    
    public void Eliminar_Estudiante(ObjectContainer basep) {

        Registrar_pelicula Einterfaz = new Registrar_pelicula();//Crear un objeto de la clase Estudiantes para traer el metodo Comprobar_Estudiantes

        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Codigo no valido");
        } else {

            String IDE = jTextField2.getText();
            Pelicula Leliminar = new Pelicula(IDE, null, null, null, null, null, null , null, null);
            ObjectSet result = basep.get(Leliminar);

            if (Einterfaz.Comprobar_Peliculas(basep, IDE) == 0) {

                JOptionPane.showMessageDialog(null, "La pelicula no existe en la base de datos");

            } else {
                Pelicula Estudianteeliminar = (Pelicula) result.next();

                basep.delete(Estudianteeliminar);
                JOptionPane.showMessageDialog(null, "El pelicula fue eliminado de la base de datos exitosamente");
            }

        }

        //Borrar el campo de texto
        jTextField2.setText("");
    }

    public void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
            
            
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable Tabla;
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
