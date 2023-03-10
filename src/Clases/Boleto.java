/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author EDU
 */
public class Boleto {
    
    private String Id_boleto;
    private String Id_sala;
    private String Cedula_Cliente;
    private String Titulo_pelicula;
    private String Id_empleado;
    private String hora_ini_pelicula;
    private int num_asiento;
    private String nombre_cine;
    private String Id_funcion;
    private String tipo_genero;
    private String fecha_compra;
    private String hora_compra;

    public Boleto(String Id_boleto, String Id_sala, String Cedula_Cliente, String Titulo_pelicula, String Id_empleado, String hora_ini_pelicula, int num_asiento, String nombre_cine, String Id_funcion, String tipo_genero, String fecha_compra, String hora_compra) {
        this.Id_boleto = Id_boleto;
        this.Id_sala = Id_sala;
        this.Cedula_Cliente = Cedula_Cliente;
        this.Titulo_pelicula = Titulo_pelicula;
        this.Id_empleado = Id_empleado;
        this.hora_ini_pelicula = hora_ini_pelicula;
        this.num_asiento = num_asiento;
        this.nombre_cine = nombre_cine;
        this.Id_funcion = Id_funcion;
        this.tipo_genero = tipo_genero;
        this.fecha_compra = fecha_compra;
        this.hora_compra = hora_compra;
    }

    public Boleto() {
    }
    
    

    /**
     * @return the Id_boleto
     */
    public String getId_boleto() {
        return Id_boleto;
    }

    /**
     * @param Id_boleto the Id_boleto to set
     */
    public void setId_boleto(String Id_boleto) {
        this.Id_boleto = Id_boleto;
    }

    /**
     * @return the Id_sala
     */
    public String getId_sala() {
        return Id_sala;
    }

    /**
     * @param Id_sala the Id_sala to set
     */
    public void setId_sala(String Id_sala) {
        this.Id_sala = Id_sala;
    }

    /**
     * @return the Cedula_Cliente
     */
    public String getCedula_Cliente() {
        return Cedula_Cliente;
    }

    /**
     * @param Cedula_Cliente the Cedula_Cliente to set
     */
    public void setCedula_Cliente(String Cedula_Cliente) {
        this.Cedula_Cliente = Cedula_Cliente;
    }

    /**
     * @return the Titulo_pelicula
     */
    public String getTitulo_pelicula() {
        return Titulo_pelicula;
    }

    /**
     * @param Titulo_pelicula the Titulo_pelicula to set
     */
    public void setTitulo_pelicula(String Titulo_pelicula) {
        this.Titulo_pelicula = Titulo_pelicula;
    }

    /**
     * @return the Id_empleado
     */
    public String getId_empleado() {
        return Id_empleado;
    }

    /**
     * @param Id_empleado the Id_empleado to set
     */
    public void setId_empleado(String Id_empleado) {
        this.Id_empleado = Id_empleado;
    }

    /**
     * @return the hora_ini_pelicula
     */
    public String getHora_ini_pelicula() {
        return hora_ini_pelicula;
    }

    /**
     * @param hora_ini_pelicula the hora_ini_pelicula to set
     */
    public void setHora_ini_pelicula(String hora_ini_pelicula) {
        this.hora_ini_pelicula = hora_ini_pelicula;
    }

    /**
     * @return the num_asiento
     */
    public int getNum_asiento() {
        return num_asiento;
    }

    /**
     * @param num_asiento the num_asiento to set
     */
    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }

    /**
     * @return the nombre_cine
     */
    public String getNombre_cine() {
        return nombre_cine;
    }

    /**
     * @param nombre_cine the nombre_cine to set
     */
    public void setNombre_cine(String nombre_cine) {
        this.nombre_cine = nombre_cine;
    }

    /**
     * @return the Id_funcion
     */
    public String getId_funcion() {
        return Id_funcion;
    }

    /**
     * @param Id_funcion the Id_funcion to set
     */
    public void setId_funcion(String Id_funcion) {
        this.Id_funcion = Id_funcion;
    }

    /**
     * @return the tipo_genero
     */
    public String getTipo_genero() {
        return tipo_genero;
    }

    /**
     * @param tipo_genero the tipo_genero to set
     */
    public void setTipo_genero(String tipo_genero) {
        this.tipo_genero = tipo_genero;
    }

    /**
     * @return the fecha_compra
     */
    public String getFecha_compra() {
        return fecha_compra;
    }

    /**
     * @param fecha_compra the fecha_compra to set
     */
    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    /**
     * @return the hora_compra
     */
    public String getHora_compra() {
        return hora_compra;
    }

    /**
     * @param hora_compra the hora_compra to set
     */
    public void setHora_compra(String hora_compra) {
        this.hora_compra = hora_compra;
    }

    @Override
    public String toString() {
        return "Boleto{" + "Id_boleto=" + Id_boleto + ", Id_sala=" + Id_sala + ", Cedula_Cliente=" + Cedula_Cliente + ", Titulo_pelicula=" + Titulo_pelicula + ", Id_empleado=" + Id_empleado + ", hora_ini_pelicula=" + hora_ini_pelicula + ", num_asiento=" + num_asiento + ", nombre_cine=" + nombre_cine + ", Id_funcion=" + Id_funcion + ", tipo_genero=" + tipo_genero + ", fecha_compra=" + fecha_compra + ", hora_compra=" + hora_compra + '}';
    }
    
    
    
}
