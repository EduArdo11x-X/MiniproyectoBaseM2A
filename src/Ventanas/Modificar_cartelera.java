/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cartelera;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import Clases.Validaciones;
import javax.swing.JOptionPane;

public class Modificar_cartelera extends javax.swing.JFrame {

    String Cod_Cartelera = "";
    String Titulo_pelicula = "";
    String Fecha_estreno = "";
    String Genero = "";
    String Clasificacion = "";
    int dia = 0;
    int mes = 0;
    int anio = 0;

    public Modificar_cartelera() {
        initComponents();
        jButton1.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        dia_cli = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        mes_cli = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        anio_cli = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(601, 380));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Estreno  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 179, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel2.setText("Titulo pelicula  : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel1.setText("Codigo cartelera a modificar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 210, 20));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 190, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 166, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel5.setText("Clasificacion :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel4.setText("Genero :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jLabel10.setText("MODIFICAR NUEVA CARTELERA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 20, 430, 40));

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
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 30, 30));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 120, 30));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 120, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/deshacer.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Comedia", "Acción", "Drama", "Aventura", "Ciencia Ficción", "Fantasia", "Suspenso" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 150, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion", "Apto para todo publico", "Mayor de 18 años", "Bajo supervision de adultos" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, 30));

        dia_cli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(dia_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 40, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText(":");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 10, -1));

        mes_cli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel1.add(mes_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText(":");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        anio_cli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel1.add(anio_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Inicio mc = new Inicio();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ObjectContainer BaseD = Db4o.openFile(Inicio.direccionBD);
        Modificar_cartelera(BaseD);
        Cerrar_BD(BaseD);
        jTextField1.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void buscar(ObjectContainer basep) {//cargardatos

        jButton1.setEnabled(false);
        String CODIGOAux;
        CODIGOAux = jTextField1.getText();
        Registrar_cartelera EAux = new Registrar_cartelera();
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una Cedula");
        } else {
            if (EAux.Comprobar_cartelera(basep, CODIGOAux) == 0) {
                JOptionPane.showMessageDialog(null, "El cliente no existe en la base de datos");
                LimpiarCamposTexto();
            } else {
                Cartelera Clbuscar = new Cartelera(CODIGOAux, null, null, null, null, 0, 0, 0);
                ObjectSet result = basep.get(Clbuscar);
                for (int i = 0; i < result.size(); i++) {
                    Cartelera miCl = new Cartelera();
                    miCl = (Cartelera) result.get(i);
                    jTextField1.setText(miCl.getCod_Cartelera());
                    jTextField2.setText(miCl.getTitulo_pelicula());
                    for (int j = 0; j < jComboBox1.getItemCount(); j++) {
                        if (miCl.getGenero().equalsIgnoreCase(jComboBox1.getItemAt(j))) {
                            jComboBox1.setSelectedIndex(j);
                            j = jComboBox1.getItemCount();
                        }
                    }
                    for (int j = 0; j < jComboBox2.getItemCount(); j++) {
                        if (miCl.getClasificacion().equalsIgnoreCase(jComboBox2.getItemAt(j))) {
                            jComboBox2.setSelectedIndex(j);
                            j = jComboBox2.getItemCount();
                        }
                    }

                    dia_cli.setValue(miCl.getDia());
                    mes_cli.setValue(miCl.getMes());
                    anio_cli.setValue(miCl.getAnio());

                }

                if (validarCampos(basep)) {
                    jButton1.setEnabled(true);
                }

                HabilitarCampos_deTexto();
                jTextField1.setEditable(false);
            }

        }
    }

    public boolean validarCampos(ObjectContainer basep) {
        Validaciones miValidaciones = new Validaciones();
        asignarVariables(basep);
        boolean ban_confirmar = true;

        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "INGRESE UNA CODIGO DE CARTELERA");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarid(Cod_Cartelera)) {
                JOptionPane.showMessageDialog(this, "CODIGO INVALIDO");
                ban_confirmar = false;
            }
        }

        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el titulo de la pelicula");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(Titulo_pelicula)) {
                JOptionPane.showMessageDialog(this, "Titulo Pelicula invalido");
                ban_confirmar = false;
            }
        }

        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una dato");
            ban_confirmar = false;
        }

        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una dato");
            ban_confirmar = false;
        }

        return ban_confirmar;
    }

    public void asignarVariables(ObjectContainer basep) {
        Cod_Cartelera = jTextField1.getText();
        Titulo_pelicula = jTextField2.getText();
        Genero = jComboBox1.getSelectedItem().toString();
        Clasificacion = jComboBox2.getSelectedItem().toString();

        String day = String.valueOf(dia);
        String Mounth = String.valueOf(mes);
        String Year = String.valueOf(anio);

        if (String.valueOf(dia_cli).length() == 1) {
            day = "0" + day;
        }
        if (String.valueOf(mes_cli).length() == 1) {
            Mounth = "0" + Mounth;
        }
        if (String.valueOf(anio_cli).length() == 1) {
            Year = "0" + Year;
        }

        Fecha_estreno = day + " / " + Mounth + " / " + Year;

    }

    public static int Comprobar_cartelera(ObjectContainer basep, String cedula) {

        Cartelera Clbuscar = new Cartelera(null, null, null, null, null, 0, 0, 0);

        ObjectSet result = basep.get(Clbuscar);

        return result.size();
    }

    public void Modificar_cartelera(ObjectContainer basep) {

        if (!validarCampos(basep)) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
            //LimpiarCamposdeTexto();

        } else {
            if (validarCampos(basep)) {

                Cartelera Clmod = new Cartelera(jTextField1.getText(), null, null, null, null, 0, 0, 0);
                ObjectSet result = basep.get(Clmod);
                Cartelera Clmodificar = (Cartelera) result.next();

                Clmodificar.setTitulo_pelicula(jTextField2.getText());
                Clmodificar.setGenero(jComboBox1.getSelectedItem().toString());
                Clmodificar.setClasificacion(jComboBox2.getSelectedItem().toString());
                Clmodificar.setFecha_estreno(Fecha_estreno);
                Clmodificar.setDia((Integer) dia_cli.getValue());
                Clmodificar.setMes((Integer) mes_cli.getValue());
                Clmodificar.setAnio((Integer) anio_cli.getValue());

                basep.set(Clmodificar);
                JOptionPane.showMessageDialog(null, "El cliente fue modificado exitosamente");
                LimpiarCamposTexto();

            }
        }
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }

    public void LimpiarCamposTexto() {
        jTextField2.setText("");
        jTextField1.setText("");
        dia_cli.setValue(0);
        mes_cli.setValue(0);
        anio_cli.setValue(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
    }

    public void HabilitarCampos_deTexto() {
        jTextField2.setEditable(true);
        jTextField1.setEditable(true);
        jComboBox2.setEditable(true);
        jComboBox1.setEditable(true);
      

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JSpinner anio_cli;
    private javax.swing.JSpinner dia_cli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JSpinner mes_cli;
    // End of variables declaration//GEN-END:variables
}
