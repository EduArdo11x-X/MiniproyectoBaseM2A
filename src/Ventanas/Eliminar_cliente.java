<<<<<<< HEAD
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
public class Eliminar_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar_cliente
     */
    public Eliminar_cliente() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("SELECCIONE UN CAMPO PARA BUSCAR CLIENTE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 360, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un campo:", "Ver todos", "Cedula Empleado", "ID Empleado", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel13.setText("Filtro:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 30));

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
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 30, 30));

        jLabel14.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("ID DE CLIENTE A ELIMINAR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 190, 40));

        jLabel12.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel12.setText("ID : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 61, -1, 30));

        jTextField2.setText(" ");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 61, 110, 30));

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
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 61, 30, 30));

        Tabla.setBackground(new java.awt.Color(247, 247, 247));
        Tabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(0, 51, 153));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Direccion", "Edad", "Correo", "Telefono", "Fecha nacimiento", "Membresia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 109, 749, 242));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/deshacer.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        //  ObjectContainer BaseD = Db4o.openFile(Principal.direccionBD);
        //Buscar_EstudianteID(BaseD);
        //Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        //ObjectContainer BaseD = Db4o.openFile(Principal.direccionBD);
        //Eliminar_Estudiante(BaseD);
        //Cerrar_BD(BaseD);
    }//GEN-LAST:event_EliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        this.dispose();
       Inicio ecli = new Inicio ();
       ecli.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton2;
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
=======
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
public class Eliminar_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar_cliente
     */
    public Eliminar_cliente() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("SELECCIONE UN CAMPO PARA BUSCAR CLIENTE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 360, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un campo:", "Ver todos", "Cedula Empleado", "ID Empleado", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel13.setText("Filtro:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 30));

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
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 30, 30));

        jLabel14.setFont(new java.awt.Font("Copperplate", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("ID DE CLIENTE A ELIMINAR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 190, 40));

        jLabel12.setFont(new java.awt.Font("Copperplate", 3, 13)); // NOI18N
        jLabel12.setText("ID : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 61, -1, 30));

        jTextField2.setText(" ");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 61, 110, 30));

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
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 61, 30, 30));

        Tabla.setBackground(new java.awt.Color(247, 247, 247));
        Tabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(0, 51, 153));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Direccion", "Edad", "Correo", "Telefono", "Fecha nacimiento", "Membresia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 109, 749, 242));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/deshacer.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        //  ObjectContainer BaseD = Db4o.openFile(Principal.direccionBD);
        //Buscar_EstudianteID(BaseD);
        //Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        //ObjectContainer BaseD = Db4o.openFile(Principal.direccionBD);
        //Eliminar_Estudiante(BaseD);
        //Cerrar_BD(BaseD);
    }//GEN-LAST:event_EliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        this.dispose();
       Inicio ecli = new Inicio ();
       ecli.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton2;
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
>>>>>>> parent of 1ad8ff9 (BASE DE DATOS DE CLIENTE)
