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


public class Modificar_pelicula extends javax.swing.JFrame {

     String CodPelicula = "";
    String TituloPelicula = "";
    String Duracion = "";
    String Actores = "";
    String Clasificacion = "";
    String AñoEstreno = "";
    String Categoria = "";
    String Idioma = "";
    String Direcctores = "";
    
    public Modificar_pelicula() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(595, 375));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel2.setText("Titulo Pelicula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 20));

        jLabel3.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel3.setText("MODIFICAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, 20));

        jLabel4.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel4.setText("Categoria:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel5.setText("Clasificacion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 40));

        jLabel6.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel6.setText("Año estreno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 40));

        jLabel7.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel7.setText("Idioma:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel8.setText("Directores:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 20));

        jLabel9.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel9.setText("Duración:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        jTextField2.setText(" ");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 110, -1));

        jComboBox1.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apto para todo publico", "Mayor de 18 años", "Bajo supervision de adultos" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        jComboBox2.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 110, -1));

        jComboBox3.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2021", "2022", "2023" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 100, -1));

        jTextField7.setText(" ");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 100, -1));

        jTextField8.setText(" ");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, -1));

        jTextField9.setText(" ");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 110, -1));

        jTextField10.setText(" ");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 100, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("MODIFICAR UNA PELICULA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 350, 40));

        jLabel11.setFont(new java.awt.Font("Copperplate", 3, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 40, 40));

        jBguardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(0, 0, 255));
        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/girar.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 30, 30));

        jTextField12.setText(" ");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 100, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel12.setText(" Codigo Pelicula a modificar:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel13.setText("Actores:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, 20));

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
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Modificar_Estudiante(BaseD);
        Cerrar_BD(BaseD);
        jTextField2.setEditable(true);
    }//GEN-LAST:event_jBguardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed
    
    
    public void buscar(ObjectContainer basep) {//cargardatos

        jBguardar.setEnabled(false);
        String IDAux;
        IDAux = jTextField2.getText();

        Pelicula EAux = new Pelicula();

        if (jTextField2.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else {

            if (EAux.Comprobar_Peliculas(basep, IDAux) == 0) {

                JOptionPane.showMessageDialog(null, "La pelicula no existe en la base de datos");
                LimpiarCamposTexto();

            } else {

                Pelicula Ebuscar = new Pelicula(IDAux, null, null, null, null, null, null, null , null);

                ObjectSet result = basep.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Pelicula miE = new Pelicula();

                    miE = (Pelicula) result.get(i);

                   
                    jTextField10.setText(miE.getTitulo_pelicula());
                    jTextField8.setText(miE.getDuracion());
                    jTextField7.setText(miE.getActores());
                    for (int j = 0; j < jComboBox1.getItemCount(); j++) {
                        if (miE.getClasificacion().equalsIgnoreCase(jComboBox1.getItemAt(j))) {
                            jComboBox1.setSelectedIndex(j);
                            j = jComboBox1.getItemCount();
                        }
                    }
                    for (int j = 0; j < jComboBox2.getItemCount(); j++) {
                        if (miE.getCategoria().equalsIgnoreCase(jComboBox2.getItemAt(j))) {
                            jComboBox2.setSelectedIndex(j);
                            j = jComboBox2.getItemCount();
                        }
                    }
                    for (int j = 0; j < jComboBox3.getItemCount(); j++) {
                        if (miE.getAnio_estreno().equalsIgnoreCase(jComboBox3.getItemAt(j))) {
                            jComboBox3.setSelectedIndex(j);
                            j = jComboBox3.getItemCount();
                        }
                    }
                    
                    jTextField12.setText(miE.getIdioma());
                    jTextField9.setText(miE.getDirectores());
                }
                
                HabilitarCampos_deTexto();
                jTextField2.setEditable(false);
            }

        }
    }
    
    public void Modificar_Estudiante(ObjectContainer basep) {

       
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
            //LimpiarCamposdeTexto();

         
            
                Pelicula Emodi = new Pelicula(jTextField2.getText(), null, null, null, null, null, null, null , null);
                ObjectSet result = basep.get(Emodi);
                Pelicula Emodificar = (Pelicula) result.next();
                Emodificar.setTitulo_pelicula(jTextField10.getText());
                Emodificar.setDuracion(jTextField8.getText());
                Emodificar.setActores(jTextField7.getText());
                Emodificar.setClasificacion(jComboBox1.getSelectedItem().toString());
                Emodificar.setCategoria(jComboBox2.getSelectedItem().toString());
                Emodificar.setAnio_estreno(jComboBox3.getSelectedItem().toString());
                Emodificar.setDirectores(jTextField9.getText());
                Emodificar.setIdioma(jTextField12.getText());
                basep.set(Emodificar);
                JOptionPane.showMessageDialog(null, "La pelicula fue modificada exitosamente");
                LimpiarCamposTexto();
            

       
    }

    
    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
    /**
     * @param args the command line arguments
     */
    
    
    public void LimpiarCamposTexto() {
        jTextField2.setText("");
        jTextField10.setText("");
        jTextField8.setText("");
        jTextField7.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField12.setText("");
        jTextField9.setText("");
    }
    
    public void HabilitarCampos_deTexto() {
        jTextField8.setEditable(true);
        jTextField10.setEditable(true);
        jTextField8.setEditable(true);
        jTextField7.setEditable(true);
        jComboBox1.setEditable(true);
        jComboBox3.setEditable(true);
        jComboBox2.setEditable(true);
        jTextField12.setEditable(true);
        jTextField9.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
